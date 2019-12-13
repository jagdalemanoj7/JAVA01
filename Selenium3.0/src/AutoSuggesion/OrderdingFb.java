package AutoSuggesion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class OrderdingFb {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://facebook.com");
				
		// Month
		String expected_month="Aug",mnth=" ",m=" ";
		WebElement month = driver.findElement(By.id("month"));		
		Thread.sleep(2000);
		
		// select element from listbox
		Select s = new Select(month);
		List<WebElement> ref = s.getOptions();
		 
		//ArrayList al = new ArrayList();
		TreeSet al=new TreeSet();
		System.out.println("Months in Alphabetical Order ");
		for (WebElement ele : ref) 
		{			
			mnth = ele.getText();
			al.add(mnth);
			
			if(mnth.equals(expected_month))
				m=mnth;		
		}			
									
		// Collections.sort(al);
		Iterator it=al.iterator();			
		while(it.hasNext())
		{
			System.out.println(it.next());
		}	

		if(m.equals(expected_month))
		{	
			month.click();
			Thread.sleep(2000);
			s.selectByIndex(8);
			//s.selectByValue("8");
			//s.selectByVisibleText("Aug");
			System.out.println("\n"+m+" is present in List.");
		}
		else
			System.out.println("\n"+m+" is not present in List..");
		//al.sort( Comparator.comparing( String::toString ) );
		//driver.close();
		
	}
}