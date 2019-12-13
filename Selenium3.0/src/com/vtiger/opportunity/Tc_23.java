package com.vtiger.opportunity;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.vtiger.genericLib.BaseClass;

public class Tc_23 extends BaseClass {

	@Test
	public void Tc_23Test() {
		
		//	Navigate to Opportunity.
		WebElement opportunity = dr.findElement(By.xpath("(//a[text()='Opportunities'])[1]"));
		Actions a = new Actions(dr);
		a.moveToElement(opportunity).perform();
		opportunity.click();
		//Thread.sleep(5000);
		
		//  Go to QuickCreate & click on new Opportunity.
		WebElement quickadd = dr.findElement(By.id("qccombo"));
		Select s = new Select(quickadd);
		//Thread.sleep(2000);
		s.selectByVisibleText("New Opportunity");			
		
		WebElement related = dr.findElement(By.id("related_to_type"));
		Select s1 = new Select(related);
		s1.selectByValue("Contacts");
				
		
		//Enter the mandatory details &select contact in RelatedTo dropdown and select  one contact through lookup & 
				//	 create a new Opportunity								
		WebElement contact = dr.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']"));
		contact.click();
				
		String parent = dr.getWindowHandle();
		Set<String> child = dr.getWindowHandles();
		Iterator<String> itr = child.iterator();
		while(itr.hasNext()) {
			String refid = itr.next();
			if(!parent.equals(refid)) {
				dr.switchTo().window(refid);
				WebElement select = dr.findElement(By.xpath("//a[text()='Ganesh s']"));
				select.click();
				
			}
		}
		
		dr.switchTo().window(parent);
		dr.findElement(By.name("potentialname")).sendKeys("Ganesh s");			
		dr.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
			
	}
}