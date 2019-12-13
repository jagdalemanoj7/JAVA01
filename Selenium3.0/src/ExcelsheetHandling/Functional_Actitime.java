package ExcelsheetHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ddf.EscherColorRef.SysIndexSource;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Functional_Actitime {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException, InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "../Selenium3.0/DriverExe/geckodriver.exe");
				
		// create excelsheet
		String path="../Selenium3.0/Excel/Worksheet01.xlsx";		
		Workbook book = WorkbookFactory.create(new FileInputStream(path));
		Sheet sheet = book.getSheet("Sheet3");		
		int rowCount = sheet.getLastRowNum();
		
		for(int i = 1; i <= rowCount; i++)
		{				
			WebDriver dr = new FirefoxDriver();
			dr.get("http://admin-pc/login.do");
			dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Row row = sheet.getRow(i);					
			short cellCount = row.getLastCellNum();
			
			WebElement[] ele = new WebElement[2];
			ele[0] = dr.findElement(By.name("username"));
			ele[1] = dr.findElement(By.name("pwd"));			
			
			// un , psw
			String[] cellvalues=new String[cellCount];
			for(int k = 0; k < 2; k++)
			{								
				cellvalues[k]=row.getCell(k).toString();
				ele[k].sendKeys(cellvalues[k]);
			}
			dr.findElement(By.id("loginButton")).click();
			Thread.sleep(5000);
			
			for(int j = 0; j < 2; j++)
			{				
				String title = dr.getTitle();
				if(title.contains("Time"))
				{
					row.createCell(2).setCellValue("pass");
					row.createCell(3).setCellValue("Home pg displayed..");
				}
				//WebElement err = ;
				//boolean errmsgStatus = err.isDisplayed();				
				else if(dr.findElement(By.xpath("//span[contains(text(),'Please try again.')]")).isDisplayed())
				{
					 row.createCell(2).setCellValue("pass");
					 row.createCell(3).setCellValue("err. msg. displayed..");
				}
				else
				{
					row.createCell(2).setCellValue("fail");
					row.createCell(3).setCellValue("err. msg. and Home pg not displayed..");
				}
			}
		
			book.write(new FileOutputStream(path));
			Thread.sleep(2000);
			dr.close();
		}
	}
}