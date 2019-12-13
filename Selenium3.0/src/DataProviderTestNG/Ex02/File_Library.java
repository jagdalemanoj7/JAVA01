package DataProviderTestNG.Ex02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class File_Library {

	static String path = "../Selenium3.0/Excel/Worksheet01.xlsx";
	static int last_Row, last_Cell;
	static Workbook book;	static Sheet sheet; static Row row; static Cell cell;

	public static void excelConfig() {
		try {
			book = WorkbookFactory.create(new FileInputStream(path));			
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Object[][] getExcelData() {

		excelConfig();
		sheet = book.getSheet("Sheet2");
		Object[][] data = new Object[sheet.getLastRowNum()+1][sheet.getRow(0).getLastCellNum()];

		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			for (int j = 0; j < sheet.getRow(i).getLastCellNum(); j++) {
				//data[i][j]=sheet.getRow(i+1).getCell(j).toString();
				data[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return data;
	}
}

	/*
	public static int getLastRowNum() {
		excelConfig("Sheet2");
		last_Row = sheet.getLastRowNum();
		return last_Row;
	}

	public static int getLastCellNum(int row_Index) {
		excelConfig("Sheet2");
		row = sheet.getRow(row_Index);
		last_Cell = row.getLastCellNum();
		return last_Cell;
	}*/