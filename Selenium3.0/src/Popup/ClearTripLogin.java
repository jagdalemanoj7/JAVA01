package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
							// lOGIN INTO CLEARTIP 
public class ClearTripLogin {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("https://www.cleartrip.com/");
		
		dr.findElement(By.xpath("//span[text()='Your trips']")).click();
		Thread.sleep(2000);
		// Sign In
		dr.findElement(By.id("SignIn")).click();
		Thread.sleep(2000);
		
		// frame  
		dr.switchTo().frame("modal_window");
		//email
		dr.findElement(By.xpath("//dd/input[@id='email']")).sendKeys("adf@ad.com");
		
	}

}