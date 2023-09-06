package com.cadmin.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.cadmin.pageobject.Corporatetimeoff;
import org.testng.annotations.Test;
public class TC_CorporateTimeoff extends Baseclass {

   private static Logger logger = LogManager.getLogger(TC_CorporateTimeoff.class);
   
   @Test
   public void Corporate() throws Exception
   {
	   try
		{
			Corporatetimeoff corp = new Corporatetimeoff(driver);
			corp.scheduling();
			corp.corporatetimeoff();
			corp.corpname("Test4");
			corp.corpcode("Test4");
			corp.checkboxclick();
			corp.Corporatenotes("Hello This is for testing purpose" );
		}
	   catch(Exception e)
	   {
		   logger.info("Not working");
		   Capturescreenshot(driver, "corporate");
		   
		   throw(e);
	   }
   }
   @Test
	public static void testMethod() { 
		System.out.println("Thread id for CorporateTest is=" +Thread.currentThread().getId());
	}
}

