package SeleniumPract;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cleartrip {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr=new FirefoxDriver();
		dr.get("https://www.cleartrip.com/");
		
		// Enter City in from & to
		dr.findElement(By.id("FromTag")).sendKeys("Pune");
		Thread.sleep(2000);
		dr.findElement(By.id("ToTag")).sendKeys("Mumbai");
		Thread.sleep(2000);
		
		// Select Depart Date
		dr.findElement(By.cssSelector("input[placeholder='Pick a date']")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath("(//a[text()='19'])[1]")).click();
		Thread.sleep(2000);
		
		// Click on Search 
		dr.findElement(By.id("SearchBtn")).click();
		Thread.sleep(10000);		
		
		// Fair
		//tbody[2]/tr/th[6]
		List<WebElement> f = dr.findElements(By.xpath("//tbody[2]/tr/th[6]/span"));
		List<WebElement> fairs = dr.findElements(By.xpath("//th[contains(@id,'BaggageBundlingTemp')]"));
		System.out.println("Count is: "+fairs.size());
		System.out.println("\nFairs of Flight ");
		//TreeSet tt=new TreeSet();
		List al=new ArrayList();
		
		for (WebElement ele : fairs) 
		{			
		    //tt.add(ele.getText());
			al.add(ele.getText());
		}
		
			//Iterator it=tt.iterator();
			Iterator it=al.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}			
				
		Thread.sleep(2000);

		//System.out.println("\n Highest Fair " + Collections.max(tt));
		//System.out.println("\n Lowest Fair " + Collections.min(tt));
		System.out.println("\n Highest Fair " + Collections.max(al));
		System.out.println("\n Lowest Fair " + Collections.min(al));
			
		dr.close();
	}
}