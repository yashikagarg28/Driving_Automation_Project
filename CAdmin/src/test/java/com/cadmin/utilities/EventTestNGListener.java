package com.cadmin.utilities;
import java.io.File;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class EventTestNGListener implements ITestListener {
   private static ExtentReports extent;
   private static  ExtentTest test;

   @Override
   public void onStart(ITestContext context)
   {
	   String reportfilename= "ExtentReport.html";
	   ExtentSparkReporter htmlreporter = new ExtentSparkReporter(reportfilename);
	   extent = new ExtentReports();
	   extent.attachReporter(htmlreporter);
	   htmlreporter.config().setTheme(Theme.DARK);
   }
   @Override
   public void onFinish(ITestContext context)
   {
	   extent.flush();
   }
   @Override
   public void onTestStart(ITestResult result)
   {
	   test = extent.createTest(result.getMethod().getMethodName());
	   test.log(Status.PASS,MarkupHelper.createLabel("Name of passed test case:" + result.getName(), ExtentColor.GREEN));

   }
   @Override
   public void onTestFailure(ITestResult result)
   {
	   test = extent.createTest(result.getMethod().getMethodName());
	   test.log(Status.FAIL,MarkupHelper.createLabel("Name of failed test case:" + result.getName(), ExtentColor.RED));
       String screenshotPath = System.getProperty("user.dir") + "\\screenshots\\" +result.getName() + ".png";
       File screenshotfile = new File(screenshotPath);
   	   if(screenshotfile.exists())
   	{
   		test.fail("Captured Screenshot is below:=" + test.addScreenCaptureFromPath(screenshotPath));
   	}
   }
   @Override
   public void onTestSkipped(ITestResult result) {
	   test = extent.createTest(result.getMethod().getMethodName());
	   test.log(Status.SKIP,MarkupHelper.createLabel("Name of passed test case:" + result.getName(), ExtentColor.ORANGE));
	   System.out.println("Name of test Skipped " +result.getName());

   }
}
