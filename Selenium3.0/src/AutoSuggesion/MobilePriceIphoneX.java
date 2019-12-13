package AutoSuggesion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MobilePriceIphoneX {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr=new FirefoxDriver();
		dr.get("https://www.flipkart.com");
		
		int count=0;
		// Print Mobile Price Iphone X
		// CLose Starting window.
		dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();;
		
		// Search
		dr.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys("iphone x");
		// click search
		dr.findElement(By.xpath("//button[@class='vh79eN']")).click();
		Thread.sleep(2000);
		
		// MOBILE NAMES 
		String expn_mobile="(//div[contains(text(),'Apple iPhone X')])[position()<=4]";
		List<WebElement> ref1 = dr.findElements(By.xpath(expn_mobile));		
		Thread.sleep(2000);
		  
		//MOBILE PRICE
		String expn_price="(//div[contains(text(),'Apple iPhone X')]/../..//div[@class='_1vC4OE _2rQ-NK'])[position()<=4]";
		List<WebElement> ref = dr.findElements(By.xpath(expn_price));
		System.out.println(" Total Count of Mobiles:- "+ref.size()+"\n\t Model \t\t\t\t Price");
		
		for(int i = 0; i <= ref.size(); i++)
		{
			String model = ref1.get(i).getText();
			String price = ref.get(i).getText();
			System.out.println(model+"      "+price);
		}
		/*
		for(WebElement ele : ref)
		{
			count++;
			System.out.println(count+ ". " + ele.getText());
		}
		*/
		
		
	}
}