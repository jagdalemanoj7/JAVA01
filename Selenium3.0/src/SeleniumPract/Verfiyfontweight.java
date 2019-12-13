package SeleniumPract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Verfiyfontweight {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr=new FirefoxDriver();
		dr.get("https://www.flipkart.com");
		
		// Verify text bold or not by using font-weight
		WebElement login = dr.findElement(By.xpath("(//span[text()='Login'])[1]"));
		String font = login.getCssValue("font-weight");
		int fsize=Integer.parseInt(font);
		System.out.println("Font Size is "+fsize);
		if(fsize>200)
			System.out.println("Text is Bold.");
		else
			System.out.println("Text is not Bold..");
		
	}
}