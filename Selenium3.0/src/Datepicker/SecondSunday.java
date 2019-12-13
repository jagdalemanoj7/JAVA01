package Datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SecondSunday {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr=new FirefoxDriver();
		dr.get("https://www.phptravels.net/");

		// SELECT 2'ND SUNDAY IN EXPECTED MONTH
		String expMonth="November 2019";
		// Check-In
		dr.findElement(By.name("checkin")).click();
		Thread.sleep(2000);
		
		// 
		while(true)
		{
			String month = dr.findElement(By.xpath("(//th[@class='switch'])[1]")).getText();
			
			if(month.equals(expMonth))
			{
				break;
			}
			else
			{
				Thread.sleep(2000);
				dr.findElement(By.xpath("(//th[@class='next'])[1]")).click();
			}
		}

		Thread.sleep(2000);
		String secondSunday= dr.findElement(By.xpath("(//div[@class='datepicker-days'])[1]/table/tbody/tr[2]/td[7]")).getText();
		System.out.println(secondSunday);
		//int ss=Integer.parseInt(secondSunday);
     				   // "(//div[@class=\"datepicker-days\"])[1]/table/tbody/tr[2]/td[1]";
		//dr.findElement(By.xpath("(//tbody)[1]/tr/td[text()='"+secondSunday+"']")).click();
		dr.findElement(By.xpath("(//tbody)[1]/tr/td[text()='"+secondSunday+"']")).click();
		
	}
}