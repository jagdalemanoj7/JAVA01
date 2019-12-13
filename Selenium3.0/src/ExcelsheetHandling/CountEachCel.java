package ExcelsheetHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CountEachCel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		String path = "..//Selenium3.0/Excel/Worksheet01.xlsx";
		FileInputStream file = new FileInputStream(path);
		Workbook book = WorkbookFactory.create(file);
		Sheet sheet = book.getSheet("Sheet1");		
		
		try {			
				int lastrow = sheet.getLastRowNum();
				for (int i = 0; i <= lastrow; i++) {
					Row row = sheet.getRow(i);
					short cel = row.getLastCellNum();
					System.out.println(i+" position "+cel);
				}
			
		} 
		catch (Exception e) {
			
			System.out.println(e.toString());
		}		
		
	}
}