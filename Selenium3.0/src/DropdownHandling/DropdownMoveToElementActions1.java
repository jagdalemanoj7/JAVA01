package DropdownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DropdownMoveToElementActions1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("https://www.fatcow.com/");
		// Identify dropdown element
		WebElement rv = dr.findElement(By.linkText("Create a Site"));
		// actions class to perform dropdown actions
		Actions a = new Actions(dr);
		// move to element and perform actions on dropdown  
		a.moveToElement(rv).perform();
		// 
		WebElement rv1 = dr.findElement(By.linkText("Original FatCow"));
		rv1.click();
		
	}

}