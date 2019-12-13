package NestedIframe;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Goibibo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("https://www.goibibo.com/");
		Thread.sleep(2000);
		
		
		// Sign In
		dr.findElement(By.linkText("Sign In")).click();
		
		// iframe
		WebElement login_frame = dr.findElement(By.xpath("//iframe[contains(@src,'/accounts/register/?iframe=1&next')]"));
		dr.switchTo().frame(login_frame);

		//	WebElement ele = dr.findElement(By.xpath("//input[@id='authMobile']"));
		JavascriptExecutor js=(JavascriptExecutor)dr;
		js.executeScript("document.getElementById('authMobile').value='892339989' ");
		Thread.sleep(2000);
		dr.findElement(By.xpath("//button[@id='mobileSubmitBtn']")).click();
		
	}
}