package com.cadmin.pageobject;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.cadmin.utilities.Waituntil;

public class Accountmanagement extends Waituntil{
    WebDriver ldriver;
	public Accountmanagement(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//strong[normalize-space()='Account Management']")
	WebElement Accountmanagementclick;
	@FindBy(xpath="//li//span[@class='title']//strong[contains(text(),'Services')]")
	WebElement servicesarrow;
	//Products
	@FindBy(xpath="//a[contains(text(),'Components (Products)')]")
	WebElement Products;
	@FindBy(xpath="//a[@href='javascript:;'][normalize-space()='Add New']")
	WebElement Productaddnew;
	@FindBy(xpath="//input[@id='ComponentName']")
	WebElement Productname;
	@FindBy(xpath="//input[@id='Item#Code']")
	WebElement Productid;
	@FindBy(xpath="//div[@class='btn-group bootstrap-select dynamicDropDown bs-select text-left']//span[@class='filter-option pull-left'][normalize-space()='Please Select']")
	WebElement Selectstatus;
	@FindBy(xpath="//span[@class='text'][normalize-space()='Active']")
	WebElement Statusselected;
	@FindBy(xpath="//input[@id='Price']")
	WebElement Price;
	@FindBy(xpath="//button[@data-id='drp_Component_ProductType']//span[@class='filter-option pull-left'][normalize-space()='Please Select']")
	WebElement Type;
	@FindBy(xpath="//span[normalize-space()='BTW']")
	WebElement Typeofstatus;
	@FindBy(xpath="//button[@data-id='txt_Component_SubType']//span[@class='filter-option pull-left'][normalize-space()='Please Select']")
	WebElement SubType;
	@FindBy(xpath="//span[normalize-space()='Teen BTW']")
	WebElement Typeofsubtype;
	@FindBy(xpath="//input[@id='txt_Component_DrivingHours']")
	WebElement Drivinghours;
	@FindBy(xpath="//button[@data-toggle='confirmationComponent_SaveOrUpdateComponent']")
	WebElement Save;
	@FindBy(xpath="//a[normalize-space()='Yes']")
	WebElement ConfirmProductyes;
	//Fees
	@FindBy(xpath="//strong[normalize-space()='Fees']")
	WebElement Feeclick;
	@FindBy(xpath="//div[@id='pnlFeesTAB']//a[@class='btn green btn-sm'][normalize-space()='Add New']")
	WebElement FeeAddnew;
	@FindBy(xpath="//input[@id='FeeName']")
	WebElement Feename;
	@FindBy(xpath="//button[@title='Please Select']")
	WebElement FeeDropdrownclick;
	@FindBy(xpath="//span[@class='text'][normalize-space()='Active']")
	WebElement SelectFeeStatus;
	@FindBy(xpath="//input[@id='FeeAmount']")
	WebElement FeeAmount;
	@FindBy(xpath="//textarea[@id='Notes']")
	WebElement Notes;
	@FindBy(xpath="//button[@data-toggle='confirmationFees_SaveOrUpdateComponent']")
	WebElement SaveFee;
	@FindBy(xpath="//a[contains(@class,'btn-primary')]")
	WebElement ConfirmFeeyes;
	//Discounts
	@FindBy(xpath="//a[@id='anch_DiscountsTAB']")
	WebElement Discountclick;
	@FindBy(xpath="//div[@id='pnlDiscountsTAB']//a[@class='btn green btn-sm'][normalize-space()='Add New']")
	WebElement DiscountAddnew;
	@FindBy(xpath="//input[@id='DiscountName']")
	WebElement DiscountName;
	@FindBy(xpath="//button[@title='Please Select']")
	WebElement Discountselectstatus;
	@FindBy(xpath="//span[@class='text'][normalize-space()='Active']")
	WebElement Statusselected1;
	@FindBy(xpath="//input[@id='DiscountCode']")
	WebElement Discountcode;
	@FindBy(xpath="//input[@id='DiscountAmount']")
	WebElement DiscountFee;
	@FindBy(xpath="//textarea[@id='Notes']")
	WebElement DiscountNote;
	@FindBy(xpath="//button[@id='btnconfirmationDiscounts_SaveOrUpdateComponent']")
	WebElement SaveDiscount;
	@FindBy(xpath="//a[normalize-space()='Yes']")
	WebElement ConfirmDiscountyes;
	//Miscellaneous
	@FindBy(xpath="//a[@id='anch_MiscellaneousTAB']")
	WebElement Miscellenousclick;
	@FindBy(xpath="//div[@id='pnlMiscellaneousTAB']//a[@class='btn green btn-sm'][normalize-space()='Add New']")
	WebElement MisAddnew;
	@FindBy(xpath="//input[@id='MiscellaneousName']")
	WebElement Misname;
	@FindBy(xpath="//button[@data-id='txt_Component_SubType']//span[@class='filter-option pull-left'][normalize-space()='Please Select']")
	WebElement MisTypeofstatus;
	@FindBy(xpath="//span[normalize-space()='Apparel']")
	WebElement MisStatusselect;
	@FindBy(xpath="//div[@id='addMiscellaneousModal']//div[@class='modal-footer']//button[@type='button'][normalize-space()='Close']")
	WebElement close;
	//Quiz, packages
	@FindBy(xpath="//strong[normalize-space()='Quiz Exams']")
	WebElement Quizexamsclick;
	@FindBy(xpath="//a[@href='#quizReport']")
	WebElement QuizReport;
	@FindBy(xpath="//strong[normalize-space()='Services (Packages)']")
	WebElement ServicesPackage;
	//Staff
	@FindBy(xpath="//a[normalize-space()='Staff']")
	WebElement Staffclick;
	@FindBy(xpath="//a[@id='aAddNewStaff']")
	WebElement StaffAddnew;
	@FindBy(xpath="//button[@data-id='Status']//span[@class='filter-option pull-left'][normalize-space()='Please Select']")
	WebElement Staffstatus;
	@FindBy(xpath="//span[@class='text'][normalize-space()='Active']")
    WebElement Staffstatusselected;
	@FindBy(xpath="//button[@data-id='StaffType']//span[@class='filter-option pull-left'][normalize-space()='Please Select']")
	WebElement StaffStatustype;
	@FindBy(xpath="//span[@class='text'][normalize-space()='Instructor/Teacher']")
	WebElement StaffTypeSelected;
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement StaffFirstname;
	@FindBy(xpath="//input[@id='LastName']")
	WebElement StaffLastname;
	@FindBy(xpath="//input[@id='UserName']")
	WebElement Username;
	@FindBy(xpath="//input[@id='cPassword']")
	WebElement Password;
	@FindBy(xpath="//input[@id='cReenterPassword']")
	WebElement RePassword;
	@FindBy(xpath="//a[@id='btnContinue2']")
	WebElement Staffcontinue;
	@FindBy(xpath="//a[@id='btnSave']")
	WebElement Staffsaved;
	@FindBy(xpath="//button[@onclick='CloseAddNewStaffPopup()'][normalize-space()='Close']")
	WebElement staffclose;
	//Locations
	@FindBy(xpath="//a[normalize-space()='Locations']")
	WebElement locations;
	@FindBy(xpath="//a[@id='aAddNewStaff']")
	WebElement AddnewLocation;
	@FindBy(xpath="//input[@id='LocationName']")
	WebElement Locationname;
	@FindBy(xpath="//input[@id='LocationCode']")
	WebElement Locationcode;
	@FindBy(xpath="//button[@data-id='LocationStatus']")
	WebElement Locationstatusselect;
	@FindBy(xpath="//span[@class='text'][normalize-space()='Active']")
	WebElement Locationstatusselected;
	@FindBy(xpath="//body//div[@class='page-container']//div[@class='input-group']//div[@class='input-group']//label[1]//div[1]")
	WebElement LocationType;
	@FindBy(xpath="//form[@id='submit_form']//a[@id='btnSave']")
	WebElement LocationSave;
	@FindBy(xpath="//div[@id='divAddStaffSuccessErrorMessage']//div[@id='alertSuccess2']//button[@type='button'][normalize-space()='Close']")
	WebElement Messagepopup;
	@FindBy(xpath="//div[@class='modal-header']//button[contains(@onclick,'CloseUpdateLocationPopup')]")
	WebElement Locationend;
	//HighSchools
	@FindBy(xpath="//a[@id='anch_HighSchoolsListTAB']//strong[@class='hidden-xs text-uppercase'][normalize-space()='High Schools']")
	WebElement Highshoolclick;
	@FindBy(xpath="//a[@id='addNewSchool']")
	WebElement AddnewHighschool;
	@FindBy(xpath="//input[@id='SchoolName']")
	WebElement AddSchoolName;
	@FindBy(xpath="//button[@data-id='SchoolStatus']")
	WebElement SchoolStatus;
	@FindBy(xpath="//div[@class='btn-group bootstrap-select dynamicDropDown bs-select text-left open']//span[@class='text'][normalize-space()='Active']")
	WebElement SchoolStatusselected;
	@FindBy(xpath="//input[@id='SchoolAddress']")
	WebElement SchoolAddress;
	@FindBy(xpath="//button[@id='btnSaveNewHighSchoolInfo']")
	WebElement SaveSchool;
	@FindBy(xpath="//div[@id='pnlHighSchoolTABNotification']//div[@id='alertSuccess2']//button[@type='button']")
	WebElement SchoolMessagepop;
	@FindBy(xpath="//div[@id='dtHighSchool_paginate']//ul[@class='pagination']//li[@class='active']//a[@href='#']")
	WebElement Upslider;
	//How did you hear about us
	@FindBy(xpath="//a[@id='anch_LeadsListTAB']//strong[@class='hidden-xs text-uppercase'][normalize-space()='How did you hear']")
	WebElement Howdidyouhearaboutusclick;
	@FindBy(xpath="//a[@id='addNewReferal']")
	WebElement Howdidyouhearaddnew;
	@FindBy(xpath="//input[@id='LeadName']")
	WebElement leadName;
	@FindBy(xpath="//button[@data-id='LeadStatus']//span[@class='filter-option pull-left'][normalize-space()='Please Select']")
	WebElement Howdidyouhearstatusclick;
	@FindBy(xpath="//div[@class='btn-group bootstrap-select dynamicDropDown bs-select text-left open']//span[@class='text'][normalize-space()='Active']")
	WebElement Howdidyouhearstatusselected;
	@FindBy(xpath="//form[@id='submit_Leadform']//a[@id='btnSave']")
	WebElement Howdidyouhearsave;
	@FindBy(xpath="//div[@id='divUpdateLeadSuccessErrorMessage']//div[@id='alertSuccess2']//button[@type='button'][normalize-space()='Close']")
	WebElement Messagepop1;
	@FindBy(xpath="//form[@id='submitUpdate_leadsform']//button[@type='button'][normalize-space()='Close']")
	WebElement Howdidyouhearend;	
	
	
	//Vehicles
	@FindBy(xpath="//a[@id='anch_VehicleListTAB']")
	WebElement Vehicleclick;
	@FindBy(xpath="//a[@id='addNewVehicle']")
	WebElement AddnewVehicle;
	@FindBy(xpath="//input[@id='VehicleName']")
	WebElement Vehiclename;
	@FindBy(xpath="//div[@id='addVehicle']//label[1]//div[1]//ins[1]")
	WebElement Vehicleapptcolor;
	@FindBy(xpath="//form[@id='submit_Vehicleform']//a[@id='btnSave']")
	WebElement Vehiclesave;
	@FindBy(xpath="//div[@id='divUpdateVehicleSuccessErrorMessage']//div[@id='alertSuccess2']//button[@type='button']")
	WebElement VehicleMessagepopup;
	@FindBy(xpath="//div[@class='modal-header']//button[contains(@onclick,'CloseUpdateLocationPopup')]")
	WebElement Vehicleclose;
	//Methods for elements
	public void Accountmanage()
	{
		Accountmanagementclick.click();
		
	}
	public void service()
	{
		servicesarrow.click();
	}
	public void Product()
	{
		Products.click();
		Productaddnew.click();
	}
	public void AddingProductDetails(String name) 
	{
		Productname.sendKeys(name);
		Productid.sendKeys(name);
		Selectstatus.click();
		Statusselected.click();
		
	}
	public void Price(String name)
	{
		Price.sendKeys(name);
		Type.click();
		Typeofstatus.click();
		SubType.click();
		Typeofsubtype.click();
		Drivinghours.sendKeys(name);
		Save.click();
		ConfirmProductyes.click();
		Feeclick.click();
		FeeAddnew.click();
		Feename.sendKeys(name);
		FeeDropdrownclick.click();
		SelectFeeStatus.click();
		FeeAmount.sendKeys(name);
		Notes.sendKeys(name);
		SaveFee.click();
		ConfirmFeeyes.click();
	}
	public void Discount(String name)
	{
		Discountclick.click();
		DiscountAddnew.click();
		VisibilityofElement(DiscountName, 10);
		//WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(10));
 		//wait.until(ExpectedConditions.visibilityOf(DiscountName));
		
		DiscountName.sendKeys(name);
	}
	public void Discount1(String name)
	{
		
		Discountselectstatus.click();
		Statusselected1.click();
		Discountcode.sendKeys(name);
		DiscountFee.sendKeys(name);
		DiscountNote.sendKeys(name);
		SaveDiscount.click();
		ConfirmDiscountyes.click();
	}
	public void Miscellenous(String name)
	{
		Miscellenousclick.click();
		MisAddnew.click();
		Misname.sendKeys(name);
		MisTypeofstatus.click();
		MisStatusselect.click();
        close.click();
        Quizexamsclick.click();
        QuizReport.click();
	}
	public void Packages(String name)
	{
		ServicesPackage.click();
		Staffclick.click();
		StaffAddnew.click();
		//WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(20));
 		//wait.until(ExpectedConditions.visibilityOf(Staffstatus));
		VisibilityofElement(Staffstatus, 10);
		Staffstatus.click();
		Staffstatusselected.click();
		StaffStatustype.click();
		StaffTypeSelected.click();
		StaffFirstname.sendKeys(name);
		StaffLastname.sendKeys(name);
		Username.sendKeys(name);
	}
	public void Packages1(String name)
	{
		Password.sendKeys(name);
		RePassword.sendKeys(name);
		Staffcontinue.click();
		Staffsaved.click();
		VisibilityofElement(staffclose, 10);
		//WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(20));
 		//wait.until(ExpectedConditions.visibilityOf(staffclose));
		staffclose.click();		
	}
	public void Locations(String name)
	{
		locations.click();
		AddnewLocation.click();
		Locationname.sendKeys(name);
		Locationcode.sendKeys(name);
		Locationstatusselect.click();
		Locationstatusselected.click();
		LocationType.click();
		LocationSave.click();
		Messagepopup.click();
		//WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(40));
 		//wait.until(ExpectedConditions.visibilityOf(Locationend));
		VisibilityofElement(Locationend, 10);
		Locationend.click();
	}
	public void HighSchool(String name)
	{
		Highshoolclick.click();
		AddnewHighschool.click();
		AddSchoolName.sendKeys(name);
		SchoolStatus.click();
		SchoolStatusselected.click();
		SchoolAddress.sendKeys(name);
		SaveSchool.click();
		SchoolMessagepop.click();
		//WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(40));
 		//wait.until(ExpectedConditions.visibilityOf(Upslider));
		VisibilityofElement(Upslider, 10);
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("window.scrollBy(0,-1000)");

	}
	public void Howdidyouhear(String name)
	{
		Howdidyouhearaboutusclick.click();
		Howdidyouhearaddnew.click();
		leadName.sendKeys(name);
		Howdidyouhearstatusclick.click();
		Howdidyouhearstatusselected.click();
		Howdidyouhearsave.click();
		Messagepop1.click();
		//WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(40));
 		//wait.until(ExpectedConditions.visibilityOf(Howdidyouhearend));
		VisibilityofElement(Howdidyouhearend, 10);
		Howdidyouhearend.click();		
	}
	public void Vehicle(String name)
	{
		Vehicleclick.click();
		AddnewVehicle.click();
		Vehiclename.sendKeys(name);
		Vehicleapptcolor.click();
		Vehiclesave.click();
		VehicleMessagepopup.click();
		VisibilityofElement(Vehicleclose, 10);
		//WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(40));
 		//wait.until(ExpectedConditions.visibilityOf(Vehicleclose));
		Vehicleclose.click();
	}
	}
