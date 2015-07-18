/**
 * The login test
 *
 * Make sure test works anywhere where login is required
 * 
 * @author daisy
 */

package utilities;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;

import java.io.FileInputStream;


public class ExcelLoginReader {
	private static XSSFSheet ExcelSheet;
	private static XSSFWorkbook ExcelBook;
	private static XSSFCell Cell;
	
	//connects to Excel Worksheet and reads the data in each cell
	public static String[][] read(String path, String sheetName ) throws Exception {	
	
		FileInputStream inputStream = new FileInputStream(path);

		ExcelBook = new XSSFWorkbook(inputStream);
	
		ExcelSheet = ExcelBook.getSheet(sheetName);
		
		int startRow = 1;
		
		int startCol = 0;
		int totalRows = ExcelSheet.getLastRowNum() ;//0-based(0, 1, 2...)
		
		//assumes that each row has same number of columns.
		int totalCols = ExcelSheet.getRow(0).getLastCellNum();//1-based(1, 2, 3...)
		
		String[][] cellValue = new String [totalRows][totalCols];
		
		int ci = 0;
		for (int i = startRow; i <= totalRows ; i++) {
			int cj = 0;
			for (int j = startCol; j < totalCols; j++) {
				
				cellValue[ci][cj] = getData(i, j);
				cj++;
			}
			ci++;
		}	
		return(cellValue);
	}
	
	//gets the data in each cell
	private static String getData(int i, int j) {
		Cell = ExcelSheet.getRow(i).getCell(j);
		if(Cell.getCellType() == 1)
			return Cell.getStringCellValue();
		else return "";
	}
}