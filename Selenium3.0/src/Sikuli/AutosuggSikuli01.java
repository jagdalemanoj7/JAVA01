package Sikuli;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class AutosuggSikuli01 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("http://www.google.com");
		
		//	Sikuli Script
		Screen s = new Screen();
		String path1 = "../Selenium3.0/pics/search.png";
		File f = new File(path1);
		String ab_path1 = f.getAbsolutePath();
		Pattern p1 = new Pattern(ab_path1);
		s.click(p1);		
		Thread.sleep(2000);
		
		s.type("selenium");
		Thread.sleep(2000);
		
		String path2 = "../Selenium3.0/pics/autosugg01.png";
		File f1 = new File(path2);
		String ab_path2 = f1.getAbsolutePath();
		Pattern p2 = new Pattern(ab_path2);
		s.click();
		// 
	}
}