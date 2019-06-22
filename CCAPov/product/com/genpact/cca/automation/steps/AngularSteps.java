package com.genpact.cca.automation.steps;

import com.genpact.cca.automation.pages.AngularPage;
import com.genpact.cca.automation.testbase.UIBase;
import com.genpact.cca.automation.utils.Log;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AngularSteps extends UIBase{
	
	AngularPage ap = new AngularPage(driver);
	

	@Given("^open to the application$")
	public void open_to_the_application() throws Throwable {
		Log.startTestCase("open");
		driver.get("https://angularjs.org/");
		pageSync(2);
		ptr.reportPass(Thread.currentThread().getStackTrace()[1].getMethodName(), "successfully opened");
	}
	
	@When("^page is opened$")
	public void page_is_opened() throws Throwable {
		ptr.reportPass(Thread.currentThread().getStackTrace()[1].getMethodName(), "successfully opened");
		pageSync(2);
		ptr.takeScreenshotAtEndOfTest(driver, "Angular");
	}

	@Then("^Verify title$")
	public void verify_title() throws Throwable {
		
	}
	
	@Then("^enter value in \"([^\"]*)\"$")
	public void enter_value_in(String arg1) throws Throwable {
		
	}
	
	private void pageSync(int val) throws InterruptedException {
		Thread.sleep(val * 1000);
	}
}
