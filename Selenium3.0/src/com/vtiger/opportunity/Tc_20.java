package com.vtiger.opportunity;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.vtiger.genericLib.BaseClass;

public class Tc_20 extends BaseClass{
			
	@Test
	public void Tc_20Test() throws InterruptedException {
		
	//	Navigate to Opportunity.
		WebElement opportunity = dr.findElement(By.xpath("(//a[text()='Opportunities'])[1]"));
		Actions a=new Actions(dr);
		a.moveToElement(opportunity).perform();
		opportunity.click();
		Thread.sleep(5000);
		
	//	select existing Opportunity.
		//WebElement name = dr.findElement(By.xpath("(//a[@href='index.php?module=Potentials&parenttab=Sales&action=DetailView&record=11'])"));
		dr.findElement(By.xpath("//td[text()='POT1 ']/following-sibling::td[1]")).click();
		
	//	navigate to moreInformation and click on Services.
		WebElement more = dr.findElement(By.xpath("//a[text()='More Information']"));
		Actions a1=new Actions(dr);
		a1.moveToElement(more).perform();
		Thread.sleep(5000);
		dr.findElement(By.xpath("(//a[text()='Services'])[2]")).click();
		//dr.findElement(By.xpath("//a[text()='Activity History']")).click();
		
	//	click on Add/Select Services.
		dr.findElement(By.xpath("//input[@value='Select Services']")).click();
		
	//	select the services in the Service List.
		String parent = dr.getWindowHandle();
		Set<String> ids = dr.getWindowHandles();
		Iterator<String> itr = ids.iterator();
		while(itr.hasNext()) {
			String child = itr.next();
			if(!parent.equals(child)) {
				dr.switchTo().window(child);
				dr.findElement(By.xpath("//a[text()='Pest Control']")).click();
			}
		}
		Thread.sleep(5000);
		
		dr.switchTo().window(parent);
		
		JavascriptExecutor js = (JavascriptExecutor)dr;
		js.executeScript("window.scrollBy(0,0)");
			
	}
}