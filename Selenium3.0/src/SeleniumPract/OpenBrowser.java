package SeleniumPract;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {
	public static void main(String[] args) {
		
		String firefoxproperty="webdriver.gecko.driver";
		String relativepath1="../Selenium3.0/DriverExe/geckodriver.exe";
		System.setProperty(firefoxproperty, relativepath1);
		WebDriver driver=new FirefoxDriver();
		
		
		/*
		String chromeproperty="webdriver.chrome.driver";
		String relativepath="../Selenium3.0/DriverExe/chromedriver.exe";
		System.setProperty(chromeproperty, relativepath);
		WebDriver driver=new ChromeDriver();
		*/
	}
}
