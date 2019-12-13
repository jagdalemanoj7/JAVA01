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

											//	createOpportunityWithSalesStage
public class Tc_11 extends BaseClass {

	@Test
	public void Tc_21Test() throws InterruptedException {

		// Navigate to Opportunity.
		WebElement opportunity = dr.findElement(By.xpath("(//a[text()='Opportunities'])[1]"));
		Actions a = new Actions(dr);
		a.moveToElement(opportunity).perform();
		opportunity.click();

		// click on "+" image Button to create new Opportunity.
		dr.findElement(By.xpath("//img[@alt='Create Opportunity...']")).click();

		dr.findElement(By.xpath("//img[@alt='Select']")).click();

		String parent = dr.getWindowHandle();
		Set<String> ids = dr.getWindowHandles();
		Iterator<String> itr = ids.iterator();
		while (itr.hasNext()) {
			String child = itr.next();
			if (!parent.equals(child)) {
				dr.switchTo().window(child);
				dr.findElement(By.xpath("//a[text()='MS Corp']")).click();
			}
		}

		Thread.sleep(5000);
		dr.switchTo().window(parent);
		dr.findElement(By.name("potentialname")).sendKeys("MS Corp");
		;
		Thread.sleep(2000);
		// select below Sales Stage[Prospecting,Qualification,Needs Analysis,Value
		// proposition,Id Decision Makers,Perception Analysis} in Sales Stage dropdown
		// create a new Opportunity
		WebElement stage = dr.findElement(By.name("sales_stage"));
		Select s = new Select(stage);
		Thread.sleep(2000);
		s.selectByValue("Qualification");

		// Description
		dr.findElement(By.name("description")).sendKeys("sales stage= Qualification");
		Thread.sleep(2000);

		// Save
		dr.findElement(By.xpath("//input[@value='  Save  ']")).click();
	}
}