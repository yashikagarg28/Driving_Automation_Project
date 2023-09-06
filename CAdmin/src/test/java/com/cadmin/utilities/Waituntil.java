package com.cadmin.utilities;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
public class Waituntil
{
	 public static WebDriver driver;
      public  static boolean VisibilityofElement(WebElement element, long timeOut)
	{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		 wait.until(ExpectedConditions.visibilityOf(element));
		 return true;
	}	    
      public static boolean ClickableofElement(WebElement element, long timeOut)
      {
    	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
    	  wait.until(ExpectedConditions.elementToBeClickable(element));
    	  return true;
      }
      }
