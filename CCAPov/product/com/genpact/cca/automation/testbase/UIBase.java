package com.genpact.cca.automation.testbase;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

import com.cucumber.listener.Reporter;
import com.genpact.cca.automation.utils.Buffer;
import com.genpact.cca.automation.utils.Constants;
import com.genpact.cca.automation.utils.ProcessTestRequest;


public class UIBase implements Constants {
	public static JavascriptExecutor JSExec;
	public static ProcessTestRequest ptr;
	public static WebDriver driver;

	@BeforeMethod
	public void launch() throws IOException {
		System.setProperty(LOG4J_KEY, LOG4J_PATH);

		if (System.getProperty("BrowserName") == null) {
			driver = setDriver(Buffer.readFromBuffer("Browser"));

		} else {
			driver = setDriver(System.getProperty("BrowserName"));
		}
		ptr = new ProcessTestRequest(driver);
	}

	@AfterMethod
	public void teardown() {
		ptr.closeBrowser();

	}

	public WebDriver setDriver(String browserName) {
		try {
			File browserDriverServer;

			switch (browserName.toLowerCase()) {
			case "chrome":
				browserDriverServer = new File(BASE_DIR + CHROME_PATH);
				System.setProperty(CHROME_KEY, browserDriverServer.getAbsolutePath());
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);

				break;
			
			}

			JSExec = (JavascriptExecutor) driver;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}

	@AfterSuite
	public void createReport() throws IOException {
		Reporter.loadXMLConfig(EXTENT_CONFIG_PATH);
		Reporter.setSystemInfo("Author", "CCA QA AUTOMATION TEAM");
		Reporter.setSystemInfo("Project", "CCA");

	}

}
