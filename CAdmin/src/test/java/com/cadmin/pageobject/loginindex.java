package com.cadmin.pageobject;

import java.time.Duration;
import com.cadmin.utilities.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginindex extends Waituntil{
//create a object of webdriver 
	WebDriver ldriver;
	
	//constructor
	public loginindex(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	//indentifying webelements
	@FindBy(id="username")
	WebElement user;
	
	@FindBy(id="password")
	WebElement pass;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement Login;
	
	@FindBy(id="imgNewHomePage")
	WebElement NewAdmin;
	
	@FindBy(xpath="//button[normalize-space()='New enrollment']")
	WebElement NewEnrollment;
	
	@FindBy(xpath="//div[@id='validateCashDrawerLocation']//div[@class='modal-content']")
	WebElement Modelvisibility;
	
	@FindBy(xpath="//button[@title='Select']")
	WebElement SelectlocationHome;
	
	@FindBy(xpath="//li[@class='start sideMenuDev newHomePage active']")
	WebElement NewHomepageclick;
	@FindBy(xpath="//ul[@class='dropdown-menu inner selectpicker'][contains(.,'AA Colorado location')]")
	WebElement Locationselected;
	@FindBy(xpath="//button[@id='btnSaveCurrentCashDrawerLoaction']")
	WebElement Locationsaved;
	@FindBy(xpath="//a[@class='btn btn-xs btn-success']")
	WebElement YesConfirmationLocation;

	//Methods for web Elements
	public void enterusername(String name)
	{
		user.sendKeys(name);
	}
	public void enterpassword(String password)
	{
		pass.sendKeys(password);
	}
	public void Loginclick()
	{
	Login.click();	
	}
	public void newadmin()
	{
	NewAdmin.click();
	}
	public void Selectlocationfromhomepage()
	{
		try
		{
		    Modelvisibility.isEnabled();
			SelectlocationHome.click();
			Locationselected.click();
			ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			Locationsaved.click();
			YesConfirmationLocation.click();
		}
		catch(Exception e)
		{
			NewEnrollment.click();
		}
	}	
}

