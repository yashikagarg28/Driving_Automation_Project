package ReadExcel;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadExcel {

	public static void main(String[] args) throws IOException {
		File src = new File("C:\\Users\\yashika.garg\\eclipse-workspace\\Selenium\\TestING\\DataDrivenFramework\\TestData\\ReadExcel1.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook nb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = nb.getSheetAt(0);
		int rownum = sheet.getLastRowNum();
		System.out.println("Total number of rows"+rownum+1);
		
		for (int i=0; i<=rownum;i++)
		{
			String data0 = sheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Data from Row is"+i+"is" +data0);
		}
		nb.close();
	}
}
