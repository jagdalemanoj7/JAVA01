package EbayPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	//@FindBy(xpath="//a[text()='Login & Signup']")
	@FindBy(xpath="//a[text()=' My eBay']")
	private WebElement ebay;	
	//@FindBy(partialLinkText="Create an account")
	@FindBy(linkText="create an account")
	private WebElement registration;	
	@FindBy(xpath="//input[@id='firstname']")
	private WebElement fname;
	@FindBy(xpath="//input[@id='lastname']")
	private WebElement lname;
	@FindBy(xpath="//input[@id='email']")
	private WebElement email;
	@FindBy(xpath="//input[@id='PASSWORD']")
	private WebElement pass;
	@FindBy(xpath="//button[@id='ppaFormSbtBtn']")
	private WebElement signup;
	
	/*
	@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']")
	private WebElement mobile;
	@FindBy(xpath="//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
	private WebElement pass;
	@FindBy(xpath="//div[@class='_1avdGP']")
	private WebElement login;
	*/
	Actions a;
	
	public AddToCart(WebDriver dr)
	{
		PageFactory.initElements(dr, this);
		a = new Actions(dr);
	}
	
	public void setCredentials(String fname1,String lname1,String email1,String pass1)
	//public void setCredentials(String mobile1,String pass1)
	{		
		a.moveToElement(ebay).perform();
		ebay.click();		
		//mobile.sendKeys(mobile1);		pass.sendKeys(pass1);		login.click();		
		//a.moveToElement(registration).perform();
		registration.click();		fname.sendKeys(fname1);		lname.sendKeys(lname1);		
		email.sendKeys(email1);		pass.sendKeys(pass1);		signup.click();		
		
	}	
}