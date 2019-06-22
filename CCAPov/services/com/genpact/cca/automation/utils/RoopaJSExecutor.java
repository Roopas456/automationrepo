package com.genpact.cca.automation.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RoopaJSExecutor {

	
	public static void clickElementByJS(WebElement element, WebDriver driver)
	{
	    JavascriptExecutor js = ((JavascriptExecutor) driver);
	    js.executeScript("arguments[0].click();", element);
	   
	    }
	  public static String getTitleByJS(WebDriver driver)
	{
	    JavascriptExecutor js = ((JavascriptExecutor) driver);
	    String title = js.executeScript("return document.title;").toString();
	    return title;
	    }
	 public static void scrollIntoView(WebElement element, WebDriver driver)
	{
	    JavascriptExecutor js = ((JavascriptExecutor) driver);
	    js.executeScript("arguments[0].scrollIntoView(true);", element);
	    }
	 public static void drawBorder(WebElement element, WebDriver driver)
	{
	    JavascriptExecutor js = ((JavascriptExecutor) driver);
	    js.executeScript("arguments[0].style.border='3px solid red'", element);
	    }

	
	
}
