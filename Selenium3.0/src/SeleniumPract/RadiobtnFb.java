package SeleniumPract;
// CHECK WHETHER RADIOBUTTONS ARE SELECTED OR NOT..
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadiobtnFb {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://facebook.com");
				
		// Check Both NOT Selected
		WebElement chkf = driver.findElement(By.id("u_0_9"));		
		chkf.click();
		boolean statusf = chkf.isSelected();
		
		WebElement chkm = driver.findElement(By.id("u_0_a"));
		//chkm.click();
		boolean statusm = chkm.isSelected();
		
		System.out.println("Gender Status is " +statusf +" & " +statusm );
		
		if(statusf && statusm)
			System.out.println("Gender(M & F) is Selected");
		else
			System.out.println("Gender(M & F) is not Selected");
						
		Thread.sleep(2000);

		/*		
		// Check Both Selected
		WebElement chkfs = driver.findElement(By.id("u_0_9"));
		chkfs.click();
		boolean statusfs = chkfs.isSelected();
		
		WebElement chkms = driver.findElement(By.id("u_0_a"));
		chkms.click();
		boolean statusms = chkms.isSelected();
		
		System.out.println("Gender Status is " +statusfs +" & " +statusms);
		
		if(statusfs && statusms)
			System.out.println("Gender(M & F) is Selected");
		else
			System.out.println("Gender(M & F) is not Selected");
		
		driver.navigate().refresh();
		Thread.sleep(2000);

		
		// Female NOT Selected
				WebElement chkfl = driver.findElement(By.id("u_0_9"));
				boolean statusfl = chkfl.isSelected();
			
				System.out.println("Gender Female Status is " +statusfl);
				
				if(statusfl)
					System.out.println("Gender(F) is Selected");
				else
					System.out.println("Gender(F) is not Selected");
			
				Thread.sleep(2000);
				driver.navigate().refresh();
				
				System.out.println("----------------------------------");
				
				
				
				// Male NOT Selected
				WebElement chkml = driver.findElement(By.id("u_0_a"));
				boolean statusml = chkm.isSelected();
				
				System.out.println("Gender(M) Status is " +statusml);
				
				if(statusml)
					System.out.println("Gender(M) is Selected");
				else
					System.out.println("Gender(M) is not Selected");

		
		
		
		System.out.println("-------------------------------");
		// Female Selected
		WebElement chkfls = driver.findElement(By.id("u_0_9"));
		chkfls.click();
		boolean statusfls = chkfls.isSelected();
	
		System.out.println("Gender Female Status is " +statusfls);
		
		if(statusfls)
			System.out.println("Gender(F) is Selected");
		else
			System.out.println("Gender(F) is not Selected");
			
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		
		// Male Selected
		WebElement chkmls = driver.findElement(By.id("u_0_a"));
		chkmls.click();
		boolean statusmls = chkms.isSelected();
		
		System.out.println("Gender(M) Status is " +statusmls);
		
		if(statusmls)
			System.out.println("Gender(M) is Selected");
		else
			System.out.println("Gender(M) is not Selected");

		//Thread.sleep(2000);
		//driver.navigate().refresh();
		Thread.sleep(2000);
		
		*/
		
	}
}