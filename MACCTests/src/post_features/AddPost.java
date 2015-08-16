/**
 * This class tests the Add Post functionality.
 * 
 * @author daisy
 */


package post_features;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import common.DataProviderCommonCode;

public class AddPost extends DataProviderCommonCode {
		
	private String expectedTitle; 
	
	@Test(dataProvider = "post")
	public void addpostTest(String title, String description) {
		
		expectedTitle = "Malaria | infoHub";	
		driver.get(utilities.Constants.list_of_posts);
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		
		//add a new post
		WebElement addpostButton = driver.findElement(By.linkText(utilities.Constants.addNewPost));
		addpostButton.click();
		WebElement titre = driver.findElement(By.name("title_post"));
		titre.sendKeys(title);
		WebElement description_post = driver.findElement(By.name("description_post"));
		description_post.sendKeys(description);
		WebElement submitButton = driver.findElement(By.xpath("html/body/div[2]/div/form/div[3]/div/button"));
		submitButton.click();
	}
	
	@DataProvider(name = "post")
	public Object[][] addpostDataProvider() throws Exception {
		Object[][]connect = utilities.ExcelReader.connect(utilities.Constants.pathTestData,
				utilities.Constants.postDataSheetName);
		
		Object[][] cellData = utilities.ExcelReader.read(connect);
		return cellData;
		
	}		
}