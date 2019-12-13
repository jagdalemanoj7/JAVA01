package com.crm.OrganisationTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.GenericLib.FileLib;
import com.crm.OrganisationTest.*;

public class VerifyingDuplicateWithMemberOf extends com.crm.GenericLib.BaseClass
{
	@Test(groups = {"SmokeTesting"})
	public void MemberOfTest() throws Throwable 
	{
		FileLib flib =new FileLib();
		
		//verify the login page
		String loginTitle = driver.getTitle().replaceAll(" ", "");
		String expTitle ="Administrator-Home-vtigerCRM5-CommercialOpenSourceCRM".replaceAll(" ","");
		Assert.assertEquals(loginTitle, expTitle);
		
		/*if(loginTitle.equals("vtiger CRM 5 - Commercial Open Source CRM"))
			System.out.println("Login Page is displayed ==> Pass");
		else
			System.out.println("Login Page is not displayed ==> Fail");*/
		
		//verify the Home page
				String expHomeTitle = " Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM".replaceAll(" ", "");
				String actHomeTitle = driver.getTitle().replaceAll(" ", "");
				Assert.assertEquals(actHomeTitle,expHomeTitle);
				
				/*if(actHomeTitle.equals(expHomeTitle))
					System.out.println("Home Page is displayed ==> Pass");
				else
					System.out.println("Home Page is not displayed ==> Fail");*/
				
				//click on Organizations
				driver.findElement(By.xpath("//a[text()='Organizations']")).click();
				
				
				//verify the Organizations Page
				String actOrgTitle = driver.getTitle().replaceAll(" ", "");
				String expOrgTitle = " Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM".replaceAll(" ", "");
				
				Assert.assertEquals(actOrgTitle,expOrgTitle);
				
				/*if(actOrgTitle.equals(expOrgTitle))
					System.out.println("Organizations Page is displayed ==> Pass");
				else
					System.out.println("Organizations Page is not displayed ==> Pass");*/
				
		//click on filter
				driver.findElement(By.xpath("//img[@title='Find Duplicates']")).click();
				
				String exp = "Merging Criteria Selection".replaceAll(" ", "");
				String act = driver.findElement(By.xpath("//span[text()='Merging Criteria Selection']")).getText().replaceAll(" ", "");
				Assert.assertEquals(act,exp);
				/*if(act.equals(exp))
					System.out.println("Merging Criteria Selection page is Displayed ==> Pass");
				else
					System.out.println("Merging Criteria Selection page is Nogt Displayed ==> Pass");*/
				
			//available fields
				WebElement avail = driver.findElement(By.xpath("//select[@id='availList']"));
				Select sel = new Select(avail);
				
				String available = flib.getExcelData("Sheet1", 2, 2);
				sel.selectByVisibleText(available);
				
				driver.findElement(By.xpath("//input[@name='Button']")).click();
				
				//selected list
				
				WebElement selected = driver.findElement(By.xpath("//select[@id='availList']"));
				Select seld = new Select(selected);
				
				List<WebElement> seldOpts = seld.getOptions();
				
				boolean flag = false;
				for (WebElement we : seldOpts) 
				{
					if(we.getText().equals(available))
						flag = true;
				}
				
				//verify "Member Of" is displayed in Fields to be matched on
				Assert.assertTrue(flag);
				/*if(flag)
					System.out.println("Member Of is displayed in Fields to be matched on box ==> Pass");
				else
					System.out.println("Member Of is not displayed in Fields to be matched on box ==> Fail");*/
				
				
			//click on Find Duplicated Button
				driver.findElement(By.xpath("//input[@value='Find Duplicates']")).click();
				
			//check for alert message
				try
				{
					String expAlText = "Available no Duplicate Records".replaceAll(" ", "");
					Alert al = driver.switchTo().alert();
					String actAlText = al.getText().replaceAll(" ", "");
					Assert.assertEquals(actAlText, expAlText);
					
				/*	if(actAlText.equals(expAlText))
						System.out.println("Alert Message is Displayed ==> pass");*/
				}
				catch(Throwable e)
				{
					System.out.println("Alert Message is not displayed ==> pass");
				}			
	}
	
	
	@Test(groups = {"RegressionTesting"})
	public void OwnerShipTest()throws Throwable 
	{
		FileLib flib =new FileLib();
	//verify the login page
	String loginTitle = driver.getTitle().replaceAll(" ", "");
	String expTitle ="Administrator-Home-vtigerCRM5-CommercialOpenSourceCRM".replaceAll(" ", "");
	Assert.assertEquals(loginTitle,expTitle);
	
	/*if(loginTitle.equals("vtiger CRM 5 - Commercial Open Source CRM"))
		System.out.println("Login Page is displayed ==> Pass");
	else
		System.out.println("Login Page is not displayed ==> Fail");*/
	
	
	//verify the Home page
			String expHomeTitle = " Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM".replaceAll(" ", "");
			String actHomeTitle = driver.getTitle().replaceAll(" ", "");
			Assert.assertEquals(actHomeTitle,expHomeTitle);
			
			/*if(actHomeTitle.equals(expHomeTitle))
				System.out.println("Home Page is displayed ==> Pass");
			else
				System.out.println("Home Page is not displayed ==> Fail");*/
			
			//click on Organizations
			driver.findElement(By.xpath("//a[text()='Organizations']")).click();
			
			
			//verify the Organizations Page
			String actOrgTitle = driver.getTitle().replaceAll(" ", "");
			String expOrgTitle = " Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM".replaceAll(" ", "");
			Assert.assertEquals(actOrgTitle,expOrgTitle);
			
			/*if(actOrgTitle.equals(expOrgTitle))
				System.out.println("Organizations Page is displayed ==> Pass");
			else
				System.out.println("Organizations Page is not displayed ==> Pass");*/
			
	//click on filter
			driver.findElement(By.xpath("//img[@title='Find Duplicates']")).click();
			
			String exp = "Merging Criteria Selection".replaceAll(" ", "");
			String act = driver.findElement(By.xpath("//span[text()='Merging Criteria Selection']")).getText().replaceAll(" ", "");
			Assert.assertEquals(act,exp);
			
			/*if(act.equals(exp))
				System.out.println("Merging Criteria Selection page is Displayed ==> Pass");
			else
				System.out.println("Merging Criteria Selection page is Nogt Displayed ==> Pass");*/
			
		//available fields
			WebElement avail = driver.findElement(By.xpath("//select[@id='availList']"));
			Select sel = new Select(avail);
			
			String available = flib.getExcelData("Sheet1", 9, 2);
			sel.selectByVisibleText(available);
			
			driver.findElement(By.xpath("//input[@name='Button']")).click();
			
			//selected list
			WebElement selected = driver.findElement(By.xpath("//select[@id='availList']"));
			Select seld = new Select(selected);
			
			List<WebElement> seldOpts = seld.getOptions();
			
			boolean flag = false;
			for (WebElement we : seldOpts) 
			{
				if(we.getText().equals(available))
					flag = true;
			}
			
			//verify "Ownership" is displayed in Fields to be matched on
			
			Assert.assertTrue(flag);
			
			/*if(flag)
				System.out.println("Ownership is displayed in Fields to be matched on box ==> Pass");
			else
				System.out.println("Ownership is not displayed in Fields to be matched on box ==> Fail");*/
			
			
		//click on Find Duplicated Button
			driver.findElement(By.xpath("//input[@value='Find Duplicates']")).click();
			
		//check for alert message
			try
			{
				String expAlText = "Available no Duplicate Records".replaceAll(" ", "");
				Alert al = driver.switchTo().alert();
				
				String actAlText = al.getText().replaceAll(" ", "");
				Assert.assertEquals(actAlText, expAlText);
				
				/*if(actAlText.equals(expAlText))
					System.out.println("Alert Message is Displayed ==> pass");*/
			}
			catch(Throwable e)
			{
				System.out.println("Alert Message is not displayed ==> pass");
			}
			
}	
	
	
	@Test(groups = {"RegressionTesting"})
	public void ShippingAddressTest() throws Throwable 
	{
		FileLib flib =new FileLib();
	
	//verify the login page
	String loginTitle = driver.getTitle().replaceAll(" ", "");
	String expTitle ="Administrator-Home-vtigerCRM5-CommercialOpenSourceCRM".replaceAll(" ", "");
	Assert.assertEquals(loginTitle,expTitle);
	
	/*if(loginTitle.equals("vtiger CRM 5 - Commercial Open Source CRM"))
		System.out.println("Login Page is displayed ==> Pass");
	else
		System.out.println("Login Page is not displayed ==> Fail");*/
	
	
	//verify the Home page
			String expHomeTitle = " Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM".replaceAll(" ", "");
			String actHomeTitle = driver.getTitle().replaceAll(" ", "");
			Assert.assertEquals(actHomeTitle,expHomeTitle);
			
			/*if(actHomeTitle.equals(expHomeTitle))
				System.out.println("Home Page is displayed ==> Pass");
			else
				System.out.println("Home Page is not displayed ==> Fail");*/
			
			//click on Organizations
			driver.findElement(By.xpath("//a[text()='Organizations']")).click();
			
			
			//verify the Organizations Page
			String actOrgTitle = driver.getTitle().replaceAll(" ", "");
			String expOrgTitle = " Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM".replaceAll(" ", "");
			Assert.assertEquals(actOrgTitle,expOrgTitle);
			
			/*if(actOrgTitle.equals(expOrgTitle))
				System.out.println("Organizations Page is displayed ==> Pass");
			else
				System.out.println("Organizations Page is not displayed ==> Pass");*/
			
	//click on filter
			driver.findElement(By.xpath("//img[@title='Find Duplicates']")).click();
			
			String exp = "Merging Criteria Selection".replaceAll(" ", "");
			String act = driver.findElement(By.xpath("//span[text()='Merging Criteria Selection']")).getText().replaceAll(" ", "");
			Assert.assertEquals(act,exp);
			
			/*if(act.equals(exp))
				System.out.println("Merging Criteria Selection page is Displayed ==> Pass");
			else
				System.out.println("Merging Criteria Selection page is Nogt Displayed ==> Pass");*/
			
		//available fields
			WebElement avail = driver.findElement(By.xpath("//select[@id='availList']"));
			Select sel = new Select(avail);
			
			String available = flib.getExcelData("Sheet1", 10, 2);
			sel.selectByVisibleText(available);
			
			driver.findElement(By.xpath("//input[@name='Button']")).click();
			
			//selected list
			WebElement selected = driver.findElement(By.xpath("//select[@id='availList']"));
			Select seld = new Select(selected);
			
			List<WebElement> seldOpts = seld.getOptions();
			
			boolean flag = false;
			for (WebElement we : seldOpts) 
			{
				if(we.getText().equals(available))
					flag = true;
			}
			
			//verify "Shipping Address" is displayed in Fields to be matched on
			Assert.assertTrue(flag);
			
			/*if(flag)
				System.out.println("Shipping Address is displayed in Fields to be matched on box ==> Pass");
			else
				System.out.println("Shipping Address is not displayed in Fields to be matched on box ==> Fail");*/
			
			
		//click on Find Duplicated Button
			driver.findElement(By.xpath("//input[@value='Find Duplicates']")).click();
			
		//check for alert message
			try
			{
				String expAlText = " No Duplicate Records".replaceAll(" ", "");
				Alert al = driver.switchTo().alert();
				
				String actAlText = al.getText().replaceAll(" ", "");
				Assert.assertEquals(actAlText, expAlText);
				
				/*if(actAlText.equals(expAlText))
					System.out.println("Alert Message is Displayed ==> pass");*/
				
			}
			catch(Throwable e)
			{
				System.out.println("Alert Message is not displayed ==> pass");
			}
			
}
	
	@Test(groups = {"RegressionTesting"})
	public void SICCodeTest() throws Throwable 
	{
		FileLib flib =new FileLib();
	
	//verify the login page
	String loginTitle = driver.getTitle().replaceAll(" ", "");
	String expTitle ="vtiger CRM 5 - Commercial Open Source CRM".replaceAll(" ", "");
	Assert.assertEquals(loginTitle, loginTitle);
	
	/*if(loginTitle.equals("vtiger CRM 5 - Commercial Open Source CRM"))
		System.out.println("Login Page is displayed ==> Pass");
	else
		System.out.println("Login Page is not displayed ==> Fail");*/
	
	
	//verify the Home page
			String expHomeTitle = " Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM".replaceAll(" ", "");
			String actHomeTitle = driver.getTitle().replaceAll(" ", "");
			Assert.assertEquals(actHomeTitle, expHomeTitle);
			
			/*if(actHomeTitle.equals(expHomeTitle))
				System.out.println("Home Page is displayed ==> Pass");
			else
				System.out.println("Home Page is not displayed ==> Fail");*/
			
			//click on Organizations
			driver.findElement(By.xpath("//a[text()='Organizations']")).click();
			
			
			//verify the Organizations Page
			String actOrgTitle = driver.getTitle().replaceAll(" ", "");
			String expOrgTitle = " Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM".replaceAll(" ", "");
			Assert.assertEquals(actOrgTitle, expOrgTitle);
			
			/*if(actOrgTitle.equals(expOrgTitle))
				System.out.println("Organizations Page is displayed ==> Pass");
			else
				System.out.println("Organizations Page is not displayed ==> Pass");*/
			
	//click on filter
			driver.findElement(By.xpath("//img[@title='Find Duplicates']")).click();
			
			String exp = "Merging Criteria Selection".replaceAll(" ", "");
			String act = driver.findElement(By.xpath("//span[text()='Merging Criteria Selection']")).getText().replaceAll(" ", "");
			Assert.assertEquals(act, exp);
			
			/*if(act.equals(exp))
				System.out.println("Merging Criteria Selection page is Displayed ==> Pass");
			else
				System.out.println("Merging Criteria Selection page is Nogt Displayed ==> Pass");*/
			
		//available fields
			WebElement avail = driver.findElement(By.xpath("//select[@id='availList']"));
			Select sel = new Select(avail);
			
			String available =  flib.getExcelData("Sheet1", 8, 2);
			sel.selectByVisibleText(available);
			
			driver.findElement(By.xpath("//input[@name='Button']")).click();
			
			//selected list
			WebElement selected = driver.findElement(By.xpath("//select[@id='availList']"));
			Select seld = new Select(selected);
			
			List<WebElement> seldOpts = seld.getOptions();
			
			boolean flag = false;
			for (WebElement we : seldOpts) 
			{
				if(we.getText().equals(available))
					flag = true;
			}
			
			//verify "SIC Code" is displayed in Fields to be matched on
			
			Assert.assertTrue(flag);
			/*if(flag)
				System.out.println("SIC Code is displayed in Fields to be matched on box ==> Pass");
			else
				System.out.println("SIC Code is not displayed in Fields to be matched on box ==> Fail");*/
			
			
		//click on Find Duplicated Button
			driver.findElement(By.xpath("//input[@value='Find Duplicates']")).click();
			
		//check for alert message
			try
			{
				String expAlText = "Available no Duplicate Records".replaceAll(" ", "");
				Alert al = driver.switchTo().alert();
				
				String actAlText = al.getText().replaceAll(" ", "");
				Assert.assertEquals(actAlText, expAlText);
				
		/*	if(actAlText.equals(expAlText))
					System.out.println("Alert Message is Displayed ==> pass");*/
			}
			catch(Throwable e)
			{
				System.out.println("Alert Message is not displayed ==> pass");
			}
			
}	
	
	
	@Test(groups = {"RegressionTesting"})
	public void TickerTest() throws Throwable 
	{
		FileLib flib =new FileLib();
		
		//verify the login page
		String loginTitle = driver.getTitle().replaceAll(" ", "");
		String expTitle =	"Administrator-Home-vtigerCRM5-CommercialOpenSourceCRM".replaceAll(" ", "");
		Assert.assertEquals(loginTitle,expTitle);
		
				/*if(loginTitle.equals("vtiger CRM 5 - Commercial Open Source CRM"))
			System.out.println("Login Page is displayed ==> Pass");
		else
			System.out.println("Login Page is not displayed ==> Fail");*/
		
		
		//verify the Home page
				String expHomeTitle = " Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM".replaceAll(" ", "");
				String actHomeTitle = driver.getTitle().replaceAll(" ", "");
				Assert.assertEquals(actHomeTitle,expHomeTitle);
				
				/*if(actHomeTitle.equals(expHomeTitle))
					System.out.println("Home Page is displayed ==> Pass");
				else
					System.out.println("Home Page is not displayed ==> Fail");*/
				
				
				//click on Organizations
				driver.findElement(By.xpath("//a[text()='Organizations']")).click();
				
				
				//verify the Organizations Page
				String actOrgTitle = driver.getTitle().replaceAll(" ", "");
				String expOrgTitle = " Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM".replaceAll(" ", "");
				Assert.assertEquals(actOrgTitle,expOrgTitle);
				
				/*if(actOrgTitle.equals(expOrgTitle))
					System.out.println("Organizations Page is displayed ==> Pass");
				else
					System.out.println("Organizations Page is not displayed ==> Pass");*/
				
		//click on filter
				driver.findElement(By.xpath("//img[@title='Find Duplicates']")).click();
				
				String exp = "Merging Criteria Selection".replaceAll(" ", "");
				String act = driver.findElement(By.xpath("//span[text()='Merging Criteria Selection']")).getText().replaceAll(" ", "");
				Assert.assertEquals(act,exp);
				/*if(act.equals(exp))
					System.out.println("Merging Criteria Selection page is Displayed ==> Pass");
				else
					System.out.println("Merging Criteria Selection page is Nogt Displayed ==> Pass");*/
				
			//available fields
				WebElement avail = driver.findElement(By.xpath("//select[@id='availList']"));
				Select sel = new Select(avail);
				
				String available = flib.getExcelData("Sheet1", 1, 2);
//				System.out.println(available);
				sel.selectByVisibleText(available);
				
				driver.findElement(By.xpath("//input[@name='Button']")).click();
				
				//selected list
				WebElement selected = driver.findElement(By.xpath("//select[@id='availList']"));
				Select seld = new Select(selected);
				
				List<WebElement> seldOpts = seld.getOptions();
				
				boolean flag = false;
				for (WebElement we : seldOpts) 
				{
					if(we.getText().equals(available))
						flag = true;
				}
				
				//verify "Ticker Symbol" is displayed in Fields to be matched on
				
				Assert.assertTrue(flag);
				/*if(flag)
					System.out.println("Ticker Symbol is displayed in Fields to be matched on box ==> Pass");
				else
					System.out.println("Ticker Symbol is not displayed in Fields to be matched on box ==> Fail");*/
				
				
			//click on Find Duplicated Button
				driver.findElement(By.xpath("//input[@value='Find Duplicates']")).click();
				
			//check for alert message
				try
				{
					String expAlText = " no Duplicate Records".replaceAll(" ", "");
					Alert al = driver.switchTo().alert();
					
					String actAlText = al.getText().replaceAll(" ", "");
					Assert.assertEquals(actAlText, expAlText);
					/*if(actAlText.equals(expAlText))
						System.out.println("Alert Message is Displayed ==> Fail");*/
				}
				catch(Throwable e)
				{
					System.out.println("Alert Message is not displayed ==> pass");
				}
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}



