package SeleniumPract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
			//	SEVEN HILLS HOSPITAL APPOINTMENT FORM SCRIPT
public class Practice02 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr=new FirefoxDriver();
		dr.get("http://www.sevenhillshospital.com/");
		
		// contactUs
		dr.findElement(By.linkText("DOCTOR APPOINTMENT")).click();
		Thread.sleep(2000);
		// Location
		WebElement loc = dr.findElement(By.name("visit"));
		Select s = new Select(loc);
		s.selectByVisibleText("Mumbai");
		Thread.sleep(2000);
		// Contact
		dr.findElement(By.id("telno")).sendKeys("9823405507");
		Thread.sleep(2000);		
		// Date
		dr.findElement(By.id("datepicker")).click();
		dr.findElement(By.xpath("//tr[2]/td[1]/button[text()='8']")).click();
		// speciality
		WebElement spec = dr.findElement(By.id("speciality"));
		s=new Select(spec);
		s.selectByVisibleText("General Physician");
		Thread.sleep(2000);
		// name
		dr.findElement(By.name("name")).sendKeys("Kajal Sharma");
		Thread.sleep(2000);
		//email
		dr.findElement(By.id("emal")).sendKeys("kajal@sharma.com");
		Thread.sleep(2000);
		// perf. time
		WebElement time = dr.findElement(By.name("time"));
		s = new Select(time);
		s.selectByVisibleText("Morning");
		Thread.sleep(2000);
		// message
		dr.findElement(By.name("message")).sendKeys("I am not feeling well.");
		
	}
}