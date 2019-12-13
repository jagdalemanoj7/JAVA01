package Popup;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopupPractice02 {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("http://the-internet.herokuapp.com/javascript_alerts");
		 Thread.sleep(2000);
		
		// Simple Alert
		dr.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(2000);
		dr.switchTo().alert().accept();
		Thread.sleep(2000);
		
		// Confirmation popup
		dr.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(2000);
		Alert a = dr.switchTo().alert();
		Thread.sleep(2000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_UP);		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_SPACE);
		Thread.sleep(2000);
		a.accept();
		
		// Prompt Popup
		dr.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(2000);
		Alert a2 = dr.switchTo().alert();
		a2.sendKeys("Hello");
		Thread.sleep(2000);
		a2.accept();
		
	}
}