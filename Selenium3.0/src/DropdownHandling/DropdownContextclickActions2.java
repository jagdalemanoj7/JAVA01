package DropdownHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DropdownContextclickActions2 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("https://www.fatcow.com/");
		// Identify Image
		WebElement img = dr.findElement(By.id("fat-cow"));
		
		// Move to element 
		Actions a = new Actions(dr);
		a.moveToElement(img).perform();
		Thread.sleep(2000);
		// Right click on image
		a.contextClick().perform();
		Thread.sleep(2000);
		// Click on view image
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_I);
				
	}

}
