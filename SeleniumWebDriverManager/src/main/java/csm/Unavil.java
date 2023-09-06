package csm;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Unavil extends Baseclass {
	@Test(priority = 2)
	public void ss() {
		driver.findElement(By.id("Scheduling_li")).click();
		driver.findElement(By.xpath("//li[@id='Schul_Scheduler_li']")).click();
		// Set Unavailability
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@data-target='#ModalSetUnAvailability']")).click();
		// Unavailability
		Select Instructor = new Select(driver.findElement(By.xpath("//*[@id=\"ddlInstructor\"]")));
		Instructor.selectByIndex(1);
		Select Timeoff = new Select(driver.findElement(By.id("ddlUnavailabilityType")));
		Timeoff.selectByVisibleText("Holiday");
	}

	@Test(priority = 3)
	public void Datepicker() throws InterruptedException {
		// Click and Open Datepicker
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//input[@id='UnAvDate'])[1]")).click();
		// Datepicker table selection
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement Datewidget = wait
				.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='datepicker-days']")))
				.get(0);
		// Selecting date from date picker
		List<WebElement> dayList = Datewidget.findElements(By.tagName("td"));
		for (WebElement dates : dayList) {
			String date = dates.getText();
			System.out.println("Date available =" + date);
			if (date.equals("22")) {
				dates.click();
				break;
			}
		}
		// Wait a bit for selecting Date properly
		Thread.sleep(5000);

	}

	@Test(priority = 4)
	public void Time() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Select Starttime = new Select(driver.findElement(By.xpath("//select[@id='UnAvStartTime']")));
		Starttime.selectByValue("0530");
		Select Endtime = new Select(driver.findElement(By.xpath("//select[@id='UnAvEndTime']")));
		Endtime.selectByValue("0630");
	}

	@Test(priority = 5)
	public void Status() {
		Select status = new Select(driver.findElement(By.xpath("//select[@id='ddlUnAvStatus']")));
		status.selectByVisibleText("Active");
		// Save the unavailibility
		driver.findElement(By.id("btnSaveUnavailabiltiy")).click();
	}
}

