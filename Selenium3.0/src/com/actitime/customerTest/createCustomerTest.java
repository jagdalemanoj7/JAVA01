package com.actitime.customerTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.actitime.genericLib.BaseClass;
import com.actitime.genericLib.FileLib;
import com.actitime.objectReportLib.ActiveProAndCust;
import com.actitime.objectReportLib.CreateCustomer;
import com.actitime.objectReportLib.Home;
import com.actitime.objectReportLib.OpenTask;

public class createCustomerTest extends BaseClass {
	
	@Test
	public void createCustomerTest_Tc() throws Throwable {
		
		/*	Read data from excel	*/
		String customerName = FileLib.getExcelData("Sheet1", 1, 2);
		/*String customerDesp = FileLib.getExcelData("sheet2", 2, 3);*/
		
		/*	Navigate to Task Page	*/
		Home hp = PageFactory.initElements(dr, Home.class);
		hp.getTaskImg().click();
		
		/*	Click on Project and customer Link	*/
		OpenTask op = PageFactory.initElements(dr, OpenTask.class);
		op.getProjectandCustomerLnk().click();
		
		/*click create new customer button*/
		ActiveProAndCust act = PageFactory.initElements(dr, ActiveProAndCust.class);
		act.getCreateNewCustomerBtn().click();
		
		/*create customer*/
		CreateCustomer ccp = PageFactory.initElements(dr, CreateCustomer.class);
		ccp.createCustomer(customerName);
		
		/*Verify*/
		String actMsg = act.getCustomerSuccessmsg().getText();
		boolean stat = actMsg.contains("successfully created");
		Assert.assertTrue(stat);
				
	}
}