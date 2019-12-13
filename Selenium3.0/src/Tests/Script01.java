package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
		/*
		 * WTS TO PERFORM FOLLW=OWING ACTUINS
		 * 1. OPEN BROWSER
		 * 2. OPEN PAGE
		 * 2. ENTER UN IWTHOUT IDNETFIGN UN FIELD
		 * 4. CPOY PASETE UN IN OWD WITHOUT IDNETIFYING PSW FIELD
		 */
public class Script01 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr=new FirefoxDriver();
		dr.get("https://www.facebook.com");
			
		// fname
		TargetLocator tgt = dr.switchTo();
		WebElement ele = tgt.activeElement();
		//	ele.sendKeys("admin"+Keys.TAB+"admin");
		ele.sendKeys("admin"+Keys.CONTROL+"a");
		ele.sendKeys(Keys.CONTROL+"c");
		ele.sendKeys(Keys.TAB+""+Keys.CONTROL+"v");
			
	}
}
