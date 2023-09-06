package csm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class myprofile extends Baseclass
{
	@Test
		public void profile()
		{
			By locator = By.id("MyProfile_li");
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			WebElement en = driver.findElement(locator);
		    en.click();
			//update profile
			driver.findElement(By.xpath("//button[normalize-space()='Update']")).click();
			driver.findElement(By.xpath("//a[@class='btn btn-xs btn-success']")).click();
		}
	}
