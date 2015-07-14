/**
 * This class tests the delete post functionality.
 * 
 * @author Daisy Nkweteyim
 */

package post_features;

import org.junit.Assert;
import org.junit.Test;

public class DeletePost extends common.CommonCode {
	private String expectedTitle;
	
	@Test
	public void deletepost() {
		baseURL = "http://localhost:8001";
		expectedTitle = "Malaria : infoHub";
			
		driver.get(baseURL + "/malaria/" );
		driver.manage().window().maximize();
		String actualTitle = driver.getTitle();
		//Assert.assertEquals(expectedTitle, actualTitle);
		
		//TODO
	}
}
