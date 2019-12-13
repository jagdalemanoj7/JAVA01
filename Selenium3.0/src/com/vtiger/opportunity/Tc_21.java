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

public class Tc_21 extends BaseClass {

	@Test
	public void Tc_21Test() throws InterruptedException{
		
		//		Navigate to Opportunity.
				WebElement opportunity = dr.findElement(By.xpath("(//a[text()='Opportunities'])[1]"));
				Actions a=new Actions(dr);
				a.moveToElement(opportunity).perform();
				a.click();
				
		//      Go to QuickCrete & click on new Opportunity.
				WebElement quickadd = dr.findElement(By.id("qccombo"));
				Select s=new Select(quickadd);
				Thread.sleep(2000);
				s.selectByVisibleText("New Opportunity");

		//		Enter the mandatory details & create a new Opportunity
				dr.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")).click();
				
				String parent = dr.getWindowHandle();
				Set<String> ids = dr.getWindowHandles();
				Iterator<String> itr=ids.iterator();
				while(itr.hasNext()) {
					String child = itr.next();
					if(!parent.equals(child)) {
						dr.switchTo().window(child);						
						WebElement select = dr.findElement(By.xpath("//a[text()='Qspy systems']"));
						select.click();
					}
				}
				
        // 		Again switch to parent window. and save data/record.
				dr.switchTo().window(parent);
				dr.findElement(By.name("potentialname")).sendKeys("Qspy systems");	
					
				//Alert al=dr.switchTo().alert();
				//al.accept();

				dr.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
				
				
	}
}