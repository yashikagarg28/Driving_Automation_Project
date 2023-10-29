package com.cadmin.testcases;
import java.io.File;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import com.cadmin.pageobject.loginindex;
import com.cadmin.utilities.*;
import com.qa.testrailmanager.TestRailManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.Logger;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
public class Baseclass {

	readconfig read = new readconfig();
	String url = read.getbaseURL();
	String browser = read.getBrowser();
	public static WebDriver driver;
	public Logger logger;
	protected String TestcaseId;
	
	@BeforeTest
	public void setup()
	{	
		switch(browser.toLowerCase())
		{
		case("chrome"):
		WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
		   break;
		case("firefox"):
		   WebDriverManager.firefoxdriver().setup();
		  driver = new FirefoxDriver();
		   break;
		default:
			driver = null;
			break;
		
		} 
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//logging
		 logger =  LogManager.getLogger("CAdmin");
		 
		    driver.get(url);
		    driver.manage().window().maximize();
		    logger.info("URL opened properly");
		    logger.info("Testcase started ");
			//loginindex lg = new loginindex(driver);
			//lg.enterusername("apetrov");
			//lg.enterpassword("Leader@2023");
			//logger.info("Credentials entered");
			//lg.Loginclick();
			//lg.newadmin();	
			//lg.Selectlocationfromhomepage();
	}
     @AfterTest
	public void teardown()
	{
	    driver.close();
		driver.quit();
		
	}  
     
    public static void Capturescreenshot(WebDriver driver,String testname) throws Exception
     {
    	 TakesScreenshot ts = ((TakesScreenshot)driver);
    	 File src = ts.getScreenshotAs(OutputType.FILE);
    	 String des =System.getProperty("user.dir") + "\\screenshots\\" + testname + ".png";
    	 File destination = new File(des);
         FileUtils.copyFile(src, destination);                     	 
     } 
    @AfterMethod
    public void addResultsToTestRail(ITestResult result) {
    	if(result.getStatus()== ITestResult.SUCCESS)
    	{
        TestRailManager.addResultsforTestCase(TestcaseId,TestRailManager.TEST_CASE_PASS_STATUS, "");
    	}
    	else if(result.getStatus()==ITestResult.FAILURE)
    	{
    	TestRailManager.addResultsforTestCase(TestcaseId,TestRailManager.TEST_CASE_FAIL_STATUS,"Test got failed" +result.getTestName()+":FAILED");
    	}
    }
}
