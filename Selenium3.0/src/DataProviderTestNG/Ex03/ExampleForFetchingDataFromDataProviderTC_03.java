package DataProviderTestNG.Ex03;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExampleForFetchingDataFromDataProviderTC_03 {

	@DataProvider
	public Object[][] getData() {
		System.out.println("---------------------------------------------------------------");
		Object[][] data = ExcelHandlingUsingDataProvider01.fetchData();
		return data;
	}

	@Test(dataProvider = "getData")
	public void FetchingDataFromDataProviderTC(String tno, String tname, String arg1, String arg2) {

		System.out.println(tno + " " + tname + " " + arg1 + " " + arg2);
		System.out.println("---------------------------------------------------------------");
	}

}