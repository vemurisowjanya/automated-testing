/**
 * This class tests the Add Post functionality.
 * 
 * @author Daisy Nkweteyim
 */


package post_features;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import common.DataProviderCommonCode;

public class AddPost extends DataProviderCommonCode {
		
	private String expectedTitle; 
	
	@Test(dataProvider = "post")
	public void addpostTest(String title, String description) {
		
		expectedTitle = "Malaria : infoHub";	
		driver.get(utilities.Constants.baseURL + "/malaria/" );
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		
		//click on new post
		driver.findElement(By.xpath("html/body/div[2]/div/button")).click();
		driver.findElement(By.xpath
				("html/body/div[2]/div[1]/form/div[1]/div[3]/input")).sendKeys(title);
		driver.findElement(By.xpath
				("html/body/div[2]/div[1]/form/div[2]/div[3]/textarea")).sendKeys
				(description);		

		//click on submit
		driver.findElement(By.xpath("html/body/div[2]/div[1]/form/center/div/div[2]/input")).click();
	}
	
	@DataProvider(name = "post")
	public Object[][] addpostDataProvider() throws Exception {
		Object[][]connect = utilities.ExcelReader.connect(utilities.Constants.pathTestData,
				utilities.Constants.postDataSheetName);
		
		Object[][] cellData = utilities.ExcelReader.read(connect);
		return cellData;
		
	}		
}