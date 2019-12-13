package com.actitime.genericLib;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	
	public static String getPropertyValues(String key) throws Throwable {
		
		String propPath = "../Selenium3.0/Excel/Demo.properties";
		Properties prop = new Properties();
		FileInputStream finput = new FileInputStream(propPath);
		prop.load(finput);
		
		key = prop.getProperty(key);
		return key;
		
	}	
	
	public static String getExcelData(String value,int rowno,int cellno) throws Throwable {
		
		String excelPath = "../Selenium3.0/Excel/Worksheet01.xlsx";
		Workbook book = WorkbookFactory.create(new FileInputStream(excelPath));
		Sheet sheet = book.getSheet("Sheet2");
		Row row = sheet.getRow(rowno);
		Cell cell = row.getCell(cellno);
		value = cell.getStringCellValue();
		return value;
	}
	
	/*public String setExcelData() {
		
	}*/
		
}