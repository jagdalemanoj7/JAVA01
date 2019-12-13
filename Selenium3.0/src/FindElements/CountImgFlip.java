package FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
// COUNT TOTAL NO OF IMAGES IN FLIPKART
public class CountImgFlip {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://flipkart.com");
	
		// close login windows
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();;
			// driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
		 Thread.sleep(2000);
		// Total no. of images in flipkart
		List<WebElement> ref = driver.findElements(By.tagName("img"));
		int count=ref.size();
		System.out.println("\n Total No. of Image Count: "+count);
		
	}
}
