package NewPackagearrays;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datatable {

	public static void main(String[] args) {
		
		
		WebDriver driver;
		System.out.println("Opening chrome browser");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\703236861\\OneDrive - Genpact\\test\\cca\\Automation\\CCAPov\\resources\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		//*[@id="leftcontainer"]/table/thead/tr/th[1]
		WebElement table1=driver.findElement(By.xpath("//table[@class='dataTable']"));
		
		//WebElement table1=driver.findElement(By.tagName("table"));
		
		//WebElement tableRow=table1.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[3]"));
		WebElement tableRow3=table1.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[3]"));
		String rowtext3=tableRow3.getText();
		System.out.println("row text is"  +rowtext3);
		
		WebElement tableRowtext=table1.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[3]/td[1]"));
		String rowtext=tableRowtext.getText();
		System.out.println("row text is"  +rowtext);
		
		WebElement tableRowtext2=table1.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[3]/td[5]"));
		String rowtext2=tableRowtext2.getText();
		System.out.println("row text is"  +rowtext2);
		driver.close();
		
		//List<WebElement> col1=driver.findElements(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th"));
		//System.out.println("numer of columns " +col1.size());
		
		//here from the xpath //*[@id='leftcontainer']/table/thead/tr/th[1],[1] is removed to get column and its /table/thread/tr/th
		 //so num of col is 5
	//	List<WebElement> row1=driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td"));
		//System.out.println("numer of rows " +row1.size());
		//num of rows is 130
		
		//here its /table/tbody/tr/td
		
		

	}

}
