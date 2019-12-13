package com.vtigerPageFactory.opportunity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.vtiger.genericLib.BaseClass;

public class Tc_29 extends BaseClass {

	@FindBy(xpath="(//a[text()='Opportunities'])[1]")
	private WebElement opportunity;
	@FindBy(id="11")
	private WebElement chk;
	@FindBy(xpath="(//input[@value='Mass Edit'])[1]")
	private WebElement edit;
	@FindBy(xpath="//input[@value='  Save  ']")
	private WebElement save;
	
	public Tc_29(WebDriver dr) {
		PageFactory.initElements(dr, this);
	}
	
	@Test
	public void actionsToTest() {
		 
		opportunity.click();
		chk.click();
		edit.click();
		save.click();
	}
	
	/*
	@Test
	public void Tc_29Test() {
			
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
	*/
}