package com.cadmin.testcases;

import java.time.Duration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.cadmin.pageobject.*;
import org.testng.Assert;


public class TC_Assignment extends Baseclass {          
private static Logger logger =  LogManager.getLogger(TC_AccountManagement.class);
@Test
public void Assignmentt() throws Exception
{
	try
	{
		AssignmentPageObject obj = new AssignmentPageObject(driver);
		obj.Table();
		obj.json("[{\"name\" : \"Bob\", \"age\" : 20, \"gender\": \"male\"}, {\"name\": \"George\", \"age\" : 42, \"gender\": \"male\"}, {\"name\":\r\n"
				+ "\"Sara\", \"age\" : 42, \"gender\": \"female\"}, {\"name\": \"Conor\", \"age\" : 40, \"gender\": \"male\"}, {\"name\":\r\n"
				+ "\"Jennifer\", \"age\" : 42, \"gender\": \"female\"}]");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		obj.refresh();
		//Asserting the values entered in table
		WebElement actualElement = driver.findElement(By.xpath("//td[normalize-space()='Bob']"));
		String actualText = actualElement.getText();
		String expectedText = "Bob";
		Assert.assertEquals(expectedText, actualText);
	}
	catch(Exception e)
	{
		logger.info("Not working");
		 Capturescreenshot(driver, "Assign");
		   
		   throw(e);
	}
}
}

