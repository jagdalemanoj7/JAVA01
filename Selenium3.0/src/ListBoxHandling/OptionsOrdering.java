package ListBoxHandling;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class OptionsOrdering {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("http://www.facebook.com");

		String expect_month="Aug";

		// Listbox Month
		WebElement month = dr.findElement(By.id("month"));
		Select s=new Select(month);
		List<WebElement> ele = s.getOptions();
	    
		System.out.println("\n List: ");		
		for (WebElement ref : ele) {
			System.out.println(ref.getText());
		}
		Thread.sleep(2000);
		
		System.out.println("\n Ordered List: ");
		TreeSet al = new TreeSet();
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}