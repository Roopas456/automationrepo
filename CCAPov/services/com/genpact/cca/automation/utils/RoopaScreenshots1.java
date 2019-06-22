package com.genpact.cca.automation.utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

//import net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.InitializationHandler.Creating;

public class RoopaScreenshots1 {
	
	
	//Creating a method getScreenshot and passing two parameters 
	//driver and screenshotName
	public static String getScreenshot(WebDriver driver, String screenshotName) throws Exception
	{
	//below line is just to append the date format with the screenshot name to avoid duplicate names 
	String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

	TakesScreenshot ts = (TakesScreenshot) driver;   //typecasting ,where its changing the type driver to type screenshots

	File source = ts.getScreenshotAs(OutputType.FILE);   //sreenshots will be of type FILE

	//after execution, you could see a folder "FailedTestsScreenshots" under src folder
	String destination = System.getProperty("user.dir") + "//Failedtestscreenshots//"+screenshotName+dateName+".png";
	File finalDestination = new File(destination);    //we are taking screenshots of failed,and its placed in a path here
	//FileUtils.copyFile(source, finalDestination);
	FileHandler.copy(source, finalDestination);
	//Returns the captured file path
	return destination;
	}

}
