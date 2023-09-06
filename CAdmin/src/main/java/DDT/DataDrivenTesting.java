package DDT;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class DataDrivenTesting {	
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
      XSSFWorkbook workbook = null;
      XSSFSheet sheet;
      
      //Create object of file class to open file
      File excelfile = new File("C:\\Users\\yashika.garg\\eclipse-workspace\\Selenium\\TestING\\CAdmin\\TestData\\ReadExcel1.xlsx");
      FileInputStream inputstream = null;
      //create object of Fileinputstream class
      try {
       inputstream = new FileInputStream(excelfile);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      //Create object of XSSFWorkbook to handle xslx file
      try {
		workbook = new XSSFWorkbook(inputstream);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      //to access excel sheet
        sheet =workbook.getSheetAt(0);
      //get total number of rows
      int totalrows = sheet.getLastRowNum() +1;
      System.out.println("Total number of rows=" +totalrows);
      //get total columns in a row
      int totalcols = sheet.getRow(0).getLastCellNum();
      System.out.println("Total number of cols=" + totalcols);
      
      for(int currentrow =0; currentrow <totalrows; currentrow++)
      {
    	  //Launch Chrome Browser
    	  WebDriverManager.chromedriver().setup();
    	  WebDriver driver = new ChromeDriver();
    	  driver.get("https://www.myeform4.net/core/Admin/login.aspx");
    	  //Enter username
    	  driver.findElement(By.id("username")).sendKeys(sheet.getRow(currentrow).getCell(0).toString());
    	  //Enter Password
    	  driver.findElement(By.id("password")).sendKeys(sheet.getRow(currentrow).getCell(1).toString());
          //Enter Login click
    	  driver.findElement(By.xpath("//button[@type='submit']")).click();
    	  try {
			Thread.sleep(3000);
			driver.quit();
		} 
    	  catch (InterruptedException e) 
    	  {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  }
    	  driver.quit();
    	
      }
      try {
		workbook.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
