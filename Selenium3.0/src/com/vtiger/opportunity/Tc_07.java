package com.vtiger.opportunity;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.vtiger.genericLib.BaseClass;

public class Tc_07 extends BaseClass{

	@Test
	public void Tc_07Test() throws InterruptedException {

	//	Navigate to Opportunity.
		WebElement opportunity = dr.findElement(By.xpath("(//a[text()='Opportunities'])[1]"));
		Actions a=new Actions(dr);
		a.moveToElement(opportunity).perform();
		opportunity.click();
	
	//	click on "+" image Button to create new Opportunity.
		dr.findElement(By.xpath("//img[@alt='Create Opportunity...']")).click();
		
		dr.findElement(By.xpath("//img[@alt='Select']")).click();
		
		String parent = dr.getWindowHandle();
		Set<String> ids = dr.getWindowHandles();
		Iterator<String> itr = ids.iterator();
		while(itr.hasNext()) {
			String child = itr.next();
			if(!parent.equals(child)) {
				dr.switchTo().window(child);
				dr.findElement(By.xpath("//a[text()='MS Corp']")).click();
			}
		}
		
		Thread.sleep(2000);
		dr.switchTo().window(parent);
		dr.findElement(By.name("potentialname")).sendKeys("MS Corp");;
		Thread.sleep(2000);
		
	//  click on Group in Assign To user  create a new Opportunity for every Group in the dropdown[MarketingGroup,Support Group,Team Selling]
		dr.findElement(By.xpath("//input[@value='T']")).click();
		
		WebElement group = dr.findElement(By.name("assigned_group_id"));
		Select sgroup=new Select(group);
		Thread.sleep(2000);
		sgroup.selectByVisibleText("Team Selling");
		
	//	select below Sales Stage[Prospecting,Qualification,Needs Analysis,Value proposition,Id Decision Makers,Perception Analysis} in Sales Stage dropdown create a new Opportunity
		WebElement stage = dr.findElement(By.name("sales_stage"));
		Select s=new Select(stage);
		Thread.sleep(2000);
		s.selectByValue("Needs Analysis");
		
   //   select CampaignSource through lookup  create a new Opportunity 
		dr.findElement(By.xpath("//input[@name='campaignname']/following-sibling::img")).click();
		String parent1 = dr.getWindowHandle();
		Set<String> ids1 = dr.getWindowHandles();
		Iterator<String> itr1 = ids1.iterator();
		while(itr1.hasNext()) {
			String child1 = itr1.next();
			if(!parent.equals(child1)) {
				dr.switchTo().window(child1);
				dr.findElement(By.xpath("//a[text()='Comp-Oct_2019']")).click();
			}
		}
		
		Thread.sleep(1000);
		dr.switchTo().window(parent1);
		
    // Description
		dr.findElement(By.name("description")).sendKeys("sales stage= Needs Analysis");
		Thread.sleep(2000);
		
	// Save
		dr.findElement(By.xpath("//input[@value='  Save  ']")).click();
		
	}	
}