package com.genpact.cca.automation.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PAGEBase extends UIBase {

	public PAGEBase(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
