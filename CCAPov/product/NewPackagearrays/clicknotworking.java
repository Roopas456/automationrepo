package NewPackagearrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.genpact.cca.automation.utils.RoopaJSExecutor;

public class clicknotworking {

	public static void main(String[] args) {
		
		
		WebDriver driver;
		System.out.println("Opening chrome browser");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\703236861\\OneDrive - Genpact\\test\\cca\\Automation\\CCAPov\\resources\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String S1=driver.getTitle();
		System.out.println(S1);
		// TODO Auto-generated method stub
		loginPOM login2=PageFactory.initElements(driver, loginPOM.class);
		login2.usr1.sendKeys("vasanth.chandrappa@gmail.com");
		login2.password1.sendKeys("Roopa@135");
		RoopaJSExecutor.clickElementByJS(login2.login1, driver);  //if click is not working then use JS Executor,where all the 
		//methods are defined
   //login2.login1.click();
		
		
		// TODO Auto-generated method stub

	}

}
