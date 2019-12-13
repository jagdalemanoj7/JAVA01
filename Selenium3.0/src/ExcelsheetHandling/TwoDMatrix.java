package ExcelsheetHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TwoDMatrix {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String path = "..//Selenium3.0/Excel/Worksheet01.xlsx";
		FileInputStream file = new FileInputStream(path);
		Workbook book = WorkbookFactory.create(file);
		Sheet sheet = book.getSheet("Sheet2");
		int lastrow = sheet.getLastRowNum();
		
		try {
					
			for (int i = 0; i <= 1; i++) {
				Row row = sheet.getRow(i);
				short lastcel = row.getLastCellNum();
				for (int j = 0; j <= 1; j++) {
					Cell cel = row.getCell(j);
					String str1 = cel.getStringCellValue();
					System.out.println(str1);
				}
			}		
		} 
		catch (Exception e) {
			// TODO: handle exception
		}
	}
}