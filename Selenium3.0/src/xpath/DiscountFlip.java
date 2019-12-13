package xpath;
// DISPLAY PERCENTAGE DISCOUNT 
import org.omg.Messaging.SyncScopeHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DiscountFlip {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://flipkart.com");
	
		// close login windows
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();;
			// driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
		 
		// enter text in search field
		driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys("mobiles");
			// driver.findElement(By.name("q")).sendKeys("mobiles");
		
		// click on search button
		driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
			//  driver.findElement(By.className("vh79eN")).click();
	
		Thread.sleep(2000);
		// 
		String exp="//div[contains(text(),'7 Pro (Neptune Blue, 64 GB)')]/../..//div[@class='VGWI6T']";
		
		String discount = driver.findElement(By.xpath(exp)).getText();
		System.out.println("Discount is: "+discount);
		
		
	}
}