package csm;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Classroom extends Baseclass
{
	@Test(priority=2)
	public void classroom() 
	{
	driver.findElement(By.xpath("//li[@id='ClassRoom_li']")).click();
	//Attendance
	driver.findElement(By.xpath("//li[@id='classRoom_Attendance_li']")).click();
	//Dropdown
	driver.findElement(By.xpath("//button[@id='btnSelectClassSession']")).click();
	}
}