package com.cadmin.pageobject;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cadmin.utilities.*;

public class StudentAccount extends Waituntil {
	WebDriver ldriver;

	public StudentAccount(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//li[@class='start sideMenuDev newHomePage']//strong[contains(.,'New Home')]")
	WebElement newhomeclick;
	@FindBy(xpath = "//input[@id='studentList']")
	WebElement studentlistclick;
	@FindBy(xpath = "//div[@id='studentList-list']")
	WebElement listdropdown;
	@FindBy(xpath = "//strong[normalize-space()='10841']")
	WebElement studentselect;
	@FindBy(xpath = "//button[normalize-space()='Please Select']")
	WebElement dropdownclick;
	@FindBy(xpath = "//a[normalize-space()='PROFILE']")
	WebElement profileclick;
	@FindBy(xpath = "//a[contains(.,'Go')]")
	WebElement go;
	@FindBy(xpath="//input[@id='MiddleName']")
	WebElement profilemiddlename;
	@FindBy(xpath="//button[@class='btn green confirmReceipt']")
	WebElement updateprofile;
	@FindBy(xpath="//a[@class='btn btn-xs btn-success']")
	WebElement finalsubmit;
	@FindBy(xpath = "//a[@class='tabBillingEnrollment'][@href='#tb_billing']")
	WebElement enrollment;
	@FindBy(xpath = "//a[@class='tabAppointments']//strong[@class='hidden-xs text-uppercase'][normalize-space()='Appointments']")
	WebElement appointments;
	@FindBy(xpath = "//a[@href='#tb_files']//strong[@class='hidden-xs text-uppercase'][normalize-space()='Files']")
	WebElement files;
	@FindBy(xpath = "//a[@class='tabMessage']//strong[@class='hidden-xs text-uppercase'][normalize-space()='Messages']")
	WebElement messages;

	public void studentlist(String list) {
		newhomeclick.click();
		VisibilityofElement(studentlistclick, 10);
		studentlistclick.sendKeys(list);
	}

	public void studentselect() {
		studentselect.click();
	}

	public void studentfeaturedropdown() {
		dropdownclick.click();
	}

	public void profileclick() {
		profileclick.click();
	}

	public void go() {
		go.click();
	}
	public void profilemiddlename(String name)
	{
		profilemiddlename.sendKeys(name);
		updateprofile.click();
		finalsubmit.click();
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void studentenrollment() {
		enrollment.click();
		appointments.click();
		files.click();
		messages.click();
	}
}

