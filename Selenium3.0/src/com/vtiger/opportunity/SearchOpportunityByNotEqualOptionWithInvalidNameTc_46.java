package com.vtiger.opportunity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.vtiger.genericLib.BaseClass;

public class SearchOpportunityByNotEqualOptionWithInvalidNameTc_46 extends BaseClass {

	@Test
	public void SearchOpportunityByNotEqualOptionWithInvalidNameTc_46Test() {
		//  Open Browser and Login into application using url		
		
        //  navigate to opportunity & click.
				Actions a=new Actions(dr);
				WebDriverWait wait1=new WebDriverWait(dr, 20);
				WebElement opportunity = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Opportunities'])[1]")));
			    a.moveToElement(opportunity).perform();
			    opportunity.click();			    
			    
	    //  click in go to advance search icon.
			    WebDriverWait wait2 = new WebDriverWait(dr, 20);
			    WebElement advance =wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Go to Advanced Search']")));			    			    
			    advance.click();
			    			    			   			   
        //  select opportunity name  from dropdown list
			    WebElement name = dr.findElement(By.id("fcol0"));
			    Select s=new Select(name);
			    s.selectByVisibleText("Opportunity Name");
			    
	    //	select starts with option from another dropdown box		    	
			    WebElement type = dr.findElement(By.id("fop0"));
			    Select s1=new Select(type);
			    //s.selectByValue("n");
			    s1.selectByVisibleText("not equal to");
			    
	    //  enter any valid character of opportunity related to into text box
			    WebDriverWait wait5 = new WebDriverWait(dr, 20);
			    WebElement input = wait5.until(ExpectedConditions.visibilityOfElementLocated(By.id("fval0")));
			    input.sendKeys("Marvel corp");
			    			    
        //  click on search now button
			    dr.findElement(By.xpath("(//input[@value=' Search Now '])[2]")).click();
			    //Thread.sleep(15000);			    			    			    			   			    			   
   	    // logout and close browser.
			    
	}
}

//		not equal to		Marvel corp