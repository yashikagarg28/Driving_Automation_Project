package com.cadmin.utilities;

import java.util.Properties;
import java.io.FileInputStream;

public class readconfig {

	Properties properties;
	String path = "C:\\Users\\yashika.garg\\eclipse-workspace\\Selenium\\TestING\\CAdmin\\Configration\\config.properties";
	
	//constructor
	public readconfig()
	{
		try
		{
		properties = new Properties();
	
			FileInputStream fis = new FileInputStream(path);
			properties.load(fis);
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String getbaseURL() 
	{
		String value = properties.getProperty("baseurl");
		if(value!= null)
			return value;
		else
			throw new RuntimeException("Not able to get  baseurl from config");
	}
	public String getBrowser() 
	{
		String value = properties.getProperty("browser");
		if(value!= null)
			return value;
		else
			throw new RuntimeException("Not able to get browser");
	}
}

