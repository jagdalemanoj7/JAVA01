package com.actitime.objectReportLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {
	
	@FindBy(xpath="//div[text()='Tasks']/..")
	private static WebElement taskImg;
	
	@FindBy(xpath="//div[text()='Users']")
	private static WebElement userImg;
	
	@FindBy(linkText="Logout")
	private static WebElement logoutLnk;
	
	public WebElement getTaskImg() {
		return taskImg;
	}
	
	public WebElement getUserImg() {
		return userImg;
	}
	
	public static void logout() {
		logoutLnk.click();
	}
	
}