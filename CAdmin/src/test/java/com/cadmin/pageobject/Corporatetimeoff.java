package com.cadmin.pageobject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.cadmin.utilities.*;


public class Corporatetimeoff extends Waituntil{
     WebDriver ldriver;
     public Corporatetimeoff(WebDriver rdriver)
     {
    	 ldriver = rdriver;
    	 PageFactory.initElements(rdriver, this);
     }
     @FindBy(xpath="//li[@id='li_scheduingmenu']")
     WebElement schedulingdropdown;
     @FindBy(xpath="//li[@id='scheduling_corporatetimeoff_li']")
     WebElement corporate;
     @FindBy(xpath="//a[@class='btn green btn-sm']")
     WebElement addnew;
     @FindBy(xpath="//input[@id='corpTimeOffGrpName']")
     WebElement corpname;
     @FindBy(xpath="//button[@title='Select Status']")
     WebElement statusdropdown;
     @FindBy(xpath="//span[normalize-space()='Active']")
     WebElement status;
     @FindBy(xpath="//input[@id='corpTimeoffCode']")
     WebElement corpcode;
     @FindBy(xpath="//button[@data-id='corpTimeoffType']")
     WebElement corptype;
     @FindBy(xpath="//span[normalize-space()='Corporate Off']")
     WebElement corptypeselect;
     @FindBy(xpath="//input[@id='corpTimeoffAffectedDt']")
     WebElement affecteddate;
     @FindBy(xpath="//div[@class='datepicker-days']")
     WebElement Corporatedatepickerselect;
     @FindBy(xpath="//td[normalize-space()='21']")
     WebElement date;
     @FindBy(xpath="//div[@class='modal-content bg-inverse']//div[@class='modal-header']//strong[contains(.,'Corporate Time Off')]")
     WebElement CorporateHeading;
     //checkboxes
     @FindBy(xpath="//div[contains(@class,'col-md-8 pr-0 col-xs-12')]//label[contains(@class,'pointer')][normalize-space()='Yes']")
     WebElement selectday; 
     @FindBy(xpath="//div[@id='divAutoAssignToNewStaff']//label[contains(@class,'cssradio mr-1 pointer')][normalize-space()='Yes']//span[contains(@class,'radiomark')]")
     WebElement assigntonewstaff;
     @FindBy(xpath="//div[@id='divApplyToAllTeachingStaff']//label[@class='cssradio mr-1 pointer'][normalize-space()='Yes']//span[@class='radiomark']")
     WebElement selectallteachingstaff;
     @FindBy(xpath="//input[@id='txtCorpTimeOffNotes']")
     WebElement corpnotes;
     @FindBy(xpath="//button[@id='btnSave']")
     WebElement savebutton;
     public void scheduling()
     {
    	 schedulingdropdown.click();
     }
     public void corporatetimeoff()
     {
    	 corporate.click();
    	 addnew.click();
     }
     public void corpname(String name)
     {
    	 corpname.sendKeys(name);
    	 statusdropdown.click();
    	 status.click();
    	 
     }
     public void corpcode(String code)
     {
    	 corpcode.sendKeys(code);
    	 corptype.click();
    	 corptypeselect.click();
    	 affecteddate.click();
    	 Corporatedatepickerselect.click();
    	 date.click();
    	 CorporateHeading.click();	 
     }
     public void checkboxclick()
     {
 		selectday.click();
 		assigntonewstaff.click();
   	    selectallteachingstaff.click();
 		
     }
     public void Corporatenotes(String notes)
     {
    	 corpnotes.sendKeys(notes);
    	 savebutton.click();
     }
     
}
