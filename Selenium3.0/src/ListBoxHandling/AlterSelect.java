package ListBoxHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AlterSelect {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr=new FirefoxDriver();
		dr.get("file:///D:/list.html");

		// 
		WebElement list = dr.findElement(By.id("list"));
		Select s=new Select(list);
        List<WebElement> ref1 = s.getOptions();             
        
        System.out.println("All Options");
		for (int i = 0; i < ref1.size(); i++) {
			
			System.out.println(ref1.get(i).getText());
		}
		
		System.out.println("-------------------------\nAlternate Options");
		for (int i = 0; i < ref1.size(); i++) {
			
			if(i%2==0) {
				ref1.get(i).click();
				System.out.println(ref1.get(i).getText());
			}
			
			
				
		}
		
	}
}