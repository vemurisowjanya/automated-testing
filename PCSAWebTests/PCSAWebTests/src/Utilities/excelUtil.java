/*
 * @author Anjali
 * @since 2016-06-11
 * This class reads test data from the excel sheet to test various combinations required in a test script.
 */
package Utilities;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class excelUtil 
{
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	private static XSSFRow Row;
	
	/*
	 * @param Excel Sheet File path is the first parameter
	 * @param Sheet number is the second parameter
	 * @throws FileNotFoundException, IOExeption
	 * @return Object with value from excel sheet
	 */
	public static Object [][] getDataFromExcel(String filePath, String SheetName) throws Exception
	{
		Object [][] data= null;
		try
		{
			FileInputStream ExcelFile = new FileInputStream(filePath);
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(SheetName);
			int startRow = 1;
			int startColumn = 0;
			int ci, cj;
			int totalRows = ExcelWSheet.getLastRowNum();
			System.out.println("Number of rows "+totalRows);
			//function to get the total no of columns
			int totalCols = ExcelWSheet.getRow(0).getLastCellNum();
			System.out.println("Number of columns"+totalCols);
			data = new String[totalRows][totalCols];
			ci = 0;
			for (int i=startRow;i<=data.length;i++)
			{
				cj=0;
				for (int j=startColumn;j<data[0].length;j++)
				{
					System.out.println("cell no " + i +","+j);
					data[ci][cj]=getCellData(i,j);
					System.out.println(data[ci][cj]);  
					cj++;
				}
				ci++;
			}
			
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Could not read the Excel sheet");
			e.printStackTrace();
		}

		catch (IOException e)
		{
			System.out.println("Could not read the Excel sheet");
			e.printStackTrace();
		}
		return (data);
		
	}
	
	/*
	 * @param row number, column number of the Cell being read.
	 * @throws Exception
	 * @return Cell value
	 */
	public static Object getCellData(int RowNum, int ColNum) throws Exception 
	{
		 
		try
		{
			
			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
		
			if(Cell.getCellType() == org.apache.poi.ss.usermodel.Cell.CELL_TYPE_NUMERIC)
				return NumberToTextConverter.toText(Cell.getNumericCellValue());
				//return Cell.getNumericCellValue()+"";
			else if(Cell.getCellType() == org.apache.poi.ss.usermodel.Cell.CELL_TYPE_STRING)
				return Cell.getStringCellValue();
			else if (Cell.getCellType() == org.apache.poi.ss.usermodel.Cell.CELL_TYPE_BLANK || Cell == null) 
				return "";
			else if(Cell.getCellType() == org.apache.poi.ss.usermodel.Cell.CELL_TYPE_BOOLEAN)
				return Cell.getBooleanCellValue();
			else if(Cell.getCellType() == org.apache.poi.ss.usermodel.Cell.CELL_TYPE_FORMULA)
				return Cell.getCellFormula().toString();
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			throw (e);

		}
		return "";

		}
}
