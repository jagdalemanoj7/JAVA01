package SeleniumPract;
						// TEst Script to open account in facebook..

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenAccountfb {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://facebook.com");
		
		// First Name
		/*
		By rv1 = By.id("u_0_n");
		WebElement ref1 = driver.findElement(rv1);
		ref1.sendKeys("kushu");
		*/
		driver.findElement(By.id("u_0_j")).sendKeys("kushu");

		// Last Name
		driver.findElement(By.id("u_0_l")).sendKeys("shimpi");
		
		// Mobile/Email
		driver.findElement(By.id("u_0_o")).sendKeys("9423391838");
		
		// Password
		driver.findElement(By.id("u_0_v")).sendKeys("kushu@fb");
		
		// Sign Up Button
		driver.findElement(By.id("u_0_11")).click();

				
	}
}