package cAdmin;
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



public class Baseclass {
	public static WebDriver driver;

	@BeforeSuite
	public void setup() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\yashika.garg\\eclipse-workspace\\Selenium\\TestING\\SeleniumWebDriverManager\\Driver\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver(options);
		System.out.println("driver=" + driver);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String BaseURL = "https://www.myeform5.net/Corebase/Admin/AccountManagement/Home.aspx";
		driver.get(BaseURL);
		
	}

	@BeforeMethod
	public void beforeM() {
		System.out.println("before test");
	}
	@Test(priority=1)
	public void login()
	{
		driver.findElement(By.id("username")).sendKeys("apetrov");
		driver.findElement(By.id("password")).sendKeys("Leader@2023");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		//Click on New Admin
		driver.findElement(By.xpath("//input[@id='imgNewHomePage']")).click();
	}
	
	@AfterMethod
	public void afterm()
	{
		System.out.println("after test");
	}
	@AfterSuite
	public void teardown() {

		driver.quit();
	}
}

