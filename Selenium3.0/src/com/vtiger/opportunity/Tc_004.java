package com.vtiger.opportunity;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.vtiger.genericLib.BaseClass;

public class Tc_004 extends BaseClass {
    
	@Test
	public void Tc_001Test() throws InterruptedException {
		
		//  Navigate to Opportunity.
		WebElement opportunity = dr.findElement(By.xpath("(//a[text()='Opportunities'])[1]"));
		Actions a=new Actions(dr);
		a.moveToElement(opportunity).perform();
		opportunity.click();
		Thread.sleep(2000);
		
		//  Click on create filters
		//WebElement filter = 
		dr.findElement(By.xpath("//a[text()='Create Filter']")).click();
		
		//	Enter all view name and start date
		dr.findElement(By.name("viewName")).sendKeys("sri");
		
		JavascriptExecutor js=(JavascriptExecutor)dr;
		js.executeScript("window.scrollBy(0,0)");
		
		dr.findElement(By.id("jscal_trigger_date_start")).click();
		Thread.sleep(5000);
	    dr.findElement(By.id("jscal_field_date_start")).sendKeys("2019-11-04");
	    /*
		int count=0; String my=null;
		while(count<=6)
		{
			try {		
     				dr.findElement(By.xpath("(//td[text()='November, 2019'])[1]")).click();     				
     				
     				List<WebElement> alldates = dr.findElements(By.xpath("//tr[@class='daysrow']"));
     				for (WebElement ref : alldates) {
						String date = ref.getText();
						if(date.equalsIgnoreCase("4")) {
							ref.click();
							break;
						}
					}
     				/*WebElement date = dr.findElement(By.xpath("/(//td[text()='4'])[2]"));
     				JavascriptExecutor js1=(JavascriptExecutor)dr;
     				js1.executeScript("arguments[0].click()", date);	
     				
			}
			catch(Exception e) {
				dr.findElement(By.xpath("//tr[@class='headrow']/td[text()='›']")).click();
				count++;
			}
		//	System.out.println(my);
		}

		if(count==6) {
			System.out.println(" Invalid Date..");
		}
		Thread.sleep(10000);
		*/
		//  Save
		//dr.findElement(By.xpath("@title='Save [Alt+S]'")).click();

	}
}
//input[@name='campaignname']/following-sibling::img