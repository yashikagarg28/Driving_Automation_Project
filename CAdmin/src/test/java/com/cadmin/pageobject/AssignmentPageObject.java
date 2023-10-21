package com.cadmin.pageobject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
public class AssignmentPageObject {
	WebDriver ldriver; 
	  public AssignmentPageObject(WebDriver rdriver)
	  {
		  ldriver = rdriver;
		  PageFactory.initElements(rdriver, this);	  
	  }
	  //Finding Elements
	  @FindBy(xpath="//summary[contains(.,'Table Data')]")
	  WebElement tableclick;
	  
	  @FindBy(xpath="//textarea[@id='jsondata']")
	  WebElement jsondata;
	  
	  @FindBy(xpath="//button[@id='refreshtable']")
	  WebElement Refreshbutton;
	  
	  //Methods for Elements
	  public void Table()
	  {
		 tableclick.click();
	  }
	  public void json(String data)
	  {
		  jsondata.sendKeys(data);
	  }
	  public void refresh()
	  {
		  Refreshbutton.click();
	  }
}
