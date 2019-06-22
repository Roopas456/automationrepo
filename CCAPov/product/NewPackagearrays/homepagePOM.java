package NewPackagearrays;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class homepagePOM {
	
	////*[@id="userNavigationLabel"]
	
	@FindBy(how=How.XPATH,using="//*[@id=\'userNavigationLabel\']")
	public WebElement seeting1;
	
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"js_7m\"]/div/div/ul/li[8]/a/span/span")
	public WebElement logout1;
	
	
}
