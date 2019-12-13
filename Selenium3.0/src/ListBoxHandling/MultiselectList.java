package ListBoxHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
				//	 WTS SELECT ALL OPTION IN LIST
public class MultiselectList {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("file:///D:/list.html");
		
		// 
		WebElement list = dr.findElement(By.id("list"));
		Select s=new Select(list);
		List<WebElement> ref1 = s.getOptions();

		System.out.println(" Elements from the list are: \n----------------------------------");
		System.out.println(" Fetch one by one");
		for(int i=0; i < ref1.size(); i++)
		{
			s.selectByIndex(i);
			Thread.sleep(1000);
			// Fetch one by one
			System.out.println(ref1.get(i).getText());
			Thread.sleep(2000);
		}
		
			//		OR
		// Fetch all by once
		System.out.println("-------------\n Fetch all by once");
		List<WebElement> a = s.getAllSelectedOptions();
		for (WebElement ele : a) {
			
				System.out.println(ele.getText());
		}

	}
}