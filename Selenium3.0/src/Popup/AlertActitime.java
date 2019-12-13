package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertActitime {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("http://admin-pc/login.do");
		// LOGIN
		dr.findElement(By.name("username")).sendKeys("admin");
		dr.findElement(By.name("pwd")).sendKeys("manager");
		dr.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		// task
		dr.findElement(By.xpath("//a[@class=\"content tasks\"]")).click();
		Thread.sleep(2000);
		// Archieves
		//dr.findElement(By.linkText("Archives")).click();
		//Thread.sleep(2000);
		// select task
		dr.findElement(By.xpath("//input[@name='taskSelected[41]']")).click();
		Thread.sleep(2000);
		// Delete task
		dr.findElement(By.xpath("//input[@value=\"Delete Selected Tasks\"]")).click();
		Thread.sleep(2000);
	
		// shift focus to alert
		Alert a = dr.switchTo().alert();
		String str = a.getText();
		System.out.println("alert: "+str);
		// OK
		a.accept();
		
	}
}