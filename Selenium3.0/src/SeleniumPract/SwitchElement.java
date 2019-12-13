package SeleniumPract;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr=new FirefoxDriver();
		dr.get("https://www.facebook.com");
		
		// Enter text in field without identifying element.
		TargetLocator tgt = dr.switchTo();
		WebElement rv = tgt.activeElement();
		
		rv.sendKeys("admin"+Keys.CONTROL+"a");
		Thread.sleep(2000);
 		rv.sendKeys(Keys.CONTROL+"c");
 		Thread.sleep(2000);
 		rv.sendKeys(Keys.TAB +""+ Keys.CONTROL+"v"); 		
 		Thread.sleep(2000);
 		rv.sendKeys(Keys.CONTROL+"v");
 		
	}
}