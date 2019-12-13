package DropdownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AddToCartMantra01 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("https://www.myntra.com");
		
		// profile
		WebElement profile = dr.findElement(By.xpath("//div[@class='desktop-userIconsContainer']"));
		Actions a=new Actions(dr);
		a.moveToElement(profile).perform();
		Thread.sleep(2000);
		
		// Login
		WebElement login = dr.findElement(By.xpath("//a[text()='log in']"));		
		a.moveToElement(login).perform();
		login.click();
		Thread.sleep(2000);		
		// email
		dr.findElement(By.name("email")).sendKeys("sagarkk3@yahoo.com");
		Thread.sleep(2000);
		// pass
		dr.findElement(By.name("password")).sendKeys("sagshopy@1");
		Thread.sleep(2000);
		// signin
		dr.findElement(By.xpath("//button[text()='Log in']")).click();
		Thread.sleep(2000);
		
		WebElement category = dr.findElement(By.xpath("(//a[@href=\"/shop/men\"])[1]"));
		a.moveToElement(category).perform();
		Thread.sleep(2000);
		WebElement subcategory = dr.findElement(By.xpath("//a[@href=\"/men-tshirts\"]"));
		a.moveToElement(subcategory).perform();
		subcategory.click();
		Thread.sleep(2000);
		
		
		/*
		 @FindBy(xpath="(//a[@href=\"/shop/men\"])[1]")
	private WebElement category;
	//@FindBy(xpath="(//a[@data-reactid='30'])")
	@FindBy(xpath="//a[@href=\"/men-tshirts\"]")
	private WebElement subcategory;
	@FindBy(xpath="(//span[text()='Add to bag'])[7]")
	private WebElement product;
	@FindBy(xpath="(//button[text()='XL'])[7]")
	private WebElement size; 
	//CArt
	@FindBy(xpath="(//span[text()='Bag'])")
	private WebElement cart;
	
	*/
		
	}
}