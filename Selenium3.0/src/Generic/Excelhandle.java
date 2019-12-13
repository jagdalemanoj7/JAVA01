package Generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelhandle {
	static Workbook book;
	static Sheet sheet;
	static Row row;
	static Cell cell;
	
	public static void openExcel(String excelpath)
	{
		try 
		{
			book=WorkbookFactory.create(new FileInputStream(excelpath));
		} 
		catch (Exception e) {

		}
	}
	
	public static void openSheet(String sheetname)
	{
		sheet=book.getSheet(sheetname);
	}
	
	public static void identifyRow(int rownum)
	{
		row=sheet.getRow(rownum);
	}
	
	public static int rowcount()
	{
		int rowcount = sheet.getLastRowNum();
		return rowcount;
	}
	
	public static void identifycell(int cellnum)
	{
		cell=row.getCell(cellnum);
	}
	
	public static short cellcount()
	{
		short cellcount = row.getLastCellNum();
		return cellcount;
	}
	
	public static String celldata(int cellnum)
	{
		return row.getCell(cellnum).toString();
	}
	
	public static void createnewcell(int cellnum)
	{
		cell=row.createCell(cellnum);
	}
	
	public static void entercellvalue(String value)
	{
		cell.setCellValue(value);
	}
	
	public static void saveexcelchanges(String excelpath)
	{
		try 
		{
			book.write(new FileOutputStream(excelpath));
		} 
		catch (Exception e) {
			// TODO: handle exception
		}
	}	
}