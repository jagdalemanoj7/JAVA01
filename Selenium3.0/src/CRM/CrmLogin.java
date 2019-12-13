package CRM;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class CrmLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("https://www.zoho.com/");		
		
		// Sign up
		dr.findElement(By.xpath("(//em[@style='opacity: 1; visibility: visible;'])[2]")).click();		
		Thread.sleep(2000);

		// Login
		dr.findElement(By.linkText("LOGIN")).click();
		Thread.sleep(2000);
		
		// email
		dr.findElement(By.id("lid")).sendKeys("jagdalemanoj7@gmail.com");
		Thread.sleep(2000);
		
		// pass
		dr.findElement(By.id("pwd")).sendKeys("satyamcorp");
		Thread.sleep(2000);
		
		// Sign In
		dr.findElement(By.id("signin_submit")).click();
		Thread.sleep(10000);
		
		// code verficatn
		dr.findElement(By.id("code"));
		Thread.sleep(10000);
		
		// verify
		dr.findElement(By.id("verify_button")).click();
		Thread.sleep(10000);
		
		// hotel mgnt
		Screen s=new Screen();
		String path="../Selenium3.0/pics/hotel_mgnt.png";
		File f=new File(path);
		String abs_path=f.getAbsolutePath();
		Pattern p1=new Pattern(abs_path);
		s.click();
		//----------------------------------------------------------------		
		//WebElement app = dr.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]"));
		//WebElement app = dr.findElement(By.xpath("(//a[@class=\"zc-app-access\"])[1]"));
		 //app.click();
		//JavascriptExecutor js=(JavascriptExecutor) dr;
		//js.executeScript("arguments[0].click()", app);
		//----------------------------------------------------------------
		Thread.sleep(2000);
				
		// Req. Handling
		dr.findElement(By.xpath("(//span[@style='left: 0px; position: relative; width: 100%;'])[1]")).click();
		Thread.sleep(2000);
				
		// shift a room
		dr.findElement(By.xpath("(//span[text()='Shift a Room'])[1]")).click();
		Thread.sleep(2000);
				
	}
}