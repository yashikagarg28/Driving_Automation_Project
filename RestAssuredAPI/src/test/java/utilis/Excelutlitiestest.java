package utilis;

public class Excelutlitiestest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String excelPath = "./data/data1.xlsx"; 
		String sheetName = "Sheet1";
    ExcelUtlis excel = new ExcelUtlis(excelPath, sheetName);
    		
    		excel.getRowcount();
    		excel.getcelldata(1, 0);
	}

}
