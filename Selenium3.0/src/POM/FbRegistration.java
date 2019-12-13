package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FbRegistration {
		
	private WebElement fname,lname,mobile,password,gender,signup;
	
	public FbRegistration(WebDriver dr)
	{
		fname=dr.findElement(By.name("firstname"));
		lname=dr.findElement(By.name("lastname"));
		mobile=dr.findElement(By.name("reg_email__"));
		password=dr.findElement(By.name("reg_passwd__"));
		gender=dr.findElement(By.xpath("//input[@value='2']"));
		signup=dr.findElement(By.name("websubmit"));
	}
	
	public void getInputs(String fname1,String lname1,String mobile1,String password1)
	{
		fname.sendKeys(fname1);
		lname.sendKeys(lname1);
		mobile.sendKeys(mobile1);
		password.sendKeys(password1);
		gender.click();
		signup.click();
	}
	
}