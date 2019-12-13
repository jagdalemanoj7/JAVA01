package com.crm.GenericLib;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.crm.OrganisationTest.*;


public class BaseClass 
{
//global driver obj
public WebDriver driver;
FileLib flib =new FileLib();
Properties pobj =new Properties();

/**
 * 
 * @author jyothsna
 */
@BeforeClass(groups= {"SmokeTesting","RegressionTesting"})
public void configBC() throws Throwable 
{
	System.out.println("launch the browser");
	
	String BROWSER = flib.getPropertyKeyValue("browser");
	
		if(BROWSER.equals("firefox")) {
			driver = new FirefoxDriver();
			
		}else if(BROWSER.equals("chrome")){
			driver = new ChromeDriver();
			
		}else{
			driver = new FirefoxDriver();
			
		}
			
}
/**
 * 
 * @author jyothsna
 */

@BeforeMethod(groups= {"SmokeTesting","RegressionTesting"})
public void configBM() throws Throwable
{
	
	/*read common data*/
	String URL= flib.getPropertyKeyValue("url");
	String BROWSER = flib.getPropertyKeyValue("browser");
	String USER = flib.getPropertyKeyValue("username");
	String PASSWORD = flib.getPropertyKeyValue("password");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	//open application
	driver.get(URL);
	
	//login
	WebDriverWait wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.elementToBeClickable(By.name("user_name")));
	driver.findElement(By.name("user_name")).sendKeys(USER);
	driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
	driver.findElement(By.id("submitButton")).click();	
}
/**
 * @author jyothsna
 */

@AfterMethod(groups= {"SmokeTesting","RegressionTesting"})
public void configAfterMethod()
{
	WebElement wb1 =driver.findElement(By.xpath("//img [contains(@src,'user.PNG')]"));
	Actions act1 =new Actions(driver);
	act1.moveToElement(wb1).perform();
	
	driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	System.out.println("logout");
	
}
/**
 * 
 * @author jyothsna
 */

@AfterClass(groups= {"SmokeTesting","RegressionTesting"})
public void configAfterClass()
{
	System.out.println("close the browser");
	
	driver.quit();
	
}
	
	
	
	
	
	
	
	
	
	
}
