package SeleniumPract;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestActitime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");		
		WebDriver dr = new FirefoxDriver();
		dr.get("http://admin-pc/login.do");
		
		dr.findElement(By.name("username")).sendKeys("admin");
		dr.findElement(By.name("pwd")).sendKeys("manager1");
		dr.findElement(By.id("loginButton")).click();
		
		boolean errmsgStatus = dr.findElement(By.xpath("//span[contains(text(),'Please try again.')]")).isDisplayed();				
		 if(errmsgStatus)
		{
			 System.out.println("err msg disp..");
		}
		
	}
}