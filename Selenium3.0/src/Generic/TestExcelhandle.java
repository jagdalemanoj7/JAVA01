package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestExcelhandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "excelpath");
		WebDriver dr=new FirefoxDriver();
		dr.get("http://admin-pc/login.do");
		
		
	}

}
