package ExcelsheetHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Remove {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		Workbook wb = WorkbookFactory.create(new FileInputStream("../Selenium3.0/Excel/Worksheet01.xlsx"));
		// remove sheet 4
		wb.removeSheetAt(3);
		
		// remove row
		Sheet s = wb.getSheet("Sheet1");
		Row r = s.getRow(5);
		s.removeRow(r);

		// remove cell		
		Row r1 = s.getRow(4);
		Cell c1 = r1.getCell(2);
		r1.removeCell(c1);
		
	}
}