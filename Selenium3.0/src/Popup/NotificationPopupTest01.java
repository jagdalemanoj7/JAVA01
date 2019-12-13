package Popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NotificationPopupTest01 {
	
	@Test
	public void NotificationPopupTest01_Tc01(){
		
	/*
		FirefoxOptions fOption=new FirefoxOptions();
		fOption.addArguments("--disable-notifications");
		
		WebDriver dr=new FirefoxDriver(fOption);
		 			OR										*/
		
		WebDriver dr = new FirefoxDriver();
		/* dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);*/
		/* Open App	*/
		dr.get("https://www.makemytrip.com/");
		
		/*main frame*/				
		WebDriverWait wait1=new WebDriverWait(dr, 20);
		try {
				wait1.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("webklipper-publisher-widget-container-notification-frame"));
		
				dr.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
		
		}catch(Exception e) {	}
		
		Reporter.log("REached at frame..");
				
		dr.findElement(By.xpath("//a[@class='close']")).click();
		Reporter.log("================= iframe Closed Succesfully...======================");
		
	}
}