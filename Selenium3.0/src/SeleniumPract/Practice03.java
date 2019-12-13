package SeleniumPract;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice03 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("http://www.flipkart.com");

		// close login windows
		dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();;
					// driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
		Thread.sleep(2000);
		
		// select
		//WebElement electonics = dr.findElement(By.xpath("/html/body/div/div/div[2]/div/ul/li/span[text()='Electronics']"));		
		WebElement electonics = dr.findElement(By.xpath("//span[text()='Electronics']"));
		Actions a=new Actions(dr);
		a.moveToElement(electonics).perform();		
		Thread.sleep(2000);
		
		WebElement sam = dr.findElement(By.xpath("(//a[@title='Samsung'])[1]"));
		a.moveToElement(sam).perform();
		a.click();
		Thread.sleep(2000);
		
		
				
	}
}
