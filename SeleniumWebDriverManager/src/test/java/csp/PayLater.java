package csp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PayLater extends BaseClass {

	@Test(priority=4)
	public void payl() throws InterruptedException
	{
		By locator = By.xpath("//li[@id='Marketplace_li']");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		WebElement en = driver.findElement(locator);
	    en.click();
		driver.findElement(By.xpath("//button[@data-id='84']")).click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='btnMPPayLater']")).click();
		driver.findElement(By.xpath("//button[@id='closeReceiptDialog']")).click();
	}
}

