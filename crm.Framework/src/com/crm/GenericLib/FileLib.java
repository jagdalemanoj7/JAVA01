package com.crm.GenericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/*
 * it is used to read data from excel workbook ,database,properties from data folder
 * 
 * @author jyothsna
 */
public class FileLib 
{
	/**
	 * it is used to read the data from commonData.properties file based on key
	 * @throws FileNotFoundException 
	 * @param key
	 * @ return
	 * @ throws Throwable
	 */
	public String getPropertyKeyValue(String key) throws Throwable
	{
		FileInputStream fis = new FileInputStream("./Data\\commonData.properties");
		Properties pobj =new Properties();
		pobj.load(fis);
		String value =pobj.getProperty(key);
		return value;
	}
	/**
	 * it is used to read the data from TestscriptDta.xlsx  file based on user argument
	 * @param sheetName
	 * @param rowNum
	 * @param celNum
	 * @return Stringdata
	 * @throws IOException 
	 * @throws EncryptedDocumentException 
	 * @ throws Throwable
	 *
	 */
	public String getExcelData(String sheetName, int rowNum, int celNum) throws Throwable
	{
		FileInputStream fis = new FileInputStream("./Data\\TestScript2.xlsx");
		
//	Workbook wb = WorkbookFactory.create(fis);
//	Sheet sh = wb.getSheet(sheetName);
//	Row row = sh.getRow(rowNum);
//	String data = row.getCell(celNum).getStringCellValue();
	String data = WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowNum).getCell(celNum).getStringCellValue();
//	wb.close();
	System.out.println(data);
	return data;
	}
	/**
	 * it is used to read the data from TestscriptDta.xlsx  file based on user argument
	 * @param sheetName
	 * @param rowNum
	 * @param celNum
	 * @param data
	 * @ throws Throwable
	 */
	public void setExcelData(String sheetName, int rowNum, int celNum, String data)  throws Throwable
	{
		FileInputStream fis = new FileInputStream("./Data\\TestScript2.xlsx");
		Workbook wb = WorkbookFactory.create( fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		Cell cel = row.createCell(celNum);
		cel.setCellValue(data);
		FileOutputStream fos = new FileOutputStream("./TestScript2.xlsx");
		wb.write(fos);
		wb.close();
		
	}
	

}
