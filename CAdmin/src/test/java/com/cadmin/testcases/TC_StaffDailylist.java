package com.cadmin.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import com.cadmin.pageobject.StaffDailylist;
public class TC_StaffDailylist extends Baseclass {
	private static Logger logger = LogManager.getLogger(TC_StaffDailylist.class);
	
	@Test(dependsOnMethods = "setup",alwaysRun = true)
	public void dailylist() throws Exception
	{
		try
		{
			StaffDailylist staffD = new StaffDailylist(driver);
			staffD.scheduling();
		}
	    
	   catch(Exception e)
		{ 
		   logger.info("Not working");
		   Capturescreenshot(driver, "dailylist");
			
		   throw(e);
		}
	}
	@Test
	public void testMethod() { 
		System.out.println("Thread id for StaffTest is=" +Thread.currentThread().getId());
	}
	
}
