package Popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Handling Authentication popup in javascript alert. 
 * @author admin
 *
 */

public class Authentication_JavaScriptAlertsTest01 {

	@Test
	public void Authentication_JavaScriptAlertsTest01_Tc01() throws Throwable {
		
		/*	WebDriver dr = new ChromeDriver(); 	CHROME NOT WORKING FOR AUTHENTICATION SITES... */
		WebDriver dr = new FirefoxDriver();	
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.manage().window().maximize();
		
		/*By giving credentials in url*/
		/*dr.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");*/
									/*	OR	*/
		
		/*By using Robot class*/
		dr.get("https://the-internet.herokuapp.com/basic_auth");
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_D);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_D);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
				
	}
}