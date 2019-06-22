package NewPackagearrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class newsoftassert {
	
	
	@Test
	void validate ()
	{
		
		SoftAssert S1=new SoftAssert();   // SoftAssert should be same name but not as tht of class
		WebDriver driver;
		System.out.println("Opening chrome browser");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\703236861\\OneDrive - Genpact\\test\\cca\\Automation\\CCAPov\\resources\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(" validating title");
		S1.assertEquals(driver.getTitle(), "Googly1");   // this is soft assert,it will now execute next step 
		//in above step so use sft assert
		System.out.println("AAAAGain validating title");
		S1.assertEquals(driver.getTitle(), "Google");
		S1.assertAll();   /// this is must after soft assertion
		
	}
	

}
