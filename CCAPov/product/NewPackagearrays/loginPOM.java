package NewPackagearrays;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginPOM {
	
	
	@FindBy(how=How.ID,using="email")
	public WebElement usr1;
	
	@FindBy(how=How.ID,using ="pass")
	public WebElement password1;
	
	@FindBy(how=How.XPATH,using ="//input[@value='Log In']")
	public WebElement login1;
	

}
