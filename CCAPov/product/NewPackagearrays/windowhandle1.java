package NewPackagearrays;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle1 {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\703236861\\OneDrive - Genpact\\test\\cca\\Automation\\CCAPov\\resources\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		//*[@id="parentdiv"]/img
		WebElement popup1=driver.findElement(By.xpath("//*[@id=\'parentdiv\']/img"));
		popup1.click();
		driver.findElement(By.xpath("//a[@class='homeloginbtn']")).click();
		// TODO Auto-generated method stub
   String Parent=driver.getWindowHandle();
   Set<String> childs=driver.getWindowHandles();
   for(String window:childs)
   {
	   
	   driver.switchTo().window(window);
	   
   }
   
   System.out.println(driver.getTitle());
   driver.close();
   driver.switchTo().window(Parent);
   System.out.println(driver.getTitle());
   
	}

}
