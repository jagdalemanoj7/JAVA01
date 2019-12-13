package Datepicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectCheckboxActitime {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr=new FirefoxDriver();
		dr.get("http://admin-pc/login.do");
		
		dr.findElement(By.name("username")).sendKeys("admin");
		dr.findElement(By.name("pwd")).sendKeys("manager");
		dr.findElement(By.id("loginButton")).click();
		
		Thread.sleep(2000);
		// Click on task
		dr.findElement(By.xpath("(//img[@class='sizer'])[1]")).click();
		
		Thread.sleep(2000);
		// 1. SELECT CHECKBOX IN FORWARD DIRECTION
		List<WebElement> ref = dr.findElements(By.xpath("//input[@type='checkbox']"));		
		
		for (WebElement ele : ref) 
		{
			ele.click();
		}
		
		Thread.sleep(2000);
		
		// 2. Uncheck checkbox in reverse directoin
		
		for(int i=ref.size()-1;i>=0;i--)
		{
			Thread.sleep(2000);
			ref.get(i).click();
		}
		
		// select 1st and last
		Thread.sleep(2000);
		ref.get(0).click();
		Thread.sleep(2000);
		ref.get(ref.size()-1).click();
		Thread.sleep(2000);
		// Deselect[again click to chkbx] 				
		dr.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();	
		Thread.sleep(2000);
		dr.findElement(By.xpath("(//input[@type='checkbox'])[last]")).click();		
		
	}
}