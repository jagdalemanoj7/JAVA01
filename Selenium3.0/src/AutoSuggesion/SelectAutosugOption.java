package AutoSuggesion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectAutosugOption {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr=new FirefoxDriver();
		dr.get("https://www.trivago.in");

		// Search 
		WebElement search = dr.findElement(By.name("sQuery"));
		search.sendKeys("p");
		
		Thread.sleep(2000);
		
		// select autosuggesion option pune
		// APPROACH 01
		dr.findElement(By.xpath("//span[text()='une']")).click();
		
		/*
		// APPROACH 02
		List<WebElement> ref = dr.findElements(By.xpath("//mark[text()='P']"));
		for(WebElement ele : ref)		{
			String txt = ele.getText();
			if(txt.contains("Pune"))
				
		}
		*/
	}

}