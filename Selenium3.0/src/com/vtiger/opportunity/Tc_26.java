package com.vtiger.opportunity;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.vtiger.genericLib.BaseClass;

public class Tc_26 extends BaseClass{

	@Test
	public void Tc_26Test() throws InterruptedException {
		
		//	Navigate to Opportunity.
		WebElement opportunity = dr.findElement(By.xpath("(//a[text()='Opportunities'])[1]"));
		Actions a=new Actions(dr);
		a.moveToElement(opportunity).perform();
		opportunity.click();
		Thread.sleep(5000);
		
		//  Go to QuickCreate & click on new Opportunity
		WebElement quickadd = dr.findElement(By.id("qccombo"));
		Select s = new Select(quickadd);
		
		s.selectByVisibleText("New Opportunity");			
		Thread.sleep(2000);
		
		// Create a opportunity without entering any data
		String parent = dr.getWindowHandle();
		Set<String> child = dr.getWindowHandles();
		Iterator<String> itr = child.iterator();
		while(itr.hasNext()) {
			String refid = itr.next();
			if(!parent.equals(refid)) {
				dr.findElement(By.xpath("//input[@value='  Save  ']")).click();
			}			
		}
		// Expected Result:  Alert Should Display with message saying  "Opportunity name can not empty"
		
	}
}