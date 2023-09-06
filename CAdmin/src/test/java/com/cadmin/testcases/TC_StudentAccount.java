package com.cadmin.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import com.cadmin.pageobject.StudentAccount;


public class TC_StudentAccount extends Baseclass {
	private static Logger logger =  LogManager.getLogger(TC_StudentAccount.class);
	
	@Test
	public static void studentaccount() throws Exception 
	{	
		try
		{	
			//TestcaseId = "1";
			StudentAccount ss = new StudentAccount(driver);	
			ss.studentlist("10841");
			ss.studentselect();
			ss.studentfeaturedropdown();
			ss.profileclick();
			logger.info("student profile clicked properly");	
			ss.go();
			ss.profilemiddlename("T");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1050)");
			ss.studentenrollment();	
		}
	catch(Exception e)
	{
		logger.info("Not working");
		Capturescreenshot(driver, "studentaccount");
		
		throw(e);
		
	}
	}
	@Test
	public static void testMethod() { 
		System.out.println("Thread id for AccountManagementTest is=" +Thread.currentThread().getId());
	}
}
