package Mantra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Generic.Excelhandle;
import Generic.Propertyfilehandle;

public class TestAddToCartMantra {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		
		String excel = Propertyfilehandle.readData("../Selenium3.0/src/Generic/actitime.properties", "keyword");
		Excelhandle.openExcel(excel);
		Excelhandle.openSheet("Sheet4");
		int rowcount = Excelhandle.rowcount();
		String email,pass,mobile;
		for (int i = 2; i <= 2; i++) {
			WebDriver dr=new FirefoxDriver();
			dr.get("https://www.myntra.com");
			dr.switchTo().activeElement();
			
			AddToCartMantra atc=new AddToCartMantra(dr);
			Excelhandle.identifyRow(i);
			email=Excelhandle.celldata(0);
			pass=Excelhandle.celldata(1);
			mobile=Excelhandle.celldata(2);
			//(//a[text()='Men'])[1]
			atc.setcredential(email, pass);		//, mobile
			
			String title=dr.getTitle();
			System.out.println(title);
		}
	}

}