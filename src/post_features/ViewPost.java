/**
 * This class tests the view posts functionality.
 * 
 * @author daisy
*/

package post_features;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import common.CommonCode;

public class ViewPost extends CommonCode {
		
	String expectedTitle;
		
	@Test
	public void viewpost() {
		
		driver.get(utilities.Constants.list_of_posts);
		try {
			WebElement viewButton = driver.findElement(By.linkText("View"));
			viewButton.click();
			}
			catch(NoSuchElementException e) {
				System.out.println("No such element: View");
			}
	}
}