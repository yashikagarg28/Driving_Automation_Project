package DDT;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Utilities.ExceldataConfig;
import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
public class CadminLogin {
 
	WebDriver driver;
	@Test(dataProvider="LoginData")
	public void login(String username, String password) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\yashika.garg\\eclipse-workspace\\Selenium\\TestNG\\DataDrivenFramework\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 driver= new ChromeDriver(options);
		driver.manage().window().minimize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		String URL = "https://www.myeform5.net/Corebase/Admin/AccountManagement/Home.aspx";
		driver.get(URL);
		
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		//Click on New Admin
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	    Thread.sleep(5000);
	    
	   Assert.assertTrue(driver.getTitle().contains("DanubeNet"),"User entered invalid credentials");
	   System.out.println("Valid credentials entered");
	}
	@AfterMethod
	public void teardown()
	{
	driver.quit();	
	}
	
	@DataProvider(name = "LoginData")
	public Object[][] passData()
	{
	ExceldataConfig config = new ExceldataConfig("C:\\Users\\yashika.garg\\eclipse-workspace\\Selenium\\TestNG\\DataDrivenFramework\\TestData\\ReadExcel1.xlsx");
	int rows = config.rowcount(0);
	System.out.println("Number of rows="  +rows);
		Object[][] data = new Object[rows][2];
		
		for (int i =0; i<rows; i++)
		{
			data[i][0] = config.getdata(0, i, 0);
			data[i][1] = config.getdata(0, i, 1);
			data[i][0] = config.getdata(1, i, 0);
			data[i][1] = config.getdata(1, i, 1);
		}
		return data;
	}
}