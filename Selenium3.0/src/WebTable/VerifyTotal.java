package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
			// 		VERIFY SUM IS EQUAL TO TOTAL FROM TABLE ELEMENTS
public class VerifyTotal {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr=new FirefoxDriver();
		dr.get("file:///D:/course.html");
		int sum=0;
		// table
		List<WebElement> amt = dr.findElements(By.xpath("//tr/td[3]"));
		for(int i = 0; i < amt.size(); i++)
		{
			String ele1 = amt.get(i).getText();
			int ele=Integer.parseInt(ele1);
			sum=sum+ele;
			
		}
			
		//
		String expTot1 = dr.findElement(By.xpath("//tfoot/tr/td")).getText();
		int expTot=Integer.parseInt(expTot1);
		System.out.println("Expected: "+expTot+"\nTotal: "+sum);
		if(sum==expTot)
			System.out.println("Total Amount Matched.");
		else
			System.out.println("Total Amount not Matched..");
		
	}
}