package AutoIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownload02 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("https://www.seleniumhq.org/");

		// download link
		dr.findElement(By.linkText("Download")).click();
		Thread.sleep(2000);

		//click on version 
		dr.findElement(By.linkText("3.141.59")).click();
		Thread.sleep(2000);
		
		// click on downld link using autoit script
		Runtime.getRuntime().exec("D:\\java+sel\\filednld01.exe");
		
	}
}
