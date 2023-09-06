package csm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Schedule extends Baseclass
{
	@Test
	public void schedule() {
		driver.findElement(By.id("Scheduling_li")).click();
		driver.findElement(By.xpath("//li[@id='Schul_Scheduler_li']")).click();
		//Lesson
		By locator = By.xpath("//li[@id='Schul_btwschedulingLessons_li']");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		WebElement en = driver.findElement(locator);
	    en.click();
		//select student
	   WebElement student= driver.findElement(By.xpath("//input[@id='txt_studentLessons_StudentName']"));
       student.sendKeys("Dsstest");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.findElement(By.xpath("//a[@id='btn_btwScheduling_SelectStudent']")).click();
	   System.out.println("Lesson scheduled");
	}
}