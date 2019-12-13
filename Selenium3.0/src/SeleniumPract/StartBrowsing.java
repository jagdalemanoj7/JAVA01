package SeleniumPract;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StartBrowsing implements iAutoConstant {
	static WebDriver driver;
	
	public void SelectBrowser(String Browser)
	{ 
		if(Browser.equals("firefox")) {
			System.setProperty(firefoxproperty,firefoxexepath);
			driver=new FirefoxDriver();
		}
		
		else if(Browser.equals("chrome")) {
			System.setProperty(chromeproperty, chromeexepath);
			driver=new ChromeDriver();
		}
	}
	
}
