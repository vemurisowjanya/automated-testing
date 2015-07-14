/**
 * This class tests the Add Post functionality.
 * 
 * @author Daisy Nkweteyim
 */


package post_features;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class AddPost extends common.CommonCode {
	private String expectedTitle; 

	@Test
	public void addpost() {
		
		expectedTitle = "Malaria : infoHub";
			
		driver.get(baseURL + "/malaria/" );
		String actualTitle = driver.getTitle();
		//Assert.assertEquals(expectedTitle, actualTitle);
	
		
		//TODO: input arbitrary values (more generic)perhaps from excel sheet.
		
		// click on new post
		driver.findElement(By.xpath("html/body/div[2]/div/button")).click();
		driver.findElement(By.xpath
				("html/body/div[2]/div[1]/form/div[1]/div[3]/input")).sendKeys("The Title");
		driver.findElement(By.xpath
				("html/body/div[2]/div[1]/form/div[2]/div[3]/textarea")).sendKeys
				("This is the description of the post");		

		//click on submit
		driver.findElement(By.xpath("html/body/div[2]/div[1]/form/center/div/div[2]/input")).click();
		String result = driver.findElement(By.xpath("html/body/div[2]/center[1]/h4")).getText();
		System.out.println(result);
	}
		
}