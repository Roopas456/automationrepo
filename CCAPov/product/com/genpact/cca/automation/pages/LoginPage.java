package com.genpact.cca.automation.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.genpact.cca.automation.testbase.PAGEBase;
import com.genpact.cca.automation.utils.Buffer;

public class LoginPage extends PAGEBase{
	
	WebElement ele;

	public LoginPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(css = "button[class*='dropdown']")
	public WebElement dropdown_Role;

	public WebElement getRolesByName(String name) {

		return ele = driver.findElement(By.xpath("//a[.='" + name + "']"));
	}

	@FindBy(name = "username")
	public WebElement tbx_username;

	@FindBy(name = "password")
	public WebElement tbx_password;

	@FindBy(css = "button[class$='loginButton']")
	public WebElement btn_login;

	@FindBy(css = "span[class^=profile] i")
	public WebElement icon_profile;

	public String loginToApp(String appUrl, String role, String username, String password) throws InterruptedException {
		ptr.openApp(appUrl);
		ptr.click(dropdown_Role, "Clicked on role dropdown");
		pagesync(1);
		ptr.click(getRolesByName(role), "Clicked on role");
		pagesync(2);
		ptr.type(tbx_username, username, "Entered username");
		ptr.type(tbx_password, password, "Entered password");
		ptr.click(btn_login, "Clicked on login");
		pagesync(2);
		return driver.getTitle();

	}

	public boolean verifyTitle(String actTitle) throws IOException {
		boolean flg = false;
		if (actTitle.equalsIgnoreCase(Buffer.readFromBuffer("ExpPageTitle"))) {
			flg = true;
		}
		return flg;
	}

	public boolean verifyProfile() {
		try {
			boolean flg = false;
			if (icon_profile.isDisplayed()) {
				flg = true;
			}
			return flg;
		} catch (Exception e) {
		}
		return false;
	}

	private void pagesync(int val) throws InterruptedException {

		Thread.sleep(1000 * val);
	}


}
