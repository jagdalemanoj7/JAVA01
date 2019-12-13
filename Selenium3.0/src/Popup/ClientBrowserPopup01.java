package Popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
					// wts perform various actions on parent and child windows.
public class ClientBrowserPopup01 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("http://www.naukri.com");
		Thread.sleep(2000);
		
		Set<String> s = dr.getWindowHandles();
		
		// Total No. of Windows		
		int count = s.size();
		System.out.println("Total No. of Windows: "+count);
		Thread.sleep(2000);
		
		// Print Parent and child titles
		/*
		System.out.println("\n***Parent and child titles ");
		for (String refid : s) {
			dr.switchTo().window(refid);
			System.out.println(dr.getTitle());
		}
		*/
				// OR		
		Iterator<String> itr = s.iterator();
		while(itr.hasNext())
		{
			String txt = itr.next();
			dr.switchTo().window(txt);
			System.out.println(dr.getTitle());
		}
		Thread.sleep(2000);

	}
}