package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode 
{
	static FileInputStream f;
	// To read excel file in the system
	static XSSFWorkbook w;
	// Represents entire excel workbook
	static XSSFSheet sh;
	// Represents one sheet inside the workbook

	public static String readStringData(int row, int col) throws IOException 
	{
		f = new FileInputStream("C:\\Users\\ADMIN\\git\\JavaTrainingFromOOPS\\JavaOOPSExceptionCollection\\src\\main\\resources\\Bank.xlsx");
		// Opens the excel file from the given location
		w = new XSSFWorkbook(f);
		// Load excel file into memory with the help of Apache POI
		sh = w.getSheet("Sheet1");
		// To select the specified sheet from the workbook
		XSSFRow r = sh.getRow(row);
		// Get the row based on the row number passed as an argument/parameters
		XSSFCell c = r.getCell(col);
		// Gets the cell in that row based on the column number
		return c.getStringCellValue();
		// Return the values in cell as string/text
	}

	public static String readIntegerData(int row, int col) throws IOException 
	{
		f = new FileInputStream("C:\\Users\\ADMIN\\git\\JavaTrainingFromOOPS\\JavaOOPSExceptionCollection\\src\\main\\resources\\Bank.xlsx");
		w = new XSSFWorkbook(f);
		sh = w.getSheet("Sheet1");
		XSSFRow r = sh.getRow(row);
		XSSFCell c = r.getCell(col);
		// Gets data in double format in the above step
		int val = (int) c.getNumericCellValue();
		// Convert the double value to int
		return String.valueOf(val);
		// Converts int to string to match the return type of the method
	}
}