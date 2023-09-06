package cAdmin;

import java.awt.AWTException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class Reportcenter extends Baseclass {
	@Test(priority = 2)
	public void report() throws InterruptedException, AWTException {
		driver.findElement(By.xpath("//li[@id='ReportCenterSideMenu']")).click();
		// Business Report click
		driver.findElement(By.xpath("//a[@class='ReportCenter_BusinessReports ']")).click();
		// *Student Event logs
		
		  driver.findElement(By.xpath("//div[@id='startDatePicker_reportStudentEventLogs']")).click();
		  driver.findElement(By.xpath("//td[@class='today day']")).click();
		  driver.findElement(By.xpath("//div[@id='endDatePicker_reportStudentEventLogs']")).click();
		  driver.findElement(By.xpath("//td[@class='new disabled day'][normalize-space()='1']")).click();
		  driver.findElement(By.xpath("//a[normalize-space()='Export Into Excel']")).
		  click();
		  System.out.println("Hello1");
		 
		// *Student Data Export Report
		
		  driver.findElement(By.xpath("//a[contains(.,'Student Data Export')]")).click();
		  driver.findElement(By.xpath("//label[normalize-space()='Date Activated']")).
		  click(); 
		  // Scroll down the page by 200 pixels
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("window.scrollBy(0,200)");
		  driver.findElement(By.xpath("//div//input[@id='txtStudentcreationdaterange']")).click(); 
		  driver.findElement( By.xpath("//div[contains(@class,'daterangepicker dropdown-menu ltr show-calendar opensright')][1]")) .click(); 
		  //Click on Calendar field 
		  driver.findElement(By.xpath("//input[@class='input-mini form-control active']")).click();
		 //Selecting particular date 12-14
		  driver.findElement(By.xpath("//div[@class='calendar left']"));
		 driver.findElement(By.xpath("//td[@data-title='r1c5'][contains(.,'12')]")).click(); 
		 // Scroll down the page by 1500 pixels 
		  JavascriptExecutor jse = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,1500)"); 
		  Wait <WebDriver> wait= new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(50))
		                                                          .pollingEvery(Duration.ofSeconds(10))
		                                                          .ignoring(NoSuchElementException.class);
		  
		  WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Filter Students')]"))); 
		  element.click(); 
		 //Select Students
		 driver.findElement(By.xpath("//label[normalize-space()='Test, Dsstest60']")).click(); 
		 //Select fields
		  driver.findElement(By.xpath("//label[normalize-space()='Assign To Location']" )).click(); 
		  driver.findElement(By.xpath("//a[contains(@class,'vert-offset-top-1')][contains(text(),'Export')]")).click();
		  System.out.println("Hello2");
		 
		//*All BTW Hours Completed Report
		  JavascriptExecutor jsa = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,-1500)"); 
		  driver.findElement(By.xpath("//a[normalize-space()='All BTW Hours Completed']")).click(); 
		  // Start Date
		   driver.findElement(By.xpath(
		  "//div[@id='startDatePicker_reportBTWHoursCompleted']")).click();
		  driver.findElement(By.xpath("//div[@class='datepicker-days']"));
		  driver.findElement(By.xpath("//td[@class='day'][normalize-space()='2']")).
		  click(); // End date 
		  driver.findElement(By.xpath("//div[@id='endDatePicker_reportBTWHoursCompleted']")).click();
		  driver.findElement(By.xpath("//div[@class='datepicker-days']"));
		  driver.findElement(By.xpath("//td[contains(@class,'day')][normalize-space()='12']")).click();
		  driver.findElement(By.xpath("//a[normalize-space()='Export Into Excel']")).
		  click();
		  System.out.println("Hello3");
		
		  //*Student updated permit report
		  driver.findElement(By.xpath("//a[@class='reportstudenteventlog'][contains(.,'Student Updated Permit')]")).click(); 
		  driver.findElement(By.xpath("//input[@id='txt_reportStudentUpdatedPermit_StudentName']")).sendKeys("County, DSStest "); 
		  //Start Date 
		  driver.findElement(By.xpath("//div[@id='startDatePicker_reportStudentUpdatedPermit']")).click();
		  driver.findElement(By.xpath("//div[@class='datepicker-days']"));
		  driver.findElement(By.xpath("//td[@class='day'][normalize-space()='1']")).click(); 
		  //End Date 
		  driver.findElement(By.xpath("//div[@id='endDatePicker_reportStudentUpdatedPermit']")).click();
		 driver.findElement(By.xpath("//div[@class='datepicker-days']"));
		  driver.findElement(By.xpath("//td[@class='day'][normalize-space()='14']")).click();
		  
		 driver.findElement(By.xpath("//a[normalize-space()='Export Into Excel']")).click();
		 System.out.println("Hello4");
		 
		// *Print Receipts Report
		driver.findElement(By.xpath("//a[contains(.,'Print Receipts')]")).click();
		// CR List
		driver.findElement(By.xpath("//a[normalize-space()='Select Class Room']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='111CR']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Select Class Room']")).click();
		// Filter students
		driver.findElement(By.xpath("//a[normalize-space()='Filter Student']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Select Student']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'icheck-list-Student')]//label[contains(text(),'Select All')]")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Select Student']")).click();
		// Download Report
		driver.findElement(By.xpath("//a[normalize-space()='Download PDF']")).click();
		System.out.println("Hello5");
		
		//*Classroom Information details report
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[.='Classroom Information Details']")).click();
		//Select dates 
		driver.findElement(By.xpath("//div[@id='startDatePicker_reportClassRoomDetails']")).click();
		driver.findElement(By.xpath("//div[@class='datepicker-days']"));
		driver.findElement(By.xpath("//tr//td[@class='day'][normalize-space()='1']")).click();
		//To date
		driver.findElement(By.xpath("//div[@id='endDatePicker_reportClassRoomDetails']")).click();
		driver.findElement(By.xpath("//div[@class='datepicker-days']"));
		driver.findElement(By.xpath("//tr//td[@class='day'][normalize-space()='31']")).click();
		//Export to excel
		driver.findElement(By.xpath("//a[@class='btn green text-center']")).click();
		System.out.println("Hello6");
		
		//*Signed Documents Report
		driver.findElement(By.xpath("//a[contains(.,'Signed Documents')]")).click();
		//Select student
		driver.findElement(By.xpath("//input[@id='txtLastnameSignedDocuments']")).sendKeys("Test111");
		driver.findElement(By.xpath("//div[@id='searchSignedDocuments']//a[contains(@class,'btn green')][normalize-space()='Filter Student']")).click();
		System.out.println("Hello7");
		
		//*Attendance sheet Report
		driver.findElement(By.xpath("//td[contains(.,'Attendance Sheet Report')]")).click();
		//Select class
		driver.findElement(By.xpath("//span//input[@id='txtSearchClasses']")).sendKeys("test 34");
		driver.findElement(By.xpath("//div//ul//li[contains(text(),'test 34')]")).click();
		//Download Report
		driver.findElement(By.xpath("//a[@class='btn green ']")).click();
		System.out.println("Hello8");
		
		//*Upcoming Task Report
		driver.findElement(By.xpath("//a[@data-reportid='11']")).click();
		//Selecting task name
		driver.findElement(By.xpath("//button[normalize-space()='Select Staff Name']")).click();
		
	}
}
