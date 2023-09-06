package com.cadmin.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import com.cadmin.pageobject.Registereduseraccount;
import com.cadmin.pageobject.Studentenroll;

public class TC_StudentEnroll extends Baseclass {

	private static Logger logger = LogManager.getLogger(TC_StudentEnroll.class);

	@Test
	public void enrollment() throws Exception {
		try {
			Registereduseraccount reg = new Registereduseraccount(driver);
			String s = reg.registereduser();
			System.out.println(s);
			Studentenroll en = new Studentenroll(driver);
			en.packagedropdown();
			en.packageselect();
			en.classloc();
			en.locationselect();
			en.addpackage();
			logger.info("package added");
			en.skipcl();
			logger.info("skip clicked");
			en.etype();
			logger.info("Enrolltype clicked");
			en.teen();
			logger.info("Teen program clicked");
			en.firstname("Test2");
			en.middlename("Test2");
			en.lastname("Test2");
			en.email("wejustest15@gmail.com");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1050)");
			en.save();
		}

		catch (Exception e) {
			logger.info("Not working");
			Capturescreenshot(driver, "enrollment");

			throw (e);

		}
	}
}