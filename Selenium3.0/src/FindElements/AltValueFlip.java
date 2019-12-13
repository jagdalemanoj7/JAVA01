package FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

// DISPLAY ALL ALT ATTRIBUTE PROPERTY VALUES OF IMAGE.
public class AltValueFlip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://flipkart.com");
	
		// close login windows
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();;
			// driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
		 Thread.sleep(2000);
		 
		int c=0;
		List<WebElement> ref = driver.findElements(By.tagName("img"));
		System.out.println("Total No. of Images "+ref.size());		
		System.out.println();
		
		for (WebElement ele : ref) {
			c++;
			String txt = ele.getAttribute("alt");
			System.out.println(c+". "+txt);
		}
	}

}