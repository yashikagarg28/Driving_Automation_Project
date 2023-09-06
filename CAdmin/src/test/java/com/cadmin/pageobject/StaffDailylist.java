package com.cadmin.pageobject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cadmin.utilities.Waituntil;

public class StaffDailylist extends Waituntil{
	WebDriver ldriver;

	public StaffDailylist(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//li[@id='li_scheduingmenu']")
    WebElement schedulingdropdown;
	@FindBy(xpath="//a[normalize-space()='Staff Appointment Daily List']")
	WebElement dailylist;
	@FindBy(xpath="//div[@id='BTWStatus']")
	WebElement statusclick;
	@FindBy(xpath="//div[@class='btn-group btn-full open']//div[@role='menu']")
	WebElement status;
	@FindBy(xpath="//div[@id='BTWStatus']//div[contains(@class,'col-xl-9')]//label[contains(.,'Show All')]")
	WebElement showall;
	
	@FindBy(xpath="//button[@id='btnSearchActivityLogs']")
	WebElement filter;
	
	public void scheduling() throws Exception
    {
   	 schedulingdropdown.click();
   	 dailylist.click();
   	 statusclick.click();
   	 status.click();
   	 showall.click();
   	 filter.click();
    }
	
}
