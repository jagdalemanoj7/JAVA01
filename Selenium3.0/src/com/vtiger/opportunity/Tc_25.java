package com.vtiger.opportunity;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR;
import org.testng.annotations.Test;

import com.vtiger.genericLib.BaseClass;

public class Tc_25 extends BaseClass {
					///////////////////////////////////////////////////////////////////////////////////////////////	
	@Test
	public void Tc_25Test() throws InterruptedException {
		
		//dr.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//	Navigate to Opportunity.		
		WebElement opportunity = dr.findElement(By.xpath("(//a[text()='Opportunities'])[1]"));
		Actions a=new Actions(dr);
		a.moveToElement(opportunity).perform();
		opportunity.click();
		Thread.sleep(5000);
		
		//  Go to QuickCreate & click on new Opportunity
		// By qa = By.id("qccombo");		WebDriverWait wait=new WebDriverWait(dr, 40);		wait.until(ExpectedConditions.visibilityOfElementLocated(qa));
		WebElement quickadd = dr.findElement(By.id("qccombo"));		
		Select s = new Select(quickadd);
		Thread.sleep(5000);
		s.selectByVisibleText("New Opportunity");
		
		// click on Group in Assign To user  create a new Opportunity for every Group in the dropdown
		// [MarketingGroup,Support Group,Team Selling].		
		WebElement organisation = dr.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']"));
		organisation.click();
							
		String parent = dr.getWindowHandle();
		Set<String> child = dr.getWindowHandles();
		Iterator<String> itr = child.iterator();
		while(itr.hasNext()) {
			String refid = itr.next();
			if(!parent.equals(refid)) {
				dr.switchTo().window(refid);
				WebElement select = dr.findElement(By.xpath("//a[text()='MS Corp']"));
				select.click();
				
			}
		}
		
		dr.switchTo().window(parent);	// Switching to parent..
		//Thread.sleep(5000);
		
		dr.findElement(By.name("potentialname")).sendKeys("MS Corp");				
		//Thread.sleep(5000);
		
		dr.findElement(By.xpath("//input[@value='T']")).click();
		WebElement assign = dr.findElement(By.xpath("//select[@name='assigned_group_id']"));
		Select s1=new Select(assign);
		s1.selectByVisibleText("Marketing Group");
		//Thread.sleep(2000);
		// save
		dr.findElement(By.xpath("//input[@value='  Save']")).click();
		
	}
}