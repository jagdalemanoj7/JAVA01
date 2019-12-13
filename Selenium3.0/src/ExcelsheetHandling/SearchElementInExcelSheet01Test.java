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
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SearchElementInExcelSheet01Test {

	@Test
	public void SearchElementInExcelSheetTest_Tc01() {
		
		String expected_Ele="Bangalore", actual_Ele="", path="../Selenium3.0/Excel/Worksheet01.xlsx";
		SoftAssert soft=new SoftAssert();
		
		try {
				Workbook book = WorkbookFactory.create(new FileInputStream(path));
				Sheet sheet = book.getSheet("Sheet2");
				Row row = sheet.getRow(2);
				Cell cell = row.getCell(3);
				actual_Ele = cell.getStringCellValue();
				 				
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block			e.printStackTrace();
		}			
		
		soft.assertEquals(actual_Ele, expected_Ele,"Result Not Matched, Tc Failed...");
		soft.assertAll();
		System.out.println("|==============================================|");
		System.out.println("|					       |");
		System.out.println("| Actual Element is   : " +actual_Ele+"	       |");
		System.out.println("| Expected Element is : " +expected_Ele+"	       |");
		Reporter.log("| RESULT MATCHED...\t\t\t       |", true);
		System.out.println("|					       |");
		System.out.println("|==============================================|");
	}
}