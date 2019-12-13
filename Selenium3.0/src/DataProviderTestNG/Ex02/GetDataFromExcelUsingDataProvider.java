package DataProviderTestNG.Ex02;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GetDataFromExcelUsingDataProvider {
	int row_Num;
		
	@DataProvider
	public Object[][] getData(){
		System.out.println("===============================================================");
		Object data[][] = File_Library.getExcelData();	
		return data;
		
		/*row_Num = ExcelGeneric.getLastRowNum();
		System.out.println("Total Count of Row: "+row_Num);
		Object[][] obj = new Object[row_Num][4];
		
		for(int i = 0; i <= row_Num; i++) {
			obj[i][0] = ExcelGeneric.getExcelData(i+1, 0);
			obj[i][1] = ExcelGeneric.getExcelData(i+1, 1);
			obj[i][2] = ExcelGeneric.getExcelData(i+1, 2);
			obj[i][3] = ExcelGeneric.getExcelData(i+1, 3);
		}		
		return obj;*/
	}
	
	@Test(dataProvider="getData")
	public void displayData(String tid, String tname,String arg1, String arg2) {
								
		System.out.println(tid + "  " + tname + "  " + arg1 + "  " + arg2);			
		System.out.println("===============================================================");		
	}
	
}