package Popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseChildBrowser {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("http://www.naukri.com");
		Thread.sleep(2000);
		
		String p = dr.getWindowHandle();
		Set<String> s = dr.getWindowHandles();
		
		//	 
		Iterator<String> itr = s.iterator();
		while(itr.hasNext())
		{
			String refid = itr.next();
			if(!p.equals(refid)) {
				dr.switchTo().window(refid);
				dr.close();
			}
		}
				
	}
}