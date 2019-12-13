package ListBoxHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CountRepeted {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr=new FirefoxDriver();
		dr.get("file:///D:/list.html");

		// 
		WebElement list = dr.findElement(By.id("list"));
		Select s=new Select(list);
        List<WebElement> ref1 = s.getOptions(); 
        
        String[] frt = new String[15];					        //= {"Mango","Banana","Apple","Apple"};
        String actOpt="",opt;
        int count=0; 
        int[] freq = new int[20];
        
        for (int i = 0; i < ref1.size(); i++) {
        	  /* Initially initialize frequencies to -1 */
        	freq[i] = -1;
        }
        
        System.out.println("---------------------------------------------");
        for (int i = 0; i < ref1.size(); i++) {
        
        	actOpt = ref1.get(i).getText();					
			
			count = 1;
			for (int j = i+1; j < ref1.size(); j++) {																
				opt = ref1.get(j).getText();
						/* If duplicate element is found */			
				if(actOpt.equals(opt)) {																
					count++;
						/* Make sure not to count frequency of same element again */
					freq[j]=0;
					frt[i]=actOpt;
				}
			}
			
			 /* If frequency of current element is not counted */
			if(freq[i]!=0) {
				
				freq[i] = count;				
			}
        }
        
        for (int i = 0; i < ref1.size(); i++) {
        	
        	if(freq[i]!=0 && freq[i]>1) {
			
					System.out.println(frt[i]+" is repeated "+freq[i]+" times in a list.");
			}				
        }
		
        
	}
}