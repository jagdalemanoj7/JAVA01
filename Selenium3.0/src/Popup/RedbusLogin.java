package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
											//	 LOGIN TO REDBUS SITE
public class RedbusLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("https://www.redbus.in/");		

		// SignUp Dropdown  
		dr.findElement(By.id("sign-in-icon-down")).click();
		Thread.sleep(2000);
		// Sign-Up
		dr.findElement(By.id("signInLink")).click();
		Thread.sleep(5000);
		// Switch to frame.
		WebElement frame = dr.findElement(By.xpath("//iframe[contains(@src,'/account?pageName=Home')]"));
		dr.switchTo().frame(frame);
		Thread.sleep(2000);
		// SignInWithfb		
		dr.findElement(By.xpath("//div[@class='social FC DIB active ']/div[6]")).click();
		Thread.sleep(2000);
		
	}

}
