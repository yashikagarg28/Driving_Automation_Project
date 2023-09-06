package csp;

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
import org.testng.annotations.Test;

public class UploadImage extends BaseClass {

	@Test(priority=4)
	public void uploadimage() {
		driver.findElement(By.id("home_li")).click();
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
