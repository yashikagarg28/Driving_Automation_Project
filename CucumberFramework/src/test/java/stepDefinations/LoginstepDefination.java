package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;



public class LoginstepDefination extends AbstractPageStepDefination
{
	WebDriver driver= getDriver();
	 
	@Given("^Browser opens$")
	public void Browser_opens() throws Throwable
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\yashika.garg\\eclipse-workspace\\Selenium\\TestING\\CucumberFramework\\Driver\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver(options);
		System.out.println("driver=" + driver);
		driver.manage().window().maximize();
		
	}
	
	@When("^Login page appears$") 
	public void Login_page_appears() throws Throwable
	{
		driver.get("https://www.tdsm.app/CentralizeSP/Student/Login/corebase");
	}
	
	@Then("^user enters Userame and password")
		public void user_enters_Userame_and_password() throws Throwable
		{
		driver.findElement(By.id("username")).sendKeys("Dss13664");
		driver.findElement(By.id("password")).sendKeys("Test@2802");
		}
	@And("^Press login button$")
	public void press_login_button() throws Throwable {
		driver.findElement(By.xpath("//button[@class='btn green-haze pull-right']")).click();
	    
	}
	@And("^User is on Home page$")
	public void user_is_on_home_page() throws Throwable {   
	String expectedtitle="Student Home";
	System.out.println(expectedtitle);
	String actualtitle = driver.getTitle();
	System.out.println(actualtitle);
	if(actualtitle.equals(expectedtitle))
	{
		System.out.println("PASS");
	}
	else
	{
		System.out.println("FAIL");
	}
	}
	
}