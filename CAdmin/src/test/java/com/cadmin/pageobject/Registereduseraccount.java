package com.cadmin.pageobject;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Registereduseraccount {
	WebDriver ldriver;
	public Registereduseraccount(WebDriver rdriver)
	{
		//Constructor
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);	
	}
	@FindBy(xpath="//span[@class='username username-hide-on-mobile']")
	WebElement user;
	
	public String registereduser()
	{
		String text =user.getText();
		return text;
	}
}
