package xpath;
// ADD TO COMPARE CHECKBOX CHECK
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckboxFlip {
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
	
		Thread.sleep(2000);
		// Add to Compare Check for mobile
		String exp="//div[contains(text(),'(Neptune Blue, 64 GB)')]/ancestor::a//label[1]/div[1]";
		WebElement ele = driver.findElement(By.xpath(exp));
		ele.click();
		boolean status = ele.isSelected();
		System.out.println(" Selection Status "+status);
		
		if(status)
			System.out.println(" Checkbox is Cliked.");
		else
			System.out.println(" Checkbox is not Cliked..");
		
		
	}
}