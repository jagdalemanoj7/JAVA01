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
import org.testng.annotations.Test;

public class ExcelHandling01 {
	@Test
	public void getval() throws EncryptedDocumentException, FileNotFoundException, IOException {
		String path="../VtigerFramework/Files/searchOpportunityTSData.xlsx";
		Workbook book=WorkbookFactory.create((new FileInputStream(path)));
		Sheet sheet = book.getSheet("Sheet1");
		Row row=sheet.getRow(9);
		Cell cell = row.getCell(2);
		String value = cell.getStringCellValue();
		System.out.println(value);
		//return value;
	}
}
