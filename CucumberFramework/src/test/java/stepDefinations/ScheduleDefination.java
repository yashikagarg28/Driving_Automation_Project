package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class ScheduleDefination extends AbstractPageStepDefination

{
	
	WebDriver driver= getDriver(); 
   @Given("^Scheduling is visible$")
	public void Scheduing_is_visible() throws Throwable
	{
	   
	    driver.findElement(By.xpath("//li[@id='Scheduling_li']")).click();
		driver.findElement(By.xpath("//span[@id='Scheduling_arrow_Id']")).click();
	}
	@When("^click on My schedule$")
	public void click_on_My_schedule() throws Throwable
	{
		driver.findElement(By.id("Schul_MySch_li")).click();
	}
}