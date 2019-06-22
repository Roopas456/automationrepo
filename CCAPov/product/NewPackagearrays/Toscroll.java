package NewPackagearrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.genpact.cca.automation.utils.RoopaJSExecutor;
import com.genpact.cca.automation.utils.RoopaScreenshots1;

public class Toscroll {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		WebDriver driver;
		System.out.println("Opening chrome browser");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\703236861\\OneDrive - Genpact\\test\\cca\\Automation\\CCAPov\\resources\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		//a[contains(@title,'Visit our Help Centre.')]
		WebElement help1=driver.findElement(By.xpath("//a[contains(@title,'Visit our Help Centre.')]"));
		RoopaJSExecutor.scrollIntoView(help1, driver);  //to scroll till help Webelement
		RoopaJSExecutor.drawBorder(help1, driver);   // to draw border
		RoopaScreenshots1.getScreenshot(driver, "Issuewithhelp");  
		//to take screenshot and the "Isuuewithhelp" will be screenshot name
		//it will take screenshot of page where we are currently in,so call this in which page u want screenshot
	}

}
