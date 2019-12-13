package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
			// 		WTS TO VERIFY TEXT IS CREATED BOLD OR NOT USING FONT-WEIGHT ATTRIBUTE.  
public class Script02 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr=new FirefoxDriver();
		dr.get("https://www.facebook.com");

		//	
		//WebElement ele = dr.findElement(By.className("//div[contains(text(),'Create a new ')]"));
		WebElement ele = dr.findElement(By.xpath("//label[text()='Female']"));		
		String fw1 = ele.getCssValue("font-weight");
		int fw=Integer.parseInt(fw1);		
		System.out.println(fw);
		
		if(fw >= 400)
			System.out.println("Text is Bold.");
		else
			System.out.println("Text is not Bold.");
		
		//		
		
		
	}
}