package cAdmin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class studentAccount extends Baseclass {
	@Test(priority = 2)
	public void studentaccount() {
		driver.findElement(By.id("studentaccount_studentaccount_li")).click();
		// Finding Profile(student)
		driver.findElement(By.xpath("//li[@id='li_StudentAccount_Profile']")).click();
		// Selecting student
		driver.findElement(By.xpath("//a[@id='btnStudentNotSelected']")).click();
		driver.findElement(By.id("studentList")).sendKeys("11975");
		By locator = By.xpath("//li[@role='option']");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		WebElement en = driver.findElement(locator);
		en.click();
		driver.findElement(By.xpath("//button[normalize-space()='GO']")).click();
		//Profile click
		driver.findElement(By.xpath("//a[@class='tabBillingEnrollment']")).click();
		driver.findElement(By.xpath("//a[@class='tabAppointments']")).click();
		driver.findElement(By.xpath("//a[@class='tabFiles ']")).click();
		driver.findElement(By.xpath("//a[@class='tabMessage']")).click();
		driver.findElement(By.xpath("//a[@class='tabQuizTest']")).click();
		driver.findElement(By.xpath("//a[@class='tabActivityLog']")).click();
		
	}
	@Test(priority=3)
	public void uploadimage()
	{
		driver.findElement(By.xpath("//a[@class='tabFiles ']")).click();
		WebElement button = driver.findElement(By.xpath("//*[@id=\"uploadimage\"]"));
		Actions act = new Actions(driver);
		act.moveToElement(button).click().perform();

		Robot rb = null;
		try {
			rb = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rb.delay(2000);

		// Copy file to clipboard
		StringSelection ss = new StringSelection("C:\\Users\\yashika.garg\\Pictures\\Screenshots\\ee.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		// Perform Control + V action to perform
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		// Releasing the keys
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		// Enter key release
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-1000)");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
}
