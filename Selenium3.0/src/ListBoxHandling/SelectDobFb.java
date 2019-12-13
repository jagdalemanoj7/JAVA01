package ListBoxHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
							// 	SELECT DOB IN FB 
public class SelectDobFb {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("https://facebook.com");
				
		// Month
		WebElement month = dr.findElement(By.id("month"));
		month.click();
		Thread.sleep(2000);
	
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_A);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		
		Select s=new Select(month);
		Thread.sleep(2000);
		s.selectByIndex(7);
		// s.selectByValue("7");
		// s.selectByVisibleText("Aug");
		
	}
}