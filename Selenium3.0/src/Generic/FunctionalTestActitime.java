package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FunctionalTestActitime {
		//	WTS TO PERFORM FUNCTIONAL TESTING ON DIFFERENT INPUTS.
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");		
	    
		String excel = Propertyfilehandle.readData("../Selenium3.0/src/Generic/actitime.properties", "keyword");		
		Excelhandle.openExcel(excel);
		Excelhandle.openSheet("Sheet3");
		int rowcount = Excelhandle.rowcount();
		String user="",pass="";
		for (int i = 1; i <= 4; i++) {
			
			WebDriver dr=new FirefoxDriver();
			dr.get("http://admin-pc/login.do");			
			dr.switchTo().activeElement();
			ActitimeLogin act = new ActitimeLogin(dr);
			
			Excelhandle.identifyRow(i);
			
			short cellcount = Excelhandle.cellcount();
			user=Excelhandle.celldata(0);
			pass=Excelhandle.celldata(1);		
			act.setCredentials(user, pass);
			String title = dr.getTitle();
			
			/*String[] inputs=new String[cellcount];
			for (int j = 0; j < cellcount; j++) {							
				inputs[j]=Excelhandle.celldata(j);
			}
			*/
					
			if(title.contains("Time-Track"))
			{
				System.out.println("Passed, Home pg disp..");
				Excelhandle.createnewcell(2);
				Excelhandle.entercellvalue("pass");
				Excelhandle.createnewcell(3);
				Excelhandle.entercellvalue("Home pg disp..");
			}
			else
			{
				System.out.println("Failed, Home pg not disp..");
				Excelhandle.createnewcell(2);
				Excelhandle.entercellvalue("fail");
				Excelhandle.createnewcell(3);
				Excelhandle.entercellvalue("Home pg not disp..");
			}
		
			Excelhandle.saveexcelchanges(excel);
			dr.close();
		}
	}
}