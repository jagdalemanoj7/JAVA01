package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestActitime {
						//   WTS TO PERFORM FUNCTIONAL TESTING ON ACTITIME LOGIN PAGE FOR DIFFERENT INPUTS.
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");		
		WebDriver dr = new FirefoxDriver();
		dr.get("http://admin-pc/login.do");

		//dr.switchTo().activeElement();
		ActitimeLogin a = new ActitimeLogin(dr);
		
		String excelpath = Propertyfilehandle.readData("../Selenium3.0/src/Generic/actitime.properties", "keyword");
		
		Excelhandle.openExcel(excelpath);
		Excelhandle.openSheet("Sheet3");
		
		Excelhandle.identifyRow(1);		
		String user = Excelhandle.celldata(0);			
		String pass = Excelhandle.celldata(1);
		
		a.setCredentials(user, pass);
		String title = dr.getTitle();
		
		if(title.contains("Time-Track"))
		{
			System.out.println("HomePage Displayed..");
			Excelhandle.createnewcell(2);
			Excelhandle.entercellvalue("pass");
			Excelhandle.createnewcell(3);
			Excelhandle.entercellvalue("HomePage Displayed");
		}
		
		else
		{
			System.out.println("HomePage not Displayed..");
			Excelhandle.createnewcell(2);
			Excelhandle.entercellvalue("Fail");
			Excelhandle.createnewcell(3);
			Excelhandle.entercellvalue("HomePage not Displayed");
		}
		
		Excelhandle.saveexcelchanges(excelpath);
		dr.close();
	}
}