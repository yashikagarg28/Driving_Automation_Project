package Utilities;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExceldataConfig {
	XSSFWorkbook nb;
	XSSFSheet sheet;
	
	public ExceldataConfig(String excelpath)
	{
        try {
			File src = new File(excelpath);
			
			FileInputStream fis = new FileInputStream(src);
			nb = new XSSFWorkbook(fis);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
		    System.out.println(e.getMessage());
		}
	}
	
	public String getdata(int Sheetnumber, int row, int col)	
	{
		sheet = nb.getSheetAt(0);
		String data = sheet.getRow(row).getCell(col).getStringCellValue();
		return data;
	}
	
	public int rowcount(int sheetIndex)
	{
		int rowc = nb.getSheetAt(sheetIndex).getLastRowNum();
		return rowc;
	}

}
