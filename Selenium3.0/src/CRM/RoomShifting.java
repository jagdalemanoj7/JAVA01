package CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RoomShifting {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("https://creator.zoho.com/userhome/jagdalemanoj7/dashboard");
		Thread.sleep(2000);
		
		// iframe
		dr.switchTo().frame(0);
		dr.switchTo().frame(1);
		
		// email
		WebElement id = dr.findElement(By.id("lid"));  //.sendKeys("jagdalemanoj7@gmail.com");
		JavascriptExecutor js = (JavascriptExecutor) dr;
		js.executeScript("", id);
		Thread.sleep(2000);
				
		// pass
		dr.findElement(By.id("pwd")).sendKeys("satyamcorp");
		Thread.sleep(2000);
				
		// Sign In
		dr.findElement(By.id("signin_submit")).click();
		Thread.sleep(2000);
								
		// hotel mgnt
		dr.findElement(By.xpath("(//a[@class='zc-app-access'])[1]")).click();
		Thread.sleep(2000);
		
		// Req. Handling
		dr.findElement(By.xpath("(//span[@style='left: 0px; position: relative; width: 100%;'])[1]")).click();
		Thread.sleep(2000);
		
		// shift a room
		dr.findElement(By.xpath("(//span[text()='Shift a Room'])[1]")).click();
		Thread.sleep(2000);
		

	}
}