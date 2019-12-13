package SeleniumPract;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class pracrice {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("http://www.facebook.com");

		// dob
		WebElement month = dr.findElement(By.id("month"));
		month.click();
		Thread.sleep(2000);
		// Select class 
		Select s = new Select(month);
		// select particular value using selectByVisibleText or selectById or selectByValue 
		s.selectByVisibleText("Aug");
		
		// Total No. options in listbox 
		List<WebElement> ele = s.getOptions();
		System.out.println(" Total options in listbox: " +ele.size());
		
		// Display all the options in listbox.
		System.out.println(" Options in List are: ");		
		ArrayList<String> ele1=new ArrayList<String>();		
		for (int i = 0; i < ele.size(); i++) 
		{
			String txt = ele.get(i).getText();
			ele1.add(txt);			
			System.out.println(txt);			
		}
		
		System.out.println("\n Sorted List: ");
		// Print list in alpha order
		/*
		for (int i = 0; i < ele.size(); i++) {
			String txt = ele.get(i).getText();
			ele1.add(txt);		
		}
		*/
		Collections.sort(ele1);		
		for (int i = 0; i < ele1.size(); i++) {
			System.out.println(ele1.get(i));
		}
				
	}
}