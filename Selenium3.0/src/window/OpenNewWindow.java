package window;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenNewWindow {
	
     public static void main(String[] args) throws InterruptedException{
	 //public void openSameUrlInMultipleWindow() throws InterruptedException {
		  WebDriver ffDriver=new FirefoxDriver();
		  String pageUrl = "http://www.bing.com";
		  ffDriver.get(pageUrl);
		  
		  /* Cast webdriver object to Javascript Executor object. */
		  JavascriptExecutor jsExecutor = (JavascriptExecutor)ffDriver;
		  String googleUrl="https://www.msn.com";
		  
		  /* Javascript that will create new FirefoxWindow. */
		  String jsOpenNewTab = "window.open('"+googleUrl+"');";
		  
		  jsExecutor.executeScript(jsOpenNewTab);
		  
		  /* Run above javascript. */
		  /*for(int i=0;i<6;i++)
		  {
			  jsExecutor.executeScript(jsOpenNewWindow);
			  Thread.sleep(1000);
			  System.out.println("One opennd.");
		  }*/
     }
}