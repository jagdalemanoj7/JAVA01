package Datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
							//	T.S. TO SELECT 2'nd SUNDAY DATE, MONTH & YEAR from CLEARTRIP SITE.
public class Cal {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr=new FirefoxDriver();
		dr.get("https://www.cleartrip.com/");		
		
		String expmonth="July", expyr="2020";
		String month="",yr="";
		// Date
		dr.findElement(By.id("DepartDate")).click();
		Thread.sleep(2000);
		
		// Month 
		dr.findElement(By.id("ui-datepicker-div")).click();
		Thread.sleep(2000);
		
		while(true)
		{
			month = dr.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]")).getText();
					//+ "//span[contains(text(),'Novem')]")).getText();
			yr=dr.findElement(By.xpath("(//span[@class='ui-datepicker-year'])[1]")).getText();
			
			if(month.equals(expmonth) && yr.equals(expyr)) {			
				break;
			}
			else {
				Thread.sleep(2000);
				dr.findElement(By.xpath("//a[@class='nextMonth ']")).click();
			}
		}
		
		String expDate = dr.findElement(By.xpath("//div[@class='monthBlock first']/table/tbody/tr[3]/td[7]")).getText();
		System.out.println(" Date SElected "+expDate+" "+month+" "+yr);
		dr.findElement(By.xpath("(//tbody)[3]/tr[3]/td/a[text()='"+expDate+"']")).click();
		
		//System.out.println(expDate);
				//"(//span[@class='ui-datepicker-month']/../../../..//a[text()='10'])[2]")).getText();				
	}
}