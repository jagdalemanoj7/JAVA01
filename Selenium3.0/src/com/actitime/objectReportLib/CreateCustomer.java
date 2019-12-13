package com.actitime.objectReportLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateCustomer {
	
	@FindBy(name="name")
	private WebElement customerNameEdt;
	
	@FindBy(name="createCustomerSubmit")
	private WebElement createCustomerBtn;
	
	@FindBy(name="description")
	private WebElement createDescpEdt;
	
	public WebElement getCustomerNameEdt() {
		return customerNameEdt;
	}
	
	public WebElement getCreateCustomer(String customerName) {
		return createCustomerBtn;
	}
	
	public void createCustomer(String customerName) {
		customerNameEdt.sendKeys("customerName");
		createCustomerBtn.click();
	}
	
	public void createCustomer(String customerName, String desp) {
		customerNameEdt.sendKeys(customerName);
		createDescpEdt.sendKeys(desp);
		createCustomerBtn.click();		
	}
}