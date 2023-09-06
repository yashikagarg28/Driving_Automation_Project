package com.cadmin.testcases;

import java.time.Duration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.cadmin.pageobject.Accountmanagement;
import org.testng.annotations.Test;

public class TC_AccountManagement extends Baseclass {
	private static Logger logger =  LogManager.getLogger(TC_AccountManagement.class);
	@Test
	public void Account() throws Exception
	{
		try
		{
			TestcaseId = "2";
			Accountmanagement account = new Accountmanagement(driver);
			account.Accountmanage();	
			account.service();
			account.Product();
			account.AddingProductDetails("vb");
            account.Price("89");
			account.Discount("bn");
			account.Discount1("412");
			account.Miscellenous("gh");
			account.Packages("vb");
			account.Packages1("Test@2803");
			account.Locations("zxsjdr");
			account.HighSchool("rsdo");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    account.Howdidyouhear("Test0089");
			account.Vehicle("Tesvtl");
			
		}
		catch(Exception e)
		{
			logger.info("Account Management not working");
			Capturescreenshot(driver, "Account");
			
			
			throw(e);
		}
		
	}
	@Test
	public void testMethod() { 
		System.out.println("Thread id for AccountManagementTest is=" +Thread.currentThread().getId());
	}
}
