package com.vtiger.opportunity;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.vtiger.genericLib.BaseClass;

public class SearchOpportunityByContainsOptionWithValidCharactereTc_53 extends BaseClass {
	
	@Test 
	public void SearchOpportunityByContainsOptionWithValidCharacterTc_53Test () {
														
		// Login into application using url				
		//login to CRM with valid data
				
		//navigate to opportunity & click.				
		WebDriverWait wait1=new WebDriverWait(dr, 20);
		try {
				WebElement opportunity = wait1.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("(//a[text()='Opportunities'])[1]"))));
				Actions a=new Actions(dr);
				a.moveToElement(opportunity).perform();
				opportunity.click();
		}
		catch(NoSuchElementException ex) {
		    	System.out.println(ex);
	    }
				
		//click in go to advance search icon.
		WebDriverWait wait2 =new WebDriverWait(dr, 20);
		try {
			    WebElement advance =wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Go to Advanced Search']")));			    			    
			    advance.click();
		}
		catch(NoSuchElementException ex) {
				System.out.println(ex);
		}
		
		//select opportunity name  from dropdown list
			WebElement name = dr.findElement(By.id("fcol0"));
			Select s1=new Select(name);
			s1.selectByVisibleText("Opportunity Name");
				
		//select contains option from another dropdown  box

			WebElement option = dr.findElement(By.id("fop0"));
			Select s2=new Select(option);
			s2.selectByVisibleText("contains");			

		//enter any valid character name of opportunity related to into text box
				WebDriverWait wait5=new WebDriverWait(dr, 20);
				try {
						WebElement input = wait5.until(ExpectedConditions.visibilityOfElementLocated((By.name("fval0"))));				
						input.sendKeys("Marvel");				
				}
				catch(NoSuchElementException ex) {
			    	System.out.println(ex);
			    }

		//click on search now button
				dr.findElement(By.xpath("(//input[@value=' Search Now '])[2]")).click();
								
		//logout and close browser.
				
	}
}