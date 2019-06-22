package com.genpact.cca.automation.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login1 {
	@Given("^login to the FB application$")
	public void login_to_the_FB_application() throws Throwable {
	    System.out.println("login");
	}

	@When("^FB icon is visible$")
	public void fb_icon_is_visible() throws Throwable {
		  System.out.println("visiblen");
	}

	@Then("^verify the page title$")
	public void verify_the_page_title() throws Throwable {
		  System.out.println("title");
	}

}
