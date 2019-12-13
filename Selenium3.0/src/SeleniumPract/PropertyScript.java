package SeleniumPract;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertyScript {
	public static void main(String[] args) throws IOException {		

		// Read Property file data.
		Properties p = new Properties();		
		String propertyfilepath = "../Selenium3.0/src/SeleniumPract/Demo.properties";		
		FileInputStream f = new FileInputStream(propertyfilepath);
		p.load(f);
		
		String prop = p.getProperty("firefoxproperty");
		String path = p.getProperty("firefoxexepath");
		String appurl = p.getProperty("appurl");
		
		System.setProperty(prop, path);
		
		//WebDriver driver = new ChromeDriver();
		WebDriver driver=new FirefoxDriver();
		driver.get(appurl);
		
		String title = driver.getTitle();
		System.out.println(title);
		// driver.close();
				
	}
}