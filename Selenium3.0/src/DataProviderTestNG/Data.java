package DataProviderTestNG;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data 
{
	@DataProvider
	public Object[][] testData()
	{
		Object[][] rv = new String[1][2];
		rv[0][0]="Hi";
		rv[0][1]="Hello";
		
		return rv;
	}
	
	@Test
	public void test1()
	{
		String str = "bye";
		Reporter.log(str,true);
	}
	
	@Test(dataProvider="testData")
	public void test2(String ref1,String ref2)
	{
		Reporter.log(ref1,true);
		Reporter.log(ref2,true);
	}
}