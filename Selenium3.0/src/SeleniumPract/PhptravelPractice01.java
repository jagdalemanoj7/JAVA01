package SeleniumPract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class PhptravelPractice01 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("https://www.phptravels.net/");
		
		// select usd
		Actions a=new Actions(dr);
		WebElement usd = dr.findElement(By.xpath("(//i[@class='icon-money-2 go-right'])[2]"));
		a.moveToElement(usd).perform();
		
		WebElement usdoption = dr.findElement(By.xpath("(//a[@data-code=\"18\"])[1]"));
		a.moveToElement(usdoption).perform();
		
	}

}
