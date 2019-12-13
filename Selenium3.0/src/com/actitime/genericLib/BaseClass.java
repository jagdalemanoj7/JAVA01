package com.actitime.genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.objectReportLib.Home;
import com.actitime.objectReportLib.Login;
/**
 * Collection of important functions of Actitime Appln.
 * @author Manoj
 *
 */
public class BaseClass {
	public static WebDriver dr;
			
	@BeforeClass
	public void configBC() throws Throwable {
		/*Launch Browser*/
		String brows=FileLib.getPropertyValues("browser");
		if(brows.equals("firefox")) {
			dr=new FirefoxDriver();
		}
		else if(brows.equals("chrome")) {
			dr=new ChromeDriver();
		}
		else {
			dr=new FirefoxDriver();
		}
		Reporter.log("Browser Launched Successfully..");	
	}

	@BeforeMethod
	public void configBM() throws Throwable {
				
		/*	Open vtiger webapplication using Url.	*/			
		String acti_url=FileLib.getPropertyValues("url");
		String uname= FileLib.getPropertyValues("username");
		String pwd=FileLib.getPropertyValues("password");
		
		/*	login to CRM with Valid data.	*/		
		dr.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		dr.manage().window().maximize();
		
		dr.get(acti_url);
		
		Login.loginToApp(uname, pwd);
		
		Reporter.log("User Succesfully LogIn..");

	}
	
	@AfterMethod
	public void configAM() {
	    // Logout 
		Home.logout();
	    System.out.println("User Successfully Loged Out..");

	}

	@AfterClass
	public void configAC() {
		dr.close();
	}
	
}


/* WebElement user = dr.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
Actions ua=new Actions(dr);
ua.moveToElement(user).perform();
user.click();
//signout.click();*/

/*@FindBy(name="user_name")
private WebElement username;

@FindBy(name="user_password")
private WebElement password;

@FindBy(id="submitButton")
private WebElement submit;

@FindBy(xpath="//a[text()='Sign Out']")
private WebElement signout;

@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
private WebElement user;*/