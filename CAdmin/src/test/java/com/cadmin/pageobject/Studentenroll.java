package com.cadmin.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Studentenroll {
	WebDriver ldriver;
	public Studentenroll(WebDriver rdriver)
	{
		//Constructor
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);	
	}
	//Initiliazing elements
	
	@FindBy(xpath="//button[@id='btnSelectPackTabListText']")
	WebElement packageselectdropdown;
	@FindBy(xpath="//a[normalize-space()='#12345']")
	WebElement pack;
	@FindBy(xpath="//button[@title='Select Cash Drawer Location']")
	WebElement classlocation;
	@FindBy(xpath="//span[normalize-space()='AA Anaconda']")
	WebElement locationselect;
	@FindBy(xpath="//button[normalize-space()='Add Package']")
	WebElement addpackage;
	@FindBy(xpath="//button[@id='btnSkipClasses'][contains(.,'Skip Selection')]")
	WebElement skipclass;
	@FindBy(id="StudentInformationType")
	WebElement enrollementtype;
	@FindBy(xpath="//a[@class='btnTeenInfo']")
	WebElement Teen;
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement firstname;
	@FindBy(xpath="//input[@id='MiddleName']")
	WebElement middlename;
	@FindBy(xpath="//input[@id='LastName']")
	WebElement lastname;
	@FindBy(xpath="//input[@id='Email']")
	WebElement email;
	@FindBy(xpath="//button[@type='button'][normalize-space()='Save']")
	WebElement save;
	
	//Methods for web Elements
	public void packagedropdown()
	{
		packageselectdropdown.click();
	}
	public void packageselect()
	{
		pack.click();
	}
	public void classloc()
	{
		classlocation.click();
	}
	public void locationselect()
	{
		locationselect.click();
	}
	public void addpackage()
	{
		addpackage.click();
	}
	public void skipcl()
	{
		skipclass.click();
	}
	public void etype()
	{
		enrollementtype.click();
	}
	public void teen()
	{
		Teen.click();
	}
	public void firstname(String name)
	{
		firstname.sendKeys(name);
	}
	public void middlename(String name)
	{
		middlename.sendKeys(name);
	}
	public void lastname(String name)
	{
		lastname.sendKeys(name);
	}
	public void email(String name)
	{
		email.sendKeys(name);
	}
	public void save()
	{
		save.click();
	}
}
