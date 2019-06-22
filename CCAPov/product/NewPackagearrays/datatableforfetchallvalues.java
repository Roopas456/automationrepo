package NewPackagearrays;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datatableforfetchallvalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver driver;
		System.out.println("Opening chrome browser");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\703236861\\OneDrive - Genpact\\test\\cca\\Automation\\CCAPov\\resources\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/table.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement table1=driver.findElement(By.xpath("//table/tbody"));
		
		//  first get the rows count// as
		List<WebElement> row_table1=driver.findElements(By.xpath("//table/tbody/tr"));
				System.out.println("numer of rows " +row_table1.size());
		
			//	now to navigate in each row
				for(int row=0;row<row_table1.size();row++)
				{
					
					List<WebElement> column_row=row_table1.get(row).findElements(By.tagName("td"));
					int coulumn_each_row1=column_row.size();
					System.out.println("column count of each row is " +coulumn_each_row1);
				
					
				//to featch value in each coulmn
				for(int cvalue =0;cvalue<coulumn_each_row1;cvalue++)
				{
					
					String celtext=column_row.get(cvalue).getText();
					
					System.out.println("row number  is" +row);
					System.out.println("column is" +cvalue+  "and column text is" +celtext );
				}
				
	//	List<WebElement> col_count1=driver.findElements(By.xpath("//table/tbody/tr/td"));
	//	System.out.println("numer of col " +col_count1.size());
				}

	}

}
