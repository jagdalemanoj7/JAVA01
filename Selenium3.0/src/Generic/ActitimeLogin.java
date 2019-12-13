package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLogin {
	
		@FindBy(name="username")
		private WebElement username;
		@FindBy(name="pwd")
		private WebElement password;
		@FindBy(id="loginButton")
		private WebElement loginbtn;
		
		public ActitimeLogin(WebDriver dr)
		{
			PageFactory.initElements(dr, this);
		}
		
		public void setCredentials(String user, String pass)
		{
			username.sendKeys(user);
			password.sendKeys(pass);
			loginbtn.click();
		}
}