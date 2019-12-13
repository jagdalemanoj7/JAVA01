package Iframe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameCount {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		
		dr.get("https://www.redbus.in/");
		// iframe
		List<WebElement> ele = dr.findElements(By.tagName("iframe"));
		
		//dr.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.61575599.209945307.1562085140-613141323.1562085140");
		//List<WebElement> ele = dr.findElements(By.tagName("frame"));

		System.out.println("****Count of Frames : "+ele.size());
		
		
	}

}
