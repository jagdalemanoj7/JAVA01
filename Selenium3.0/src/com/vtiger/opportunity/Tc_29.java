package com.vtiger.opportunity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.vtiger.genericLib.BaseClass;

public class Tc_29 extends BaseClass {
	
	@Test
	public void Tc_29Test() {
	//*/		
			//	Navigate to Opportunity.
			WebElement opportunity = dr.findElement(By.xpath("(//a[text()='Opportunities'])[1]"));
			Actions a = new Actions(dr);
			a.moveToElement(opportunity).perform();
			opportunity.click();
			
			// click on checkbox in Opportunities list.
			dr.findElement(By.id("11")).click();
			
			// click on Edit in the left Side above opportunities list.
			dr.findElement(By.xpath("(//input[@value='Mass Edit'])[1]")).click();
						
			//Dont Modify the Data And save
			//dr.findElement(By.name("description")).sendKeys("KK Enterprices");
		    dr.findElement(By.xpath("//input[@value='  Save  ']")).click();

	}
}