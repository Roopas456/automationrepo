package NewPackagearrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class softassert {
	
	@Test
	void validate ()
	{
		
		WebDriver driver;
		System.out.println("Opening chrome browser");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\703236861\\OneDrive - Genpact\\test\\cca\\Automation\\CCAPov\\resources\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(" validating title");
		Assert.assertEquals(driver.getTitle(), "google");   // this is hard assert,it will not execute next step as it is failing
		//in above step so use sft assert
		System.out.println("Gain validating title");
		Assert.assertEquals(driver.getTitle(), "Google");
		
	}

}
