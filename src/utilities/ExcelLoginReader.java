/**
 * The login test
 *
 * Make sure test works anywhere where login is required
 * 
 * @author daisy
 */

package utilities;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;	
import java.util.Iterator;


public class ExcelLoginReader {
	private XSSFSheet ExcelSheet;
	private XSSFWorkbook ExcelBook;
	private XSSFCell Cell;
	private XSSFRow Row;

	//connects to Excel Worksheet and reads the data in each cell
	public String[][] read(String path, String sheetName ) throws FileNotFoundException {
			
	File file = new File(path);
			
	FileInputStream inputStream = new FileInputStream(file);
	try {
		ExcelBook = new XSSFWorkbook(inputStream);
	} catch (IOException e) {
	// TODO Auto-generated catch block
		e.printStackTrace();
	}
		ExcelSheet = ExcelBook.getSheet(sheetName);
		
		int startRow = 1;
		int startCol = 1;
		int totalRows = getNumRows();
		int totalCols = getNumCols();
		
		String[][] cellValue = new String [totalRows][totalCols];
		for (int i = startRow; i <= totalRows; i++ ) {
			for (int j = startCol; j <= 2; j++) {
				cellValue[i-1][j-1] = getData(i, j);
			}
		}
		return cellValue;
			
	}
		
	//gets the number  rows in sheet
	public int getNumRows(){
		return ExcelSheet.getLastRowNum();
	}
	
	//gets the number of columns in sheet
	//assumes there will be same number of columns for each row.
	public int getNumCols() {
		return Row.getLastCellNum();
	}
	
	//gets the data in each cell
	private String getData(int i, int j) {
		String data = ExcelSheet.getRow(i).getCell(j).getStringCellValue();
		return data;
	}
}