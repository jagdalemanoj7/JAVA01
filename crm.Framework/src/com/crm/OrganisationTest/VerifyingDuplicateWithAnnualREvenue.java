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

import com.crm.GenericLib.BaseClass;
import com.crm.GenericLib.FileLib;
import com.crm.OrganisationTest.*;

public class VerifyingDuplicateWithAnnualREvenue extends BaseClass 
{
	@Test(groups = {"SmokeTesting"})
	public void AnnualRevenueTest() throws Throwable
	{
		FileLib flib =new FileLib();

		//verify the login page
		String loginTitle = driver.getTitle().replaceAll(" ", "");
		String expTitle ="vtiger CRM 5 - Commercial Open Source CRM".replaceAll(" ", "");
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
			
			String available = flib.getExcelData("Sheet1", 3, 2);
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
			
			//verify "Annual Revenue" is displayed in Fields to be matched on
			Assert.assertTrue(flag);
			
			/*if(flag)
				System.out.println("Annual Revenue is displayed in Fields to be matched on box ==> Pass");
			else
				System.out.println("Annual Revenue is not displayed in Fields to be matched on box ==> Fail");*/
			
			
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
public void AsignedToTest() throws Throwable 
{
	FileLib flib =new FileLib();


	//verify the login page
		String loginTitle = driver.getTitle().replaceAll(" ", "");
		String expTitle ="vtiger CRM 5 - Commercial Open Source CRM".replaceAll(" ","");
		Assert.assertEquals(loginTitle, expTitle);
		
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
		
	/*	if(act.equals(exp))
			System.out.println("Merging Criteria Selection page is Displayed ==> Pass");
		else
			System.out.println("Merging Criteria Selection page is Nogt Displayed ==> Pass");*/
		
	//available fields
		WebElement avail = driver.findElement(By.xpath("//select[@id='availList']"));
		Select sel = new Select(avail);
		
		String available =  flib.getExcelData("Sheet1", 4, 2);
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
		
		//verify "Assigned To" is displayed in Fields to be matched on
		
		Assert.assertTrue(flag);
		
		/*if(flag)
			System.out.println("Assigned TO is displayed in Fields to be matched on box ==> Pass");
		else
			System.out.println("Assigned To is not displayed in Fields to be matched on box ==> Fail");*/
		
		
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
public void BillingAddressTest() throws Throwable 
{
	FileLib flib =new FileLib();
	//verify the login page
		String loginTitle = driver.getTitle().replaceAll(" ", "");
		String expTitle ="vtiger CRM 5 - Commercial Open Source CRM".replaceAll(" ", "");
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
		
		String available = flib.getExcelData("Sheet1", 5, 2);
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
		
		//verify "Billing Address" is displayed in Fields to be matched on
		Assert.assertTrue(flag);
		
		/*if(flag)
			System.out.println("Billing Address is displayed in Fields to be matched on box ==> Pass");
		else
			System.out.println("Billing Address is not displayed in Fields to be matched on box ==> Fail");*/
		
		
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
public void EmployesTest() throws Throwable 
{
	FileLib flib =new FileLib();

	//verify the login page
		String loginTitle = driver.getTitle().replaceAll(" ", "");
		String expTitle ="vtiger CRM 5 - Commercial Open Source CRM".replaceAll(" ", "");
		Assert.assertEquals(loginTitle, expTitle);
		
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
		
		String available =  flib.getExcelData("Sheet1", 6, 2);
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
		
		//verify "Employees" is displayed in Fields to be matched on
		Assert.assertTrue(flag);
		
		/*if(flag)
			System.out.println("Employees is displayed in Fields to be matched on box ==> Pass");
		else
			System.out.println("Employees is not displayed in Fields to be matched on box ==> Fail");*/
		
		
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
				System.out.println("Alert Message is Displayed ==> Fail");*/
		}
		catch(Throwable e)
		{
			System.out.println("Alert Message is not displayed ==> pass");
		}
		
}



@Test(groups = {"RegressionTesting"})
public void IndustryTest() throws Throwable 
{
	FileLib flib =new FileLib();

//verify the login page
		String loginTitle = driver.getTitle().replaceAll(" ", "");
		String expTitle ="vtiger CRM 5 - Commercial Open Source CRM".replaceAll(" ", "");
		Assert.assertEquals(loginTitle, expTitle);
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
	/*	if(actOrgTitle.equals(expOrgTitle))
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
		
		String available =  flib.getExcelData("Sheet1", 7, 2);
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
		
		//verify "Industry" is displayed in Fields to be matched on
		Assert.assertTrue(flag);
		
		/*if(flag)
			System.out.println("Industry is displayed in Fields to be matched on box ==> Pass");
		else
			System.out.println("Industry is not displayed in Fields to be matched on box ==> Fail");*/
		
		
	//click on Find Duplicated Button
		driver.findElement(By.xpath("//input[@value='Find Duplicates']")).click();
		
	//check for alert message
		try
		{
			String expAlText = "Available no Duplicate Records".replaceAll(" ", "");
			Alert al = driver.switchTo().alert();
			
			String actAlText = al.getText().replaceAll(" ", "");
			Assert.assertEquals(actAlText,expAlText);
			
			/*if(actAlText.equals(expAlText))
				System.out.println("Alert Message is Displayed ==> Fail");*/
		}
		catch(Throwable e)
		{
			System.out.println("Alert Message is not displayed ==> pass");
		}
		
}

























}
		