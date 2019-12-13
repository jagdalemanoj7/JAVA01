package ExcelsheetHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
					//  Excel Handling
public class Practice_Excel02 {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException  {
		
		/*=======================================================================
		 *				Write value into new cell of Excel	
		 * ======================================================================
		 * */
		String str = "../Selenium3.0/Excel/Worksheet01.xlsx";
		Workbook book = WorkbookFactory.create(new FileInputStream(str));
		Sheet sheet = book.getSheet("Sheet1");
		Row row = sheet.createRow(5);
		Cell cell = row.createCell(0);
		cell.setCellValue("NEW");
		
		FileOutputStream data=new FileOutputStream(str);
		book.write(data);
		System.out.println("New Data Written..");
		/*=======================================================================
		 *				Write(Override) Cell values into Excel	
		 * ======================================================================
		 
		String str = "../Selenium3.0/Excel/Worksheet01.xlsx";
		Workbook book = WorkbookFactory.create(new FileInputStream(str));
		Sheet sheet = book.getSheet("Sheet2");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		cell.setCellValue("Admin2");
		
		FileOutputStream data=new FileOutputStream(str);
		book.write(data);
		System.out.println("Record Written(Override)..");
		
		/*=======================================================================
		 *			 	Display Cell values of Excel[Approach-02]	
		 * ======================================================================
		 
		String str = "../Selenium3.0/Excel/Worksheet01.xlsx";
		Workbook book = WorkbookFactory.create(new FileInputStream(str));
		Sheet sheet = book.getSheet("sheet2");
		
		int lastRow = sheet.getLastRowNum();
		System.out.println("Row Count: " +lastRow);
		System.out.println("Cell values : ");
		for (int i = 0; i <= lastRow; i++) 
		{
			Row row = sheet.getRow(i);
			short lastCell = row.getLastCellNum();
		 	System.out.println("Cell Count: "+lastCell);		 	
		 	for (int j = 0; j < lastCell; j++) 
		 	{
		 		Cell cell = row.getCell(j);
		 		System.out.print(cell+" ");
			}
		 	System.out.println();
		}
		
				
		/*=======================================================================
		 *			 Display Cell values of Excel[Approach-01]	
		 * ======================================================================
		String str = "../Selenium3.0/Excel/Worksheet01.xlsx";
		Workbook book = WorkbookFactory.create(new FileInputStream(str));
		Sheet sheet = book.getSheet("Sheet1");
		int last_row = sheet.getLastRowNum();
		System.out.println("Total No. Rows: "+last_row);
		for (int i = 0; i < last_row; i++) {
			Row row = sheet.getRow(i);
			short cell = row.getLastCellNum();
			System.out.println(" Cell["+i+"]: "  +cell);
		}
		
		*/
		
		/*=======================================================================
		 *			 Display Row & Cell count of Excel	
		 * ======================================================================
		String str = "../Selenium3.0/Excel/Worksheet01.xlsx";
		
		Workbook work = WorkbookFactory.create(new FileInputStream(str));
		
		Sheet sheet = work.getSheet("Sheet1");
		System.out.println("\n Last Row Number: "+sheet.getLastRowNum());
		
		Row row = sheet.getRow(0);
		System.out.println("\n Last Cell Number: "+row.getLastCellNum());
		
		*/
		
		/*=======================================================================
		 *			 Display values of Excel	
		 * ======================================================================
		 
		String str = "../Selenium3.0/Excel/Worksheet01.xlsx";		
		Workbook book = WorkbookFactory.create(new FileInputStream(str));
		Sheet sheet = book.getSheet("Sheet1");
		//Row row = sheet.getRow(2);
		//Cell cell = row.getCell(1);
		//String celValue = cell.getStringCellValue();
		//System.out.println("\n Cell Values: "+celValue);
		int lastRow = sheet.getLastRowNum();
		System.out.println(lastRow);
		*/
		
	}
}