package com.actitime.objectReportLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
	/** 
	 * @author admin
	 * 
	 */
public class Login { /*  						Rule-1	*/

	/*	Identification and Initialization of Element
	  											Rule-2	*/
	@FindBy(name="username")
	private static WebElement usernameEdt;
	@FindBy(name="pwd")
	private static WebElement passwordEdt;
	@FindBy(id="loginButton")
	private static WebElement loginbtn;
	
	/* Usage 									Rule-3	*/
	public WebElement getUsernameEdt() {
		return usernameEdt;
	}
	
	public WebElement getPasswordEdt() {
		return passwordEdt;
	}
	
	public WebElement getLoginBtn() {
		return loginbtn;
	}
	
	/* Business Method							Rule-4	*/
	public static void loginToApp(String userName, String password) {
		
		usernameEdt.sendKeys(userName);
		passwordEdt.sendKeys(password);
		loginbtn.click();
		
	}	
}