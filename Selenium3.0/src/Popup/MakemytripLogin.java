package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MakemytripLogin {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("https://www.makemytrip.com/");			
		Thread.sleep(20000);
		
		// notification popup
		//WebElement notify = dr.findElement(By.xpath("html/body/webengagedata/div/iframe[@name='webpush-bubble']"));
		dr.switchTo().frame("webpush-bubble");
		
		// deny notfication
		dr.findElement(By.xpath("//div/button[contains(text(),'I'll do ']")).click();
		Thread.sleep(2000);
		
		// Login link
		WebElement login = dr.findElement(By.xpath("//div/p[text()=' Login or Create Account']"));
		login.click();		
		Thread.sleep(5000);
		
		// usernmae
		WebElement un = dr.findElement(By.xpath("//div/input[@id='username']"));
		un.sendKeys("jagdalemanoj@yahoo.com");
		//JavascriptExecutor js=(JavascriptExecutor)dr;
		//js.executeScript("arguments[0].value='jagdalemanoj@yahoo.com'", un);
		Thread.sleep(2000);
		
		// create new account
		dr.findElement(By.xpath("//span/a[text()=' Create New Account ']")).click();
			
	}
}