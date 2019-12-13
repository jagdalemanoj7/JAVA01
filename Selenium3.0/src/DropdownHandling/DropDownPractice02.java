package DropdownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDownPractice02 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		
		// Udemy
		dr.get("https://www.udemy.com/topic/java/");
		
		WebElement category = dr.findElement(By.xpath("//span[text()='Categories']"));
		Actions a=new Actions(dr);
		a.moveToElement(category).perform();
		Thread.sleep(2000);
		
		WebElement dev = dr.findElement(By.xpath("//span[text()='Development']"));
		a.moveToElement(dev).perform();
		Thread.sleep(2000);
		
		WebElement alldev = dr.findElement(By.xpath("//span[text()='All Development']"));
		alldev.click();
	
	
		
		
		
		/* 	geeksforgeeks
		dr.get("https://www.geeksforgeeks.org/browser-automation-using-selenium/");
		Actions a=new Actions(dr);
		WebElement algo = dr.findElement(By.partialLinkText("Algo "));
		a.moveToElement(algo);
		
		WebElement topic = dr.findElement(By.partialLinkText("Topicwise "));
		a.moveToElement(topic);
		
		dr.findElement(By.linkText("Searching Algorithms")).click();
		
			*/
		
		/* //	Techbeamer
		dr.get("https://www.techbeamers.com/latest-selenium-interview-questions-and-answers/");
		// python dropdwn
		Actions a=new Actions(dr);
		WebElement source = dr.findElement(By.xpath("//a[@title='Python Tutorials for Beginners']"));		
		WebElement target = dr.findElement(By.xpath("//a[@title='Python Examples']"));
		
		a.moveToElement(source).perform();
		Thread.sleep(2000);
		target.click();
		 	*/

	}
}