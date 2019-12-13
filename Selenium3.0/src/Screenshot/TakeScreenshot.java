package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TakeScreenshot {

	public static void main(String[] args) throws IOException {		
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("http://www.facebook.com");
		
		// Upcasting
		TakesScreenshot s = (TakesScreenshot)dr;
		
		// Take Screenshot
		File src = s.getScreenshotAs(OutputType.FILE);
		
		// Identify path of destination
		String path="../Selenium3.0/pics/fb1.png";
		
		// Create file class object.
		File dest=new File(path);
		
		// copy screen shot to destination
		FileUtils.copyFile(src, dest);
		
		System.out.println(" Screenshot Taken Successfully...");
		
	}
}