package cAdmin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class schedule extends Baseclass 
{
	@Test(priority=2)
	public void schedul()
	{
		driver.findElement(By.xpath("//li[@id='li_scheduingmenu']")).click();
		//Schedule as student 
		driver.findElement(By.xpath("//li[@id='scheduling_drives_li']")).click();
		//Single Instructor
		driver.findElement(By.xpath("//a[normalize-space()='Single Instructor']")).click();
		//checking schedule
		//Instructor field open
		driver.findElement(By.xpath("//a[normalize-space()='Instructor Selection']")).click();
		driver.findElement(By.xpath("//button[@data-id='drp_Mode_SingleInst_InsForFilteringrecord']")).click();
		//Instructor selection
		driver.findElement(By.xpath("//div[@class='btn-group bootstrap-select bs-select form-control dropup open']//ul[@role='menu']")).click();
		//schedule click
		driver.findElement(By.xpath("//button[@class='btn green mt-1']")).click();
		
	}
	@Test(priority=3)
	public void managetimeslot()
	{
		driver.findElement(By.xpath("//li[@id='li_scheduling_managetimeslots']")).click();
		driver.findElement(By.xpath("//li[@id='li_scheduling_managetimeslots_bulkappointments']")).click();
		driver.findElement(By.xpath("//li[@id='li_scheduling_managetimeslots_opentimeslot']")).click();
	}
	@Test(priority=4)
	public void corporategrp()
	{
		driver.findElement(By.xpath("//li[@id='scheduling_corporatetimeoff_li']")).click();
		//Add new
		By locator = By.xpath("//a[@class='btn green btn-sm']");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		WebElement en = driver.findElement(locator);
	    en.click();
		//making corporate group
		driver.findElement(By.xpath("//input[@id='corpTimeOffGrpName']")).sendKeys("Dsstest28");
		driver.findElement(By.xpath("//button[@title='Select Status']")).click();
		//selecting status active
		driver.findElement(By.xpath("//li//a[.='Active']")).click();
		//code 
		driver.findElement(By.xpath("//input[@id='corpTimeoffCode']")).sendKeys("1234");
		//Type
		driver.findElement(By.xpath("//button[@data-id='corpTimeoffType']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Federal Holiday']")).click();
		//Date selection
		driver.findElement(By.xpath("//input[@id='corpTimeoffAffectedDt']")).click();
		driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-orient-left datepicker-orient-bottom']")).click();
		driver.findElement(By.xpath("//td[@class='active day']")).click();
		//Checkboxes
		WebElement Checkbox1= driver.findElement(By.xpath("//div[contains(@class,'col-md-8 pr-0 col-xs-12')]//label[contains(@class,'pointer')][normalize-space()='Yes']"));
		Checkbox1.click();
		WebElement Checkbox2 = driver.findElement(By.xpath("//div[@id='divAutoAssignToNewStaff']//label[contains(@class,'cssradio mr-1 pointer')][normalize-space()='Yes']//span[contains(@class,'radiomark')]"));
		Checkbox2.click();
		WebElement Checkbox3 = driver.findElement(By.xpath("//div[@id='divApplyToAllTeachingStaff']//label[@class='cssradio mr-1 pointer'][normalize-space()='Yes']//span[@class='radiomark']"));
		Checkbox3.click();
		//Notes
		driver.findElement(By.xpath("//input[@id='txtCorpTimeOffNotes']")).sendKeys("Hello..This is for Testing purpose");
		driver.findElement(By.id("btnSave")).click();
		
	}
		@Test(priority=5)
		public void appt()
		{
			
			driver.findElement(By.xpath("//li[@id='li_Staff_appointment_daily_List']\"")).click();
			//start date end date is selected 
			//Type 
			driver.findElement(By.xpath("//button[@id='ActiviyTypeDDLHeader']")).click();
			//BTW select
			driver.findElement(By.xpath("//a[@value='1']")).click();
			//search
			driver.findElement(By.xpath("//button[@id='btnSearchActivityLogs']")).click();
			driver.findElement(By.xpath("//a[contains(text(),'DOMAIN,')]")).click();
		}
	
	}
	
