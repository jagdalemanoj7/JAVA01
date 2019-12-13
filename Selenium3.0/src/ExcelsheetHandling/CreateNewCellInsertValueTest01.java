package ExcelsheetHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateNewCellInsertValueTest01 {

	@Test
	public void CreateNewCellInsertValueTest01_Tc() throws Throwable {
		
		String path="../Selenium3.0/Excel/Worksheet01.xlsx";
		Workbook book = WorkbookFactory.create(new FileInputStream(path));
		Sheet sheet = book.getSheet("Sheet2");
		/*Row row = sheet.createRow(2);
		Cell cell = row.createCell(3);
		
		cell.setCellValue("JustInserted");*/	
		
		Row r1=sheet.getRow(2);
		Cell c1=r1.getCell(3);
		r1.removeCell(c1);		
		Reporter.log("Value removed from location",true);

		FileOutputStream output = new FileOutputStream(path);
		book.write(output);		
		/*   Reporter.log("New value inserted into location ",true);	  */
		
	}
}