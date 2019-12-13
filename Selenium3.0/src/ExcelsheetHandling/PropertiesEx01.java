package ExcelsheetHandling;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PropertiesEx01 {
	
	@Test
	public void propertiesdemo() throws Throwable {
		
		String path="../Selenium3.0/Excel/Demo.properties";
		Properties prop=new Properties();
		FileInputStream finput=new FileInputStream(path);
		prop.load(finput);
		
		String actitimeurl=prop.getProperty("actitimeurl");
		String uname = prop.getProperty("username");
		String pass=prop.getProperty("password");
		
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get(actitimeurl);		
		
		/*		Login into Actitime app		*/
		dr.findElement(By.name("username")).sendKeys(uname);
		dr.findElement(By.name("pwd")).sendKeys(pass);
		dr.findElement(By.id("loginButton")).click();
		Reporter.log("User Logged In Successfully...");
		
	}
}