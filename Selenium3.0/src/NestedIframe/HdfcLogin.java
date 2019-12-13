package NestedIframe;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
						//	LOGIN INTO HDFC	//
public class HdfcLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("https://www.hdfcbank.com/assets/popuppages/netbanking.htm");
		
		// Netbanking
		//dr.findElement(By.linkText("Continue to NetBanking")).click();
		WebElement netbanking = dr.findElement(By.xpath("//a[@class='btn btn-default redBtn']"));
		JavascriptExecutor js = (JavascriptExecutor)dr;
		Thread.sleep(2000);
		js.executeScript("arguments[0].click()", netbanking);
		Thread.sleep(2000);
		// /*
		dr.switchTo().frame(0);
		
		// UserId
		WebElement uid = dr.findElement(By.name("fldLoginUserId"));
		js.executeScript("arguments[0].value='98012'", uid);
		Thread.sleep(2000);
		
		// continue
		WebElement cont = dr.findElement(By.xpath("//img[@alt='continue']"));
		js.executeScript("arguments[0].click()", cont);
		Thread.sleep(2000);
		
		// pass
		WebElement pwd = dr.findElement(By.name("fldPassword"));
		js.executeScript("arguments[0].value='1234'", pwd);
		Thread.sleep(2000);
		
		// Login
		WebElement login = dr.findElement(By.xpath("//img[@alt='Login']"));
		js.executeScript("arguments[0].click()", login);
	

		//	*/
		
	}
}