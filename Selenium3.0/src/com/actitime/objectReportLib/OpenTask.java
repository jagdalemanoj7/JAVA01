package com.actitime.objectReportLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenTask {

	@FindBy(linkText="Project & Customers")
	private WebElement projectandCustomerLnk;
	
	public WebElement getProjectandCustomerLnk() {
		return projectandCustomerLnk;
	}
}
