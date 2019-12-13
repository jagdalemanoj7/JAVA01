package SeleniumPract;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice_List {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("file:///D:/list.html");
		
		String expected="Apple";
		// Listbox
		WebElement ele = dr.findElement(By.id("list"));		
		Select s = new Select(ele);
		List<WebElement> ref = s.getOptions();
		for (int i = 0; i < ref.size() ; i++) 
		{			
			s.selectByValue(ref.get(i).getAttribute("value"));
			
			/*
			s.selectByVisibleText(ref.get(i).getText());
			Thread.sleep(1000);
			
			String txt = ref.get(i).getText();
			System.out.println("Deselected Option : ");
			if(txt.equals(expected))
			{
				s.deselectByVisibleText(txt);
				System.out.println(txt);
			}
			*/
		}
		
		WebElement first = s.getFirstSelectedOption();
		System.out.println("First Selected option: "+first.getText());
		
		/*
		// Deselect single element
		s.deselectByIndex(4);
		Thread.sleep(1000);
		// Deselect all element
		s.deselectAll();
				
		//	/*
		 	selectByIndex(int arg)
		 	selectByValue(String arg)
		 	selectByVisibleText(String arg)
		 	isMultiple()
		 	getOption()
		 	getFirstSelectedOption()
		 	getAllSelectedOption()
		 	deselectAll()
		 	deselectByIndex(int arg)
		 	deselectByValue(String arg)
		 	deselectbyVisibleText(String arg)
		 	
		*/
		
	}
}