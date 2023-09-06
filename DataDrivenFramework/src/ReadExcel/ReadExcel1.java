package ReadExcel;
import Utilities.ExceldataConfig;

public class ReadExcel1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ExceldataConfig excel = new ExceldataConfig("C:\\Users\\yashika.garg\\eclipse-workspace\\Selenium\\TestING\\DataDrivenFramework\\TestData\\ReadExcel1.xlsx");
     System.out.println(excel.getdata(0, 0, 0));
    
    		 }

}
