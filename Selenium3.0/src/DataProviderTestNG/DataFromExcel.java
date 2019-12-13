package DataProviderTestNG;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Generic.Excelhandle;

						// WTS TO FETCH DATA FROM EXCELSHEET AND PASS IT TO DATA PROVIDER TO EXECUTE TEST METHOD. 
public class DataFromExcel 
{
	@DataProvider 
	public Object[][] testData()
	{
		Excelhandle.openExcel("../Selenium3.0/Excel/Worksheet01.xlsx");
		Excelhandle.openExcel("sheet2");
		int rows = Excelhandle.rowcount();
		Object[][] rv = new String[rows][2];
		
		for (int i = 1; i < rows; i++) 
		{
			Excelhandle.identifyRow(i);
			rv[i-1][0] = Excelhandle.celldata(0);
			rv[i-1][1] = Excelhandle.celldata(1);
		}		
		return null;
	}
	
	@Test(dataProvider="testData")
	public void demoLogin(String username, String password)
	{
		Reporter.log(username,true);
		Reporter.log(password,true);
	}
			
}