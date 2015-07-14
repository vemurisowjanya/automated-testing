/**
 * This class tests the cancel add post functionality. 
 * 
 * @author Daisy Nkweteyim
 */

package post_features;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class CancelAddPost extends common.CommonCode {
	private String expectedTitle; 

	@Test
	public void addpost() {
		baseURL = "http://localhost:8001";
		expectedTitle = "Malaria : infoHub";
			
		driver.get(baseURL + "/malaria/" );
		driver.manage().window().maximize();
		String actualTitle = driver.getTitle();
		//Assert.assertEquals(expectedTitle, actualTitle);
		
		// click on new post
		driver.findElement(By.xpath("html/body/div[2]/div/button")).click();
		
		//cancel post
		driver.findElement(By.xpath
				("html/body/div[2]/div[1]/form/center/div/div[3]/button")).click();
	}
		
}