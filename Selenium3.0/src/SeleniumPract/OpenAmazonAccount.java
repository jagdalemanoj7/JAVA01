package SeleniumPract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenAmazonAccount {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.amazon.in");
		
		// Dropdown Click
		driver.findElement(By.id("nav-link-yourAccount")).click();
		//driver.findElement(By.className("nav-icon nav-arrow")).click();
		
		// LogIn click
		driver.findElement(By.id("createAccountSubmit")).click();
		
		// Name
		driver.findElement(By.id("ap_customer_name")).sendKeys("Krushna");
		
		// Mobile
		driver.findElement(By.id("ap_phone_number")).sendKeys("9823304927");
		
		// Email
		driver.findElement(By.id("ap_email")).sendKeys("krush@yahoo.com");
		
		// Password
		driver.findElement(By.id("ap_password")).sendKeys("krush@123");
		
		// LogIn button
		driver.findElement(By.id("continue")).click();
		
	}
}