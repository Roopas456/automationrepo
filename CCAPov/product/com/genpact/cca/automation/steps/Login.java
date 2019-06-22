package com.genpact.cca.automation.steps;

import org.testng.asserts.SoftAssert;

import com.genpact.cca.automation.pages.LoginPage;
import com.genpact.cca.automation.testbase.UIBase;
import com.genpact.cca.automation.utils.Buffer;
import com.genpact.cca.automation.utils.Log;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login extends UIBase{
	
	LoginPage lp = new LoginPage(driver);
	SoftAssert verify = new SoftAssert();

	@Given("^login to the application$")
	public void login_to_the_application() throws Throwable {
		Log.startTestCase("Login");
		try {

			lp.loginToApp(Buffer.readFromBuffer("Url"), Buffer.readFromBuffer("role"),
					Buffer.readFromBuffer("username"), Buffer.readFromBuffer("password"));
			ptr.reportPass(Thread.currentThread().getStackTrace()[1].getMethodName().toUpperCase(),
					"Logged in successfully");
		}
		catch (Exception e)
		{

			// ptr.reportFail(Thread.currentThread().getStackTrace()[1].getMethodName(), "",
			// e, true);
			throw e;
		}
	}

	@When("^Profile icon is visible$")
	public void profile_icon_is_visible() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("when part");
	}

	@Then("^Verify the page title$")
	public void verify_the_page_title() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("when part");
	}

}
