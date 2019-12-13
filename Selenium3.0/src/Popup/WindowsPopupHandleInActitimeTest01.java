package Popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.guide.ClickableWindow;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * Print Windows Popup Handle In Actitime  
 * @author admin
 *
 */
public class WindowsPopupHandleInActitimeTest01 {

	@Test
	public void WindowsPopupHandleInActitimeTest01_Tc01() throws AWTException {
		
		/*	Open the site	*/
		/*WebDriver dr = new FirefoxDriver();*/
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://admin-pc/login.do");
		/*Reporter.log(s);*/
		
		/*	Login into Actitime app		*/
		dr.findElement(By.name("username")).sendKeys("admin");
		dr.findElement(By.name("pwd")).sendKeys("manager");
		dr.findElement(By.id("loginButton")).click();
		
		/*	Click on Report Menu	*/
		dr.findElement(By.xpath("//a[@class='content reports']")).click();
		
		
		/*	Click on first report	*/
		dr.findElement(By.xpath("//td[@class='content-cell']")).click();
		
		/*	Click on Print Link		*/
		dr.findElement(By.xpath("//a[text()='Print']")).click();
		
		/*	Click on Print Button of Print Window 	*/
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		
		/*	CLick on Logout		*/
		dr.findElement(By.xpath("//a[text()='Logout'")).click();
		
		/*	Close Browser	*/
		dr.close();
		
	}	
}