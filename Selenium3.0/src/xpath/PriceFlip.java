package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
// DISPLAY PRICE OF MOBLE
public class PriceFlip {
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
		// //div[text()='Redmi Note 7S (Sapphire Blue, 32 GB)']/../..//div[@class='_1vC4OE _2rQ-NK']
		String price = driver.findElement(By.xpath("//div[text()='Redmi Note 7S (Sapphire Blue, 32 GB)']/../..//div[@class='_1vC4OE _2rQ-NK']")).getText();
		System.out.println(" Mobile Price : " +price);
				
	}
}
