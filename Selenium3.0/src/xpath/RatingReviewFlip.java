package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
// DISPLAY RATING AND REVIEWS OF MOBILE
public class RatingReviewFlip {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://flipkart.com");

	
		// close login window
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();;
			// driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
		 
		// enter text in search field
		driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys("mobiles");
			// driver.findElement(By.name("q")).sendKeys("mobiles");
		
		// click on search button
		driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
			//  driver.findElement(By.className("vh79eN")).click();
	

		// 
		//String exp="(//div[text()='Redmi Note 7 Pro (Neptune Blue, 64 GB)']/ancestor::div//span[2]/span[1])[3]";
		//String res = driver.findElement(By.xpath(exp)).getText();
		//System.out.println(res);
		
		Thread.sleep(2000); 
		String rating = driver.findElement(By.xpath("//div[text()='Redmi Note 7 Pro (Neptune Blue, 64 GB)']/..//span[contains(text(),'Ratings')]")).getText();
		System.out.println(rating);
		//Review
		String review=driver.findElement(By.xpath("//div[text()='Redmi Note 7 Pro (Neptune Blue, 64 GB)']/..//span[contains(text(),'Reviews')]")).getText();
		System.out.println(review);
		
		
	}
}
