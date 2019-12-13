package Popup;

import java.io.File;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class UploadResumeNaukriSikuli {

	public static void main(String[] args) throws FindFailed {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr=new FirefoxDriver();
		dr.get("https://www.naukri.com/");
		
		//
		String parent = dr.getWindowHandle();
		Set<String> child = dr.getWindowHandles();

		Iterator<String> itr = child.iterator();
		while(itr.hasNext())
		{
			String id = itr.next();
			if(!id.equals(parent))
			{
				dr.switchTo().window(id);
				dr.close();
			}
		}
		
		dr.switchTo().window(parent);
		// Sikuli file upload
		String fileupload="";  // path of screenshots
		File f=new File(fileupload);
		String absPath = f.getAbsolutePath();
		Screen s=new Screen();
		Pattern p=new Pattern(absPath);
		s.click(p);
		
	}
}