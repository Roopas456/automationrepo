package com.genpact.cca.automation.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWriteConfig1 {

	public static void main(String[] args) throws IOException 
	{
		

	FileInputStream fis=new FileInputStream("C:\\Users\\703236861\\OneDrive - Genpact\\test\\cca\\Automation\\CCAPov\\resources\\config1.properties");

	Properties pro=new Properties();
	
	pro.put("browser", "chrome");
	
	FileOutputStream fout = new FileOutputStream("C:\\Users\\703236861\\OneDrive - Genpact\\test\\cca\\Automation\\CCAPov\\resources\\config1.properties");
	
	pro.store(fout, "");
	fout.close();
	
	
	
		
		
	}

}
