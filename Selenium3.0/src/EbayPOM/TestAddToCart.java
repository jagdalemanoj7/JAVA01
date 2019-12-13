package EbayPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Generic.Propertyfilehandle;

public class TestAddToCart {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
				
		String excel = Propertyfilehandle.readData("../Selenium3.0/src/Generic/actitime.properties", "keyword");
		Excelhandle.openExcel(excel);
		Excelhandle.openSheet("Sheet4");
		int rowcount = Excelhandle.rowcount();
		String fname,lname,email,pass;
		//String mobile,pass;
		for (int i = 1; i <= 1; i++) {
			WebDriver dr=new FirefoxDriver();
			//dr.get("https://www.flipkart.com/");
			dr.get("https://www.ebay.com/");
			dr.switchTo().activeElement();
			AddToCart atc=new AddToCart(dr);
			
			Excelhandle.identifyRow(i);
			//fname=Excelhandle.celldata(0);			lname=Excelhandle.celldata(1);			email=Excelhandle.celldata(2);			pass=Excelhandle.celldata(3);
			//atc.setCredentials(fname,lname,email,pass);
			
			//mobile=Excelhandle.celldata(0);
			//pass=Excelhandle.celldata(1);
			//atc.setCredentials(mobile, pass);
			
			String title=dr.getTitle();
			System.out.println(title);
			//dr.close();
		}
		
	}

}
