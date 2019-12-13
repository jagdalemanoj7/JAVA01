package SeleniumPract;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSelection {
	static WebDriver driver;
	public void selectBrowser(String browsername) {
		
		if(browsername.equals("firefox")) {
			String firefoxproperty="webdriver.gecko.driver";
			String relativepath="../Selenium3.0/DriverExe/geckodriver.exe";
			System.setProperty(firefoxproperty, relativepath);
		
			driver = new FirefoxDriver();
		}
		
		else if(browsername.equals("chrome")) {
			String chromeproperty="webdriver.chrome.driver";
			String relativepath1="../Selenium3.0/DriverExe/chromedriver.exe";
			System.setProperty(chromeproperty, relativepath1);
			
			driver=new ChromeDriver();
			
		}
	}
}
