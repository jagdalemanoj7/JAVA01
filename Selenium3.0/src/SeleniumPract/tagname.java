package SeleniumPract;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tagname {
	public static void main(String[] args) {
		
		// Open Browser
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		// Webpage
		driver.get("file:///E:/tagname.html");
		
		// Enter UserName
		By rv = By.tagName("input");		
		WebElement ref = driver.findElement(rv);
		ref.sendKeys("admin");
		
		// Enter Password
		// By rv1 = By.tagName("input");
		// WebElement ref1 = driver.findElement(rv1);		
		// ref1.sendKeys("admin@123");
				
	}
}
