package com.vtiger.opportunity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.vtiger.genericLib.BaseClass;
						//		search opportunity by relatad to 
public class SearchOpportunityByNotEqualOptionWithInvalidCharacterNameTc_51 extends BaseClass {
	
	@Test
	public void SearchOpportunityByNotEqualOptionWithInvalidCharacterNameTc_51Test() {//throws InterruptedException {

		//dr.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		// Login into application using url		
		// login to CRM with valid data
		
        //  navigate to opportunity & click.
				Actions a=new Actions(dr);
				WebDriverWait wait1=new WebDriverWait(dr, 20);
				try {
						WebElement opportunity = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Opportunities'])[1]")));
						a.moveToElement(opportunity).perform();
						opportunity.click();
				}
				catch(NoSuchElementException ex) {
						System.out.println(ex);
				}
			    
	    //  click in go to advance search icon.
			    WebDriverWait wait2 = new WebDriverWait(dr, 20);
			    try {
			    	WebElement advance =wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Go to Advanced Search']")));			    			    
			    	advance.click();
			    }	
			    catch(NoSuchElementException ex) {
			    	System.out.println(ex);
			    }
        //  select opportunity name  from dropdown list
			    WebElement name = dr.findElement(By.id("fcol0"));
			    Select s=new Select(name);
			    s.selectByVisibleText("Opportunity Name");
			    
	    //	select does not equals to option from another dropdown box		    	
			    WebElement type = dr.findElement(By.id("fop0"));
			    Select s1=new Select(type);
			    //s.selectByValue("n");
			    s1.selectByVisibleText("not equal to");
			    
	    //  enter any invalid name of opportunity related to into text box
			    WebDriverWait wait5 = new WebDriverWait(dr, 20);
			    try {			   
			    		WebElement input = wait5.until(ExpectedConditions.visibilityOfElementLocated(By.id("fval0")));
			    		input.sendKeys("sr");
			    }
			    catch(NoSuchElementException ex) {
			    	System.out.println(ex);
			    }
        //  click on search now button
			    dr.findElement(By.xpath("(//input[@value=' Search Now '])[2]")).click();
			    			    			    			    			   			    			   
   	    // logout and close browser.
			    
	}
}


/*
	Alert al = dr.switchTo().alert();
	al.accept();

 		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		//  dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//  login to vtiger app. using url.
		dr.get("http://localhost:8888/index.php?action=Login&module=Users");

		//  login to CRM with valid data.		
				dr.findElement(By.name("user_name")).sendKeys("admin");
				dr.findElement(By.name("user_password")).sendKeys("manager");
				dr.findElement(By.id("submitButton")).click();


		//  Logout
			    WebElement user = dr.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
			    Actions ua=new Actions(dr);
			    ua.moveToElement(user).perform();
			    
			    dr.findElement(By.xpath("//a[text()='Sign Out']")).click();
			    dr.close();
			    		    
		//	 Go to Basic Search
			    //WebElement basic =dr.findElement(By.xpath("//a[text()='Go to Basic Search']"));
			    //WebElement basic = dr.findElement(By.xpath(".html/body/table[4]/tbody/tr/td[2]/div/form/table/tbody/tr/td/span/a[text()='Go to Basic Search']"));
			    //WebElement basic = dr.findElement(By.linkText("Go to Basic Search"));
			    //Go to Advanced Search
			    // javascript 
			    //JavascriptExecutor js=(JavascriptExecutor)dr;
			    //js.executeScript("arguments[0].click()",basic);
*/