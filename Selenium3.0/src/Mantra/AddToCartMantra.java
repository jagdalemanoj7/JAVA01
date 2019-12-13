package Mantra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCartMantra {

	//@FindBy(xpath="//a[@class='myntraweb-sprite mobile-mUser sprites-user']") 	private WebElement dashboard;
	
	@FindBy(xpath="//div[@class='desktop-userIconsContainer']")
	private WebElement profile;
	@FindBy(xpath="//a[text()='log in']")
	private WebElement login;
	//@FindBy(xpath="//a[text()='Sign up']")	private WebElement signup;
	@FindBy(name="email")
	private WebElement email;
	@FindBy(name="password")
	private WebElement pass;
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement loginbtn;
	
	// Register @FindBy(name="mobile")	private WebElement mobile;	@FindBy(xpath="//input[@id='male']")	private WebElement gender;    @FindBy(xpath="//button[text()='REGISTER']")	private WebElement register;
	
	//@FindBy(xpath="//a[@data-group='men']")			   
	@FindBy(xpath="//a[@data-reactid=\"21\"]")
	private WebElement category;
	//@FindBy(xpath="(//a[@data-reactid='30'])")
	@FindBy(xpath="//a[@data-reactid=\"30\"]")
	private WebElement subcategory;
	@FindBy(xpath="(//span[text()='Add to bag'])[7]")
	private WebElement product;
	@FindBy(xpath="(//button[text()='XL'])[2]")
	private WebElement size; 
	//CArt
	@FindBy(xpath="(//span[text()='Bag'])")
	private WebElement cart;
	
	Actions a,a1;	WebDriverWait wait; JavascriptExecutor js; 
	public AddToCartMantra(WebDriver dr) {
		PageFactory.initElements(dr, this);
		//dr.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		wait=new WebDriverWait(dr, 5);
		a = new Actions(dr);
		a1=new Actions(dr);
		js=(JavascriptExecutor)dr;
	}
	
	public void setcredential(String email1, String pass1) {	//, String mobile1
		
		//a.moveToElement(dashboard).perform();		dashboard.click();
		
		a.moveToElement(profile).perform();
		//profile.click();
		a.moveToElement(login).perform();
		login.click();
		email.sendKeys(email1);		
		pass.sendKeys(pass1);
		//	mobile.sendKeys(mobile1);		gender.click();		register.click();
		
		try {
				loginbtn.click();
				Thread.sleep(5000);
				// Add to Cart/Bag
				a1.moveToElement(category).perform();
				Thread.sleep(5000);
				a1.moveToElement(subcategory).perform();
				js.executeScript("arguments[0].click();", subcategory);
				Thread.sleep(5000);
				js.executeScript("arguments[0].click();", product);
				Thread.sleep(5000);
				js.executeScript("arguments[0].click();", size);				
				
		} catch (InterruptedException e1) {			}
		
		//try { wait.until(ExpectedConditions.elementToBeClickable(loginbtn)); loginbtn.click(); }	catch(TimeoutException e) {			System.out.println("******loginbtn Element Disabled..!");		}		
		//try {	wait.until(ExpectedConditions.elementToBeClickable(category));	a1.moveToElement(category).perform();		subcategory.click();		}		catch(TimeoutException e) {			System.out.println("******Categ Element Disabled..!");		}		
		//	category.click();				
		//try {			wait.until(ExpectedConditions.elementToBeClickable(subcategory));			a1.moveToElement(subcategory).perform();			subcategory.click();		}		catch(TimeoutException e) {			System.out.println("******Sub-catg Element Disabled..!");		}		
		//try {a1.moveToElement(category).perform();	Thread.sleep(5000);	} catch (InterruptedException e) {	e.printStackTrace();	}
							
	}
}