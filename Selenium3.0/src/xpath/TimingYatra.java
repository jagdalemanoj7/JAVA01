package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
// DISPLAY FLIGHT TIME 
public class TimingYatra {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.yatra.com");
	
		// Search Flight
		driver.findElement(By.id("BE_flight_flsearch_btn")).click();
		
		Thread.sleep(2000);				
		// Display Flight Timing 
		// Arrival
		
		String exp_dep="//small[contains(text(),'AI - 471')]/../../..//div[@class='start ']";
		String dur_dep = driver.findElement(By.xpath(exp_dep)).getText();		
		System.out.println("Flight Depart Time: "+dur_dep);

		// Departure
		String exp_arr="//small[contains(text(),'AI - 471')]/../../..//div[@class='end ']";
		String dur_arr = driver.findElement(By.xpath(exp_arr)).getText();		
		System.out.println("Flight Arrival Time: "+dur_arr);

		
	}
}