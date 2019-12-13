package AutoIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
						// Upload File using Auto-IT 
public class FileUploadAutoIT01 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("https://gofile.io/?t=welcome");
		
		// FileUpload Option
		WebElement fupload = dr.findElement(By.className("mdi mdi-file-upload"));
		Actions a=new Actions(dr);
		Actions asdf = a.moveToElement(fupload);
		asdf.click();
		
		Thread.sleep(2000);
		//	File Upload
		dr.findElement(By.id("btnChooseFiles")).click();

	}

}