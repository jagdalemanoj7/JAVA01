package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
// dISPAY RATING OF MOBIEL
public class RatingFlip {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://flipkart.com");

		// close login window
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();;
		
		// enter text in search field
		driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys("mobiles");
		
		// click on search button
		driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
		
		Thread.sleep(2000);
		// Mobile RAting //div[text()='Redmi Note 7 Pro (Neptune Blue, 64 GB)']/..//span[contains(text(),'Ratings')]
		String exp="//div[text()='Redmi Note 7S (Sapphire Blue, 32 GB)']/..//span[contains(text(),'Ratings')]";
		String rating = driver.findElement(By.xpath(exp)).getText();
		System.out.println(" Mobile RAting : " +rating);

	}
	
}