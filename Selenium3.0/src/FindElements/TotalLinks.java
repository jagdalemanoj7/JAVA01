package FindElements;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
// DISPLAY TOTAL NO OF LINKS 
public class TotalLinks {
	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr=new FirefoxDriver();
		dr.get("https://www.google.com");
		
		// Total no. of Links 
		int visible=0,notvisible=0;
		List<WebElement> ref = dr.findElements(By.tagName("a"));
		int linkcount = ref.size();
		System.out.println("Total No. of Links "+linkcount);
		
		// Display links having text as an output
		System.out.println("Visible Links are ");
		for(WebElement ele : ref)
		{
			String txt = ele.getText();
			
			if( txt.length()>0) 
			//if( txt.>0)
			{  
				visible++;				
				System.out.println(visible+". "+txt);
			}
		}
			System.out.println("Total No. Visible Links are "+visible);
		
		// Display links not having text
		for(WebElement ele:ref)
		{
			String txt = ele.getText();

			if(!txt.isEmpty())
			{
				notvisible++;				
			}
		}
			System.out.println("\nTotal No. of Non-Visible Links are "+notvisible);
		
			dr.close();		
	}
}