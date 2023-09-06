package csm;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Processyard extends Baseclass
{
	@Test(priority=2)
	public void processyard()
	{
	WebElement process = driver.findElement(By.id("ProcessYardSkills_li"));
	process.click();
	By locator = By.xpath("//span[@class='filter-option pull-left'][normalize-space()='Today']");
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	WebElement en = driver.findElement(locator);
    en.click();
    String option = "Highest to Lowest";
    WebElement dropdown = driver.findElement(By.xpath("//div[@class='btn-group bootstrap-select form-control bs-select open'][contains(.,'2 Days Ago')]"));
    dropdown.click();
    WebElement filter=(driver.findElement(By.xpath("//div//button[contains(.,'FILTER')]")));
    filter.click();
	
	}
}