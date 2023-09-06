package csp;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BaseClass {
	public static WebDriver driver;

	@BeforeSuite
	public void Setup() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\yashika.garg\\eclipse-workspace\\Selenium\\TestING\\SeleniumWebDriverManager\\Driver\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver(options);
		System.out.println("driver=" + driver);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.tdsm.app/CentralizeSP/Student/Login/corebase");

	}

	@BeforeMethod
	public void beforeM() {
		System.out.println("before Test");
	}

	@Test(priority = 1)
	public void login() {
		driver.findElement(By.id("username")).sendKeys("Dss13664");
		driver.findElement(By.id("password")).sendKeys("Testnet@152");
		driver.findElement(By.xpath("//button[@class='btn green-haze pull-right']")).click();
	}

	@Test(priority = 2)
	public void navigation_MyAccount() {
		driver.findElement(By.id("Scheduling_li")).click();
		driver.findElement(By.id("Schul_MySch_li")).click();
		driver.findElement(By.id("MyAccount_li")).click();
		driver.findElement(By.id("MyAccou_Profile_li")).click();
		driver.findElement(By.id("MiddleName")).sendKeys("test");
		driver.findElement(By.id("idMyAccou_Billing")).click();
		driver.findElement(By.id("MyAccou_Appt_li")).click();
		driver.findElement(By.id("MyAccou_Files_li")).click();
		driver.findElement(By.id("MyAccou_Quiz_li")).click();
	}

	@Test(priority = 3)
	public void navigation_Resources() {
		driver.findElement(By.id("Resources_li")).click();
		driver.findElement(By.id("Resources_Class_li")).click();
		driver.findElement(By.id("Resources_RoadTest_li")).click();
		driver.findElement(By.id("Resources_Parents_li")).click();
		driver.findElement(By.id("Resources_Tab1_li")).click();
		driver.findElement(By.id("Resources_Tab2_li")).click();
		driver.findElement(By.id("Resources_Tab4_li")).click();
	}
	@Test(priority=5)
	public void Contact_info()
	{
		driver.findElement(By.xpath("//li[@id='Contact_li']")).click();
		//Email us 
		driver.findElement(By.xpath("//button[@data-target='#sendEmail']")).click();
		System.out.println("Email button clicked ");
		//close
	    driver.findElement(By.xpath("//*[contains(@class,'form-actions text-right')]//button[contains(@class,'default')]")).click();
	    System.out.println("Close button clciked ");
	}
	
	@Test(priority=6)
	public void logout()
	{ 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//li[@id='Logout_li']")).click();
	}


	@AfterMethod
	public void afm() {
		System.out.println("aftr Test");
	}

	@AfterSuite
	public void teardown() {

		driver.quit();
	}

}
