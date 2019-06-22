package NewPackagearrays;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelements {

	public static void main(String[] args)
	{
		
		WebDriver driver;
		System.out.println("Opening chrome browser");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\703236861\\OneDrive - Genpact\\test\\cca\\Automation\\CCAPov\\resources\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String S1=driver.getTitle();
		System.out.println(S1);
		
		//WebElement singlelink1=driver.findElement(By.tagName("a"));
		//To store all links in 1 variable in the FB page,import java .util
		List<WebElement> links1=driver.findElements(By.tagName("a"));
		for(WebElement a1:links1)
		{
			System.out.println(a1.getText());
			
			
		}

	}

}
