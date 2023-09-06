package csp;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PayNow extends BaseClass {
	@Test(priority=4)
	public void paynow() throws InterruptedException {
		// Scroll up
		By locator = By.xpath("//li[@id='Marketplace_li']");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		WebElement en = driver.findElement(locator);
	    en.click();
		driver.findElement(By.xpath("//button[@data-id='84']")).click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='btnMPRecapPayNow']")).click();
        driver.findElement(By.xpath("//input[@id='txtCardNumber']")).sendKeys("4111111111111111");
        driver.findElement(By.xpath("//input[@id='txtExpiry']")).sendKeys("12");
        driver.findElement(By.xpath("//input[@id='txtExpiry']")).sendKeys("2030");
        driver.findElement(By.id("txtSecurityCode")).sendKeys("076");
        driver.findElement(By.id("txtNameOnCard")).sendKeys("Test");
        driver.findElement(By.xpath("//ins[@class='iCheck-helper']")).click();
        driver.findElement(By.xpath("//span[@class='filter-option pull-left']")).click();
        driver.findElement(By.xpath("//span[contains(text(),'AB')]")).click();
        driver.findElement(By.xpath("//span[@id='btnAmt']")).click();
        driver.findElement(By.xpath("//button[@id='closeReceiptModal1']")).click();
		
		}
		
	}


