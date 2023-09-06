package utilis;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUtlis {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtlis(String excelPath, String sheetName ) throws Exception
	{
		 workbook = new XSSFWorkbook(excelPath);
	     sheet = workbook.getSheet(sheetName);
	}
	
	public static void getRowcount() 
	{
	     int rowcount = sheet.getPhysicalNumberOfRows();
	      System.out.println("Number of Rows=" +rowcount);
	}
	
	public static void  getcelldata(int rowNum, int colNum) 
	{
		DataFormatter dataformatter = new DataFormatter();
		Object value = dataformatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));
		System.out.println(value);
		 //String value = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		// double num = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
	     //System.out.println(value);
	     //System.out.println(num);
	}

}
