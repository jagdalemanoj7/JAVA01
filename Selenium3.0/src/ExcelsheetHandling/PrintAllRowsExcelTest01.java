package ExcelsheetHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class PrintAllRowsExcelTest01 {

	@Test
	public void PrintAllRowsExcelTest01_Tc() throws Throwable {

		short firstcellno=0, lastcellno=0;		int rowno=0, tot=0;
		
		Workbook book = WorkbookFactory.create(new FileInputStream("../Selenium3.0/Excel/Worksheet01.xlsx"));		
		Sheet sheet = book.getSheet("Sheet1");
		rowno = sheet.getLastRowNum();
		System.out.println("===========Total Rows are: "+rowno);
		
		for (int i = 0; i <= rowno; i++) {
			Row row = sheet.getRow(i);
			
			firstcellno=row.getFirstCellNum();	
			lastcellno = row.getLastCellNum();
			tot=row.getPhysicalNumberOfCells();
			for (int j = 0; j < lastcellno; j++) {
				System.out.print(row.getCell(j)+"\t");
			}
			System.out.println("");
		}
		System.out.println("============Total Cells are: "+firstcellno+"	"+lastcellno+"	"+tot);
		
	}
}