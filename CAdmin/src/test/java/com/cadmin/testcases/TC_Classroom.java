package com.cadmin.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import com.cadmin.pageobject.Classroom;
public class TC_Classroom extends Baseclass
{
	private static Logger logger = LogManager.getLogger(TC_Classroom.class);
	
	@Test
	public static void classroom() throws Exception
	{
		try
		{
			//TestcaseId = "3";
			Classroom cl = new Classroom(driver);
			cl.Classroomtab("Test60");
			cl.Enrollmentsize("2");
		}
		catch(Exception e)
		{
			logger.info("Classroom test not working");
			Capturescreenshot(driver,"classroom");
			
			throw(e);
		}
	}
	
	@Test
	public static void testMethod() { 
		System.out.println("Thread id for ClassroomTest is=" +Thread.currentThread().getId());
	}
}