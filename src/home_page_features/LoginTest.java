/**
 * The login test
 *
 * Make sure test works anywhere where login is required
 * 
 * @author Daisy Nkweteyim
 */
package home_page_features;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import common.Login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LoginTest {
	
	//private String expectedTitle; 
	
	
	//test what happens with false values(expected/actual list)
	/*@Test
	public void login() {
		Login log_in = new Login();
		log_in.login("admin", "mypassword");
	}*/
	private XSSFSheet ExcelSheet;
	private XSSFWorkbook ExcelBook;

	//connects to Excel Worksheet
	void readCredentials(String path, String sheetName ) throws FileNotFoundException {
		
		File file = new File(path);
		
			FileInputStream inputStream = new FileInputStream(file);
			try {
				ExcelBook = new XSSFWorkbook(inputStream);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ExcelSheet = ExcelBook.getSheet(sheetName);
		
	}
	
	//gets the number of physical rows in sheet
	public int getNumRows(){
		return ExcelSheet.getPhysicalNumberOfRows();
	}
	
}

		