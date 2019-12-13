package ExcelsheetHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class OverrideElement {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String path = "..//Selenium3.0/Excel/Worksheet01.xlsx";
		FileInputStream file = new FileInputStream(path);
		Workbook book = WorkbookFactory.create(file);
		Sheet sheet = book.getSheet("Sheet1");
		Row row = sheet.getRow(1);
		Cell cel = row.getCell(3);

		try {				
				cel.setCellValue("over");
				FileOutputStream out = new FileOutputStream(path);
				book.write(out);
		
		} 
		catch (Exception e) {
			// TODO: handle exception
		}
	}
}