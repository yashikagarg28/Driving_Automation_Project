package com.cadmin.pageobject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import com.cadmin.utilities.Waituntil;
public class Classroom extends Waituntil {
  WebDriver ldriver; 
  public Classroom(WebDriver rdriver)
  {
	  ldriver = rdriver;
	  PageFactory.initElements(rdriver, this);	  
  }
  //Finding webelements
  @FindBy(xpath="//li[@id='classroom_li']")
  WebElement Classroomtabclick;
  @FindBy(xpath="//li[@id='Classroom_ClassList_li']")
  WebElement Classroomlistclick;
  @FindBy(xpath="//li[@class='c_attendance tabsInClass']")
  WebElement Attendance;
  @FindBy(xpath="//li[@class='c_new-class tabsInClass']")
  WebElement Newclass;
  @FindBy(xpath="//button[@id='drp_SessionType']")
  WebElement Classsessiontypeclick;
  @FindBy(xpath="//a[@id='singleClassSessionmenu']//strong[contains(.,'Single Session Class')]")
  WebElement Singlesession;
  @FindBy(xpath="//button[@data-id='drp_Product']//span[@class='filter-option pull-left'][normalize-space()='Select']")
  WebElement ClasssessiontypeDropdown;
  @FindBy(xpath="//div[@id='panel_ClassroomService']//li//a[.='#12']")
  WebElement Classselected;
  @FindBy(xpath="//button[contains(@data-id,'drp_ClassroomStatus')]//span[contains(@class,'filter-option pull-left')][normalize-space()='Select']")
  WebElement Classstatusclick;
  @FindBy(xpath="//li//a[.='Open']")
  WebElement Openstatusselected;
  @FindBy(xpath="//input[@id='txt_ClassRoomId']")
  WebElement ClassRoomId;
  @FindBy(xpath="//input[@id='txt_EnrollmentSize']")
  WebElement Enrollmentsize;
  @FindBy(xpath="//input[@id='txt_MakeupSize']")
  WebElement Makeupsize;
  @FindBy(xpath="//button[contains(@data-id,'drp_Location')]")
  WebElement ClassLocationclick;
  @FindBy(xpath="//span[contains(text(),'AA Colorado location')]")
  WebElement ClassLocationselected;
  @FindBy(xpath="//div[@class='input-group']//input[@id='dtStartDate']")
  WebElement ClassDateclick;
  @FindBy(xpath="//div[@class='datepicker-days']")
  WebElement DateList;
  @FindBy(xpath="//th[normalize-space()='September 2023']")
  WebElement Monthandyearselected;
  @FindBy(xpath="//span[normalize-space()='Aug']")
  WebElement Month;
  @FindBy(xpath="//td[normalize-space()='22']")
  WebElement Dateselected;
  @FindBy(xpath="//a[normalize-space()='Set Session Times']")
  WebElement SessionTimeclick;
  @FindBy(xpath="//select[@id='drp_starttime1']")
  WebElement SessionstartTime;
  @FindBy(xpath="//select[@id='drp_starttime1']//option[@value='0130']")
  WebElement StartTimeselected;
  @FindBy(xpath="//button[normalize-space()='SAVE']")
  WebElement SaveSession;
  
  //Methods for elements
  public void Classroomtab(String name)
  {
	  
	  Classroomtabclick.click();
	  Classroomlistclick.click();
	  Attendance.click();
	  Newclass.click();
	  Classsessiontypeclick.click();
	  Singlesession.click();
	  ClasssessiontypeDropdown.click();
	  Classselected.click();
	  Classstatusclick.click();
	  Openstatusselected.click();
	  ClassRoomId.sendKeys(name);
  }
  public void  Enrollmentsize(String name) throws InterruptedException {
	  
	  Enrollmentsize.sendKeys(name);
	  Makeupsize.sendKeys(name);
	  ClassLocationclick.click();
	  ClassLocationselected.click();	  
	  ClassDateclick.click();	
	  Monthandyearselected.click();
	  Month.click();
	  Dateselected.click();  		  	  
	  SessionTimeclick.click();
	  SessionstartTime.click();
	  StartTimeselected.click();
	  SaveSession.click();
  }
}

