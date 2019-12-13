package com.vtiger.genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public  class BaseClass {
	public static WebDriver dr;

	// Launch the browser.
	@Parameters("Browser")
	@BeforeTest
	/*@BeforeClass*/
	public void configBC(String browsername) {
		System.out.println("Launch Browser");
		if(browsername.equals("firefox"))
			dr=new FirefoxDriver();
		else if(browsername.equals("chrome")){
			dr=new ChromeDriver();					
		}
	}

	// LogIn into app
	@BeforeMethod	
	public void configBM() {
		System.out.println("User Succesfully LogIn");
		//	Open vtiger webapplication using Url.	
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.manage().window().maximize();
		dr.get("http://localhost:8888/index.php?action=Login&module=Users");
		
		//	login to CRM with Valid data.
		dr.findElement(By.name("user_name")).sendKeys("admin");
		dr.findElement(By.name("user_password")).sendKeys("manager");
		dr.findElement(By.id("submitButton")).click();

	}
	
	// Logout browser 
	@AfterMethod
	public void configAM() {
	    // Logout
	    WebElement user = dr.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	    Actions ua=new Actions(dr);
	    ua.moveToElement(user).perform();
	    
	    dr.findElement(By.xpath("//a[text()='Sign Out']")).click();
	    
	    System.out.println("User Successfully Loged Out..");

	}

	
	// Closing browser
	@AfterTest
	/*@AfterClass*/
	public void configAC() {		
		
		try 
	    { 
			Alert al= dr.switchTo().alert(); 
	         al.accept();
	    }   // try 
	    catch (NoAlertPresentException Ex) 
	    {  }   // catch 
		
		dr.close();
	    
	}	
}





 /*		
		Alert al = dr.switchTo().alert();
		String alertmsg = al.getText();
		Assert.assertEquals(alertmsg, "undefined");
		Assert.assertTrue(true);
	    al.accept();
		
	    Assert.assertTrue(false);
	    Assert.assertEquals(alertmsg, "under");

					// OR		

   if(alertmsg.equals("undefined")) {
	    	al.accept();
	    }
	    else {
		dr.close();
	    }
 */