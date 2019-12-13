package AutoIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * TS to upload a file using Auto-IT
 * @author admin
 *
 */
public class FileUploadAutoIT02 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("https://www.ilovepdf.com/word_to_pdf");

		//	Uploaded file
		dr.findElement(By.id("pickfiles")).click();
		Thread.sleep(2000);
		//  Execute AutoIT exe file
		Runtime.getRuntime().exec("D:\\java+sel\\fileupld01.exe");
		//
		
	}
}