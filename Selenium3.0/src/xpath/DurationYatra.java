package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
// DISPLAY FLIGHT DURATION 
public class DurationYatra {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.yatra.com");
	
		// Search Flight
		driver.findElement(By.id("BE_flight_flsearch_btn")).click();
		
		Thread.sleep(2000);		
		
		// Display flight Duration
		
		String exp="//small[contains(text(),'AI - 471')]/../../..//span[@class='time-color normal ']";
		String dur = driver.findElement(By.xpath(exp)).getText();
		
		System.out.println("Flight Duration: "+dur);
		
	}
}
