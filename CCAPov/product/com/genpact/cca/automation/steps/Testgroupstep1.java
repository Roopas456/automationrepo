package com.genpact.cca.automation.steps;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.genpact.cca.automation.utils.Buffer;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Testgroupstep1 {
	
	
	@Given("^Open Chrome and start Application$")
	public void open_Chrome_and_start_Application() throws Throwable {
		
		System.out.println("Opening chrome browser");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\703236861\\OneDrive - Genpact\\test\\cca\\Automation\\CCAPov\\resources\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		//driver.findElement(By.xpath(""))
	}

	@When("^Enter the Username and Password$")
	public void enter_the_Username_and_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		//String filename = "test.txt";
	//	File file = new File(filename);       
	//	String path = file.getAbsolutePath();
	//	WebDriver driver=null;
	//	System.out.println("Entering username and password");
		//WebElement Strrer1=driver.findElement(By.xpath("//input[contains(@id,'email')]"));
	//	Strrer1.sendKeys(path);
		//System.out.println("User search product" +Strrer1);
		
		
	}

	@When("^Click on the Login button$")
	public void click_on_the_Login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

	@Then("^User should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		
		System.out.println("Successfull login");
	}

	@When("^Enter the Incorrect Username and Password$")
	public void enter_the_Incorrect_Username_and_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		
		System.out.println("Incorrect user and pass");
	}

	@Then("^User should not be able to login successfully$")
	public void user_should_not_be_able_to_login_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		System.out.println("unsuccessfull");
	}

	@Given("^This is a blank test$")
	public void this_is_a_blank_test() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("blank tests");
	}


}
