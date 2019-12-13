package com.vtiger.opportunity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.vtiger.genericLib.BaseClass;

public class Tc_002 extends BaseClass {
    
	@Test
	public void Tc_002Test() {
		
		//  Navigate to Opportunity.
		WebElement opportunity = dr.findElement(By.xpath("(//a[text()='Opportunities'])[1]"));
		Actions a=new Actions(dr);
		a.moveToElement(opportunity).perform();
		opportunity.click();

		//  Click on create filters
		WebElement filter = dr.findElement(By.xpath("//a[text()='Create Filter']"));
		
		// SAVE WITHOUT ANY DATA....
									//		Enter all valid data
									//		dr.findElement(By.name("viewName")).sendKeys("sri");
		
		//  Save
		dr.findElement(By.xpath("@title='Save [Alt+S]'")).click();

	}
}
