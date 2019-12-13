package Tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
					//	WTS TO PRITN ALL LINKS JREF VALUSE AS OUTPUT			
public class Script04 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr=new FirefoxDriver();
		//dr.get("https://www.facebook.com");
		dr.get("https://www.google.com/");
	
		// href values
		int count=0;
		List<WebElement> ref = dr.findElements(By.tagName("a"));
		System.out.println("\n href values \n");
		for (WebElement ele : ref) {
			String value = ele.getAttribute("href");
			count++;				
			System.out.println(count+". "+ value);
		}		
	}
} 