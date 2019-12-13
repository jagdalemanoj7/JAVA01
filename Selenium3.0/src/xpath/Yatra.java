package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
// DISPAY FLIGHT PRICE
public class Yatra {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.yatra.com");
	
		// Search Flight
		driver.findElement(By.id("BE_flight_flsearch_btn")).click();
		
		Thread.sleep(2000);
		// Print Price of flight
		String exp="//small[text()='AI - 471 / 644']/../../..//span[@class='bold']";
		String price = driver.findElement(By.xpath(exp)).getText();
		
		System.out.println("Flight Price: "+price);
		
	}
}