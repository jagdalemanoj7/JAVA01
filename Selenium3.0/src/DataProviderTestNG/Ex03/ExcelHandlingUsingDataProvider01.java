package DataProviderTestNG.Ex03;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelHandlingUsingDataProvider01 {
	static Workbook buk;	static Sheet shit;	static Row row; static Cell cel;
	static int rowCount;	static int cellCount;
	
	public static Object[][] fetchData() {
		String path = "../Selenium3.0/Excel/Worksheet01.xlsx";

		try {
			buk = WorkbookFactory.create(new FileInputStream(path));
		} catch (Exception ex) {
		}

		shit = buk.getSheet("Sheet2");
		rowCount = shit.getLastRowNum();
		cellCount = shit.getRow(0).getLastCellNum();

		Object[][] objData = new Object[rowCount+1][cellCount];

		for (int i = 0; i <= rowCount; i++) {
			for (int j = 0; j < cellCount; j++) {
				objData[i][j] = shit.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return objData;
	}	
}