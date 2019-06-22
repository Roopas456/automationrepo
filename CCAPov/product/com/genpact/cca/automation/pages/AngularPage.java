package com.genpact.cca.automation.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.genpact.cca.automation.testbase.PAGEBase;
import com.genpact.cca.automation.utils.Buffer;

public class AngularPage extends PAGEBase{

	WebElement ele;
	WebDriver driver;
	@CacheLookup
	@FindBy(xpath = "//*[@placeholder='Enter a name here']")
	public WebElement tbx_value;
	
	
	public AngularPage(WebDriver driver) {
		super(driver);
	}
	
	
	
	public boolean verifyTitle(String actTitle) throws IOException {
		boolean flg = false;
		if (actTitle.equalsIgnoreCase(Buffer.readFromBuffer("ExpPageTitle"))) {
			flg = true;
		}
		return flg;
	}
	
	
	
	

}
