package DropdownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.asm.Advice.Argument;

public class Doubleclick01 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("https://www.google.com");
		
		// Click on Options 
		dr.findElement(By.cssSelector("a[title='Google apps']")).click();
		// Click in googlePlay
		Thread.sleep(2000);    
		// //span[@style=\"background-position:0 -1656px\"]
		dr.findElement(By.xpath("//div[2]/ul[1]/li[9]")).click();
		Thread.sleep(2000);
	 		
		dr.findElement(By.linkText("Go to Google Drive")).click();
		Thread.sleep(2000);
		
		// username
		dr.findElement(By.id("identifierId")).sendKeys("jagdalemanoj7");
		Thread.sleep(1000);
		// next button
		dr.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		//psw
		dr.findElement(By.name("password")).sendKeys("S@1r@m8!49");
		Thread.sleep(1000);
		// next button
		dr.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		// yes
		WebElement d = dr.findElement(By.xpath("(//div[@class='a-HZnjzd-xb-V'])[1]"));
		JavascriptExecutor js=(JavascriptExecutor)dr;
		js.executeScript("argument[0]", d);
		
		Actions a = new Actions(dr);
		a.moveToElement(d).doubleClick().build().perform();
		
	}

}