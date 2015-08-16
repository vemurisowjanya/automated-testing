/**
 * This class tests the edit post functionality.
 * 
 * @author daisy
 */

package post_features;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import common.CommonCode;

public class EditPost extends CommonCode {
	private String expectedTitle; 

	@Test
	public void editpost() {
		
		driver.get(utilities.Constants.list_of_posts);
		try {			
			WebElement editButton = driver.findElement(By.linkText("Edit"));
			editButton.click();
			}
			catch(NoSuchElementException e) {
				System.out.println("No such element: Edit");
			}
	}
}