package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFbRegistration {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr=new FirefoxDriver();
		dr.get("https://www.facebook.com");

		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		FbRegistration fb=new FbRegistration(dr);	
		fb.getInputs("admin","admin","9922305406","admin@1");

	}

}
