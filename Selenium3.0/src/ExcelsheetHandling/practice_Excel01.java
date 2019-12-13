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

public class practice_Excel01 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String path="..//Selenium3.0/Excel/Worksheet01.xlsx";
		FileInputStream file=new FileInputStream(path);
		Workbook book=WorkbookFactory.create(file);
		Sheet sheet = book.getSheet("Sheet1");	
		Row row=sheet.getRow(0);
		Cell cell = row.getCell(0);		
		//String value = cell.getStringCellValue();
		//System.out.println("Cell value: "+value);		
		//if(cell.getCellType()==cell.CELL_TYPE_NUMERIC){	}
		
	}
}