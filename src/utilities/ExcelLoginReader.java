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

import java.io.FileInputStream;
import java.io.FileNotFoundException;



public class ExcelLoginReader {
	private static XSSFSheet ExcelSheet;
	private static XSSFWorkbook ExcelBook;
	private static XSSFCell Cell;
	private static XSSFRow Row;

	
	//connects to Excel Worksheet and reads the data in each cell
	public static Object[][] read(String path, String sheetName ) throws Exception {	
	
		FileInputStream inputStream = new FileInputStream(path);

		ExcelBook = new XSSFWorkbook(inputStream);
	
		ExcelSheet = ExcelBook.getSheet(sheetName);
		
		int startRow = 1;
		int startCol = 1;
		int totalRows = ExcelSheet.getLastRowNum();//get total rows
		
		//assumes that each row has same number of columns.
		int totalCols = ExcelSheet.getRow(0).getLastCellNum();//get total columns
		
		Object[][] cellValue = new String [totalRows][totalCols];
		int ci = 0;
		for (int i = startRow + 1; i <= totalRows ; i++ ) {
			int cj = 0;
			for (int j = startCol + 1; j <= totalCols; j++) {
				cellValue[ci][cj] = getData(i, j);
			}
		}
	
		return(cellValue);
	}
	
	//gets the data in each cell
	private static Object getData(int i, int j) {
		
			Cell = ExcelSheet.getRow(i).getCell(j);//.getStringCellValue();
			if (Cell.getCellType() == 0)
				return Cell.getNumericCellValue();
			else return Cell.getStringCellValue();
			
	}
}