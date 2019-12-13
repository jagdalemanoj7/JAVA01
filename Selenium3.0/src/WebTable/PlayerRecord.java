package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PlayerRecord {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr=new FirefoxDriver();
		dr.get("https://www.cricbuzz.com/");
		
		//click on Featured score
		dr.findElement(By.xpath("//div[text()='WI']")).click();
		
		// Click on scorecard
		dr.findElement(By.xpath("//a[text()='Scorecard']")).click();
		
		// Player Record
		String record = dr.findElement(By.xpath("//div[1]/div[6]")).getText();
		System.out.print("--Record of Player--\n\n"+record);
	}
}
