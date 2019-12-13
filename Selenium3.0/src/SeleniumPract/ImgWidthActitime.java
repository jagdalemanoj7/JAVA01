package SeleniumPract;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImgWidthActitime {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("http://admin-pc/login.do");
		// LOGIN
		dr.findElement(By.name("username")).sendKeys("admin");
		dr.findElement(By.name("pwd")).sendKeys("manager");
		dr.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		
		int count=0,img_width=0;
		// IMAGE
		List<WebElement> ele = dr.findElements(By.tagName("img"));
		System.out.println("***IMAGES WIDTH ARE : ");
		for (WebElement ref : ele) {
			
			/*
			// String name = ref.getText();
			Rectangle r = ref.getRect();
			img_width = r.getWidth();
			System.out.println(img_width);
			 */
			//			OR
			String width = ref.getAttribute("width");
			img_width = Integer.parseInt(width);
			System.out.println(img_width);
			
		}
	}
}