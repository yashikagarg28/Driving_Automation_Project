package cAdmin;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class studentenrollment extends Baseclass 
{
	@Test
	public void enrollment()
	{
	 driver.findElement(By.xpath("//li[@id='nseSideMenu']//span[contains(.,'New Student Enrollment')]")).click();	
	 //click on Dropdown for student enrollment
	 driver.findElement(By.xpath("//button[@id='StudentInformationType']")).click();
	 //selecting the category for enrolling student -TEEN
	 driver.findElement(By.xpath("//a[@class='btnTeenInfo']")).click();
	 //Filling details 
	 //Instructor 
	 driver.findElement(By.xpath("//button[@data-id='AssignToStaff']")).click();
	 driver.findElement(By.xpath("//span[normalize-space()='_DSS11NOV,_DSS11NOV COREBASE']")).click();
	 //First Name
	 driver.findElement(By.id("FirstName")).sendKeys("Dsstest30");
	 driver.findElement(By.xpath("//label[@class='_containerCB']")).click();
	 //Last Name
	 driver.findElement(By.id("LastName")).sendKeys("Test");
	 //Address
	 driver.findElement(By.id("Address")).sendKeys("Test");
	 driver.findElement(By.id("City")).sendKeys("Test");
	 //State
	 driver.findElement(By.xpath("//button[@data-id='State']//span[@class='filter-option pull-left'][normalize-space()='Please Select']")).click();
	 driver.findElement(By.xpath("//li//a[.='AL']")).click();
	 driver.findElement(By.id("ZipPostalCode")).sendKeys("12345");
	 //Cell Phone
	 driver.findElement(By.id("CellPhone")).sendKeys("(232)323-2323");
	 //Email
	 driver.findElement(By.id("Email")).sendKeys("aaagg7386@gmail.com");
	 //Permit
	 driver.findElement(By.xpath("//label[@id='lbl_PermitWaiverEntered']")).click();
	 driver.findElement(By.xpath("//label[@id='lbl_IhavereadandagreedtoDrivingSchoolTermsandConditions']")).click();
	 //Save button click
	 driver.findElement(By.xpath("//button[@type='button'][normalize-space()='Save']")).click();
	 driver.findElement(By.xpath("//a[@class='btn btn-xs btn-success']")).click();
	}
}