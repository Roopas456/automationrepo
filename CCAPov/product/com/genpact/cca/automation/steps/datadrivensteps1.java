package com.genpact.cca.automation.steps;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class datadrivensteps1
{	
	@Given("^login to my application$")
	public void login_to_the_application() throws Throwable {
	    System.out.println("Login");
	}

	@When("^User  search product \"([^\"]*)\"$")
	public void user_search_product(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	//	WebDriver driver=null;
	//	driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys(arg1);
		System.out.println("User search product" +arg1);
	}

	@When("^Add to cart$")
	public void add_to_cart() throws Throwable {
	   System.out.println("Add to cart");
	}

	@When("^click on buy now$")
	public void click_on_buy_now() throws Throwable {
	    System.out.println("buy now");
	}

	@When("^Click on place order$")
	public void click_on_place_order() throws Throwable {
	 System.out.println("click place order");
	}

	@Then("^user should be able to place order$")
	public void user_should_be_able_to_place_order() throws Throwable {
	  System.out.println("final order placed");
	}


}
