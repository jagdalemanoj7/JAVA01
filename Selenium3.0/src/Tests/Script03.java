package Tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

				// WTS TO COUNT TOTAL NP OF LINGKS ENABLEED AND DISAVLED
public class Script03 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr=new FirefoxDriver();
		//dr.get("https://www.facebook.com");
		dr.get("https://www.google.com/");
		// 
		int count=0,enabled=0,disabled=0;
		List<WebElement> ref = dr.findElements(By.tagName("a"));
		
		for (WebElement ele : ref) 
		{				
			String tag = ele.getTagName();
						 
			if(tag.equals("a") && ele.isEnabled())
			{
				count++;
				enabled++;
			}
			
			else
			{
				disabled++;
			}
			
		}
				
		System.out.println("Link count "+count);
		System.out.println("Links Enabled "+enabled);
		System.out.println("Links Disabled "+disabled);
		
	}
}