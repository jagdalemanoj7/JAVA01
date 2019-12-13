package SeleniumPract;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice04 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		// Category
		WebElement category = dr.findElement(By.xpath("//span[text()='Category']"));
		Actions a=new Actions(dr);
		a.moveToElement(category).perform();
		a.click();
		Thread.sleep(2000);
		
		// laptop frame
		dr.switchTo().frame("ape_Gateway_right-2_desktop_iframe");
		WebElement laptop = dr.findElement(By.xpath("//img[@alt='Laptops']"));
		a.moveToElement(laptop).perform();
		Thread.sleep(2000);
		a.contextClick();
		Thread.sleep(2000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_I);
		
	}
}