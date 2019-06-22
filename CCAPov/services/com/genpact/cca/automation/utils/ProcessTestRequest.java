package com.genpact.cca.automation.utils;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.listener.Reporter;

public class ProcessTestRequest {

	public Properties prop;
	public Actions action;
	public WebDriver driver;
	public JavascriptExecutor JSExec;
	WebDriverWait wait;

	public void openApp(String url) {
		Log.info("Launching application...");
		driver.get(url);
	}

	public ProcessTestRequest() {

	}

	public ProcessTestRequest(WebDriver driver) {
		this.driver = driver;
	}

	public void switchToFrame(WebElement ele) {
		Log.info("Switching to frame...");
		driver.switchTo().frame(ele);
	}

	public void closeAllBrowsers() {
		Log.info("Closing browsers...");
		driver.quit();
	}

	public void closeBrowser() {
		Log.info("Closing current browser...");
		driver.close();
	}

	public String getLocator(WebElement element) {
		try {
			Object proxyOrigin = FieldUtils.readField(element, "h", true);
			Object locator = FieldUtils.readField(proxyOrigin, "locator", true);
			Object findBy = FieldUtils.readField(locator, "by", true);
			if (findBy != null) {
				return findBy.toString();
			}
		} catch (IllegalAccessException ignored) {
		}
		return "[unknown]";
	}

	public void reportPass(String stepName, String desc) throws ClassNotFoundException, IOException {
		Reporter.addStepLog(desc);
		Log.info(desc);

	}

	public void reportInfo(String stepName, String desc) throws ClassNotFoundException, IOException {
		Reporter.addStepLog(desc);
		Log.info(desc);

	}

	public void reportFail(String stepName, String desc, Exception e, boolean screenshot)
			throws ClassNotFoundException, IOException {

		if (screenshot) {
			Reporter.addStepLog("Failed To : " + stepName);
			StringWriter errors = new StringWriter();
			e.printStackTrace(new PrintWriter(errors));
			Reporter.addStepLog(desc);
			Reporter.addStepLog(" " + errors);
			Reporter.addScreenCaptureFromPath(ProcessTestRequest.takeScreenshotAtEndOfTest(driver, stepName));

			Log.info(desc);
			Log.info(" " + errors);
			Log.FailedTestCase(stepName);
		} else {
			Reporter.addStepLog("Failed To : " + stepName);
			StringWriter errors = new StringWriter();
			e.printStackTrace(new PrintWriter(errors));
			Reporter.addStepLog(desc);
			Reporter.addStepLog(" " + errors);
			Log.info(desc);
			Log.info(" " + errors);
			Log.FailedTestCase(stepName);

		}

	}

	public void waitForElement(WebElement ele) {
		wait = new WebDriverWait(driver, 60, 5);
		String val = null;
		try {
			if (getLocator(ele).contains("xpath")) {
				val = getLocator(ele).substring(getLocator(ele).indexOf(" ") + 1, getLocator(ele).length());
				wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(val)));
			} else if (getLocator(ele).contains("css")) {
				val = getLocator(ele).substring(getLocator(ele).indexOf(" ") + 1, getLocator(ele).length());
				wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(val)));
			} else if (getLocator(ele).contains("id")) {
				val = getLocator(ele).substring(getLocator(ele).indexOf(" ") + 1, getLocator(ele).length());
				wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id(val)));
			} else if (getLocator(ele).contains("name")) {
				val = getLocator(ele).substring(getLocator(ele).indexOf(" ") + 1, getLocator(ele).length());
				wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name(val)));
			}
		} catch (Exception e) {
			wait.until(ExpectedConditions.visibilityOf(ele));
		}
	}

	public void waitUntilElementInvisible(WebElement ele) {
		wait = new WebDriverWait(driver, 60, 5);
		String val = null;
		if (getLocator(ele).contains("xpath")) {
			val = getLocator(ele).substring(getLocator(ele).indexOf(" ") + 1, getLocator(ele).length());
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(val)));
		} else if (getLocator(ele).contains("css")) {
			val = getLocator(ele).substring(getLocator(ele).indexOf(" ") + 1, getLocator(ele).length());
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(val)));
		} else if (getLocator(ele).contains("id")) {
			val = getLocator(ele).substring(getLocator(ele).indexOf(" ") + 1, getLocator(ele).length());
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(val)));
		} else if (getLocator(ele).contains("name")) {
			val = getLocator(ele).substring(getLocator(ele).indexOf(" ") + 1, getLocator(ele).length());
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.name(val)));
		}
	}

	public static String getCurrentTime() {
		String CTime = java.time.LocalTime.now().toString();
		return CTime.replace(":", "").replace(".", "").substring(4, 8);
	}

	public static String takeScreenshotAtEndOfTest(WebDriver driver, String screenshotName)
			throws IOException, ClassNotFoundException {
		Log.info("Taking screenshot...");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "/target/screenshots/" + screenshotName + ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	}

	public void dragAnddrop(WebElement source, WebElement target) {
		Log.info("Drag and drop ...");
		action = new Actions(driver);
		action.dragAndDrop(source, target);
	}

	public void Select_VisibleText(WebElement element, String VisibleText, String stepDesc) {
		Log.info("Selecting option by name...");
		Select selObj = new Select(element);
		highlightElement(driver, element);
		selObj.selectByVisibleText(VisibleText);
		Log.info(stepDesc);
	}

	public void Select_FirstOption(WebElement element) {
		Log.info("Selecting first option...");
		Select selObj = new Select(element);
		highlightElement(driver, element);
		selObj.selectByIndex(0);

	}

	// select the dropdown using "select by index", so pass IndexValue as '2'
	public void Select_IndexValue(WebElement element, int IndexValue) {
		Log.info("Selecting option by index...");
		Select selObj = new Select(element);
		highlightElement(driver, element);
		selObj.selectByIndex(IndexValue);
		;
	}

	// select the dropdown using "select by value"
	public void Select_Value(WebElement element, String Value) {
		Log.info("Selecting option by value...");
		Select selObj = new Select(element);
		highlightElement(driver, element);
		selObj.selectByValue(Value);
	}

	public void sendEnter() {
		Log.info("Pressing enter...");
		action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		Log.info("Pressed enter");
	}

	public void clickAt(WebElement ele) {
		Log.info("Clicking element using action...");
		action = new Actions(driver);
		action.moveToElement(ele).click().build().perform();
	}

	public void click(WebElement ele, String stepDesc) {
		Log.info("Clicking element...");
		try {
			highlightElement(driver, ele);
			ele.click();
			Log.info(stepDesc);
		} catch (Exception e) {

		}
	}

	public void jClick(WebElement ele, String stepDesc) {
		try {
			highlightElement(driver, ele);
			JSExec = (JavascriptExecutor) driver;
			JSExec.executeScript("arguments[0].click();", ele);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void type(WebElement ele, String val, String stepDesc) {
		try {
			highlightElement(driver, ele);
			ele.clear();
			ele.sendKeys(val);
			Log.info(stepDesc);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void highlightElement(WebDriver driver, WebElement element) {
		// Creating JavaScriptExecuter Interface
		JSExec = (JavascriptExecutor) driver;
		JSExec.executeScript("arguments[0].style.border='6px groove yellow'", element);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		JSExec.executeScript("arguments[0].style.border=''", element);
	}

	public static String getRandom() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		int minutes = calendar.get(Calendar.MINUTE);
		int seconds = calendar.get(Calendar.SECOND);
		System.out.println(String.valueOf(minutes) + String.valueOf(seconds));
		return String.valueOf(minutes) + String.valueOf(seconds);
	}

}
