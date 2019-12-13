package com.vtiger.opportunity;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.vtiger.genericLib.BaseClass;

public class Tc_27 extends BaseClass{
		
	@Test
	public void Tc_27Test() throws InterruptedException {

		//	Navigate to Opportunity.
			WebElement opportunity = dr.findElement(By.xpath("(//a[text()='Opportunities'])[1]"));
			Actions a=new Actions(dr);
			a.moveToElement(opportunity).perform();
			opportunity.click();
			
		//  click on import
			dr.findElement(By.xpath("//img[@alt='Import Opportunities']")).click();
			
        //  click on browse and upload
			File f=new File("../Selenium3.0/Excel/Opportunities.csv");
			String path = f.getAbsolutePath();
			dr.findElement(By.name("import_file")).sendKeys(path);
						
        //  Click on next button.
			dr.findElement(By.name("next")).click();
			
	}
}