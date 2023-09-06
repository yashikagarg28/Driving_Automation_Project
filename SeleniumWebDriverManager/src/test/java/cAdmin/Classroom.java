package cAdmin;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Classroom extends Baseclass 
{
	@Test(priority=2)
	public void classroom()
	{
		//Classroom open
		driver.findElement(By.xpath("//li[@id='classroom_li']")).click();
		//Class list 
		driver.findElement(By.xpath("//li[@id='Classroom_ClassList_li']")).click();
		//search class
		driver.findElement(By.xpath("//div[@id='classListtable_filter']//input[@placeholder='Search']")).sendKeys("18756");
		//Attendance
		driver.findElement(By.xpath("//li[@id='Classroom_Attendance_li']")).click();
		//New class 
		driver.findElement(By.xpath("//li[@id='Classroom_NewClass_li']")).click();
		//make new class
		driver.findElement(By.xpath("//button[@id='drp_SessionType']")).click();
		driver.findElement(By.xpath("//a[@id='singleClassSessionmenu']")).click();
		//Class type
		driver.findElement(By.xpath("//button[@data-id='drp_Product']//span[@class='filter-option pull-left'][normalize-space()='Select']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='_311 CR']")).click();
		//Status 
		driver.findElement(By.xpath("//button[contains(@data-id,'drp_ClassroomStatus')]//span[contains(@class,'filter-option pull-left')][normalize-space()='Select']")).click();
		driver.findElement(By.xpath("//li//a[.='Open']")).click();
		//Classroom name 
		driver.findElement(By.xpath("//input[@id='txt_ClassRoomId']")).sendKeys("Dsstest50");
		//Size and Makeup
		driver.findElement(By.xpath("//input[@id='txt_EnrollmentSize']")).sendKeys("4");
		driver.findElement(By.xpath("//input[@id='txt_MakeupSize']")).sendKeys("0");
		//Location
		driver.findElement(By.xpath("//button[contains(@data-id,'drp_Location')]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='AA MAnitoba Location]")).click();
		//Start Date
		driver.findElement(By.xpath("//input[@id='dtStartDate']")).click();
		//selecting whole Datepicker
		driver.findElement(By.xpath("//div[contains(@class,'datepicker datepicker-dropdown dropdown-menu datepicker-orient-left datepicker-orient-bottom')]")).click();
		//Session types
		driver.findElement(By.xpath("//a[@class='btn blue pull-left']")).click();
		//Start time
		driver.findElement(By.xpath("//select[@id='drp_starttime1']")).click();
		driver.findElement(By.xpath("//select[@id='drp_starttime1']//option[contains(@value,'0500')][normalize-space()='5:00 AM']")).click();
		//End Time
		driver.findElement(By.xpath("//select[@id='drp_endtime1']")).click();
		driver.findElement(By.xpath("//select[@id='drp_endtime1']//option[@value='0700'][normalize-space()='7:00 AM']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='SAVE']")).click();
		//Save
		driver.findElement(By.xpath("//button[normalize-space()='Create']")).click();	
	}
}