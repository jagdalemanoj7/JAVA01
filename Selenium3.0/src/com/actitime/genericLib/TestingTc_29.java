package com.actitime.genericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.vtiger.opportunity.Tc_29;

public class TestingTc_29 {

	WebDriver driver;
	@Test
	public void execute() { 
		BaseClass a = PageFactory.initElements(driver,BaseClass.class);
		/*a.configBC();
		a.configBM();
		a.configAC();
		a.configAM();*/
		
		PageFactory.initElements(driver, Tc_29.class);
		
	}
}
