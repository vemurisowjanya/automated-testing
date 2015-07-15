/**
 * This class tests the view posts functionality.
 * 
 * @author Daisy Nkweteyim
 */


package post_features;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class ViewPost extends common.CommonCode {
		
	String expectedTitle;
		
	@Test
	public void viewpost() {
	expectedTitle = "Notice";
	driver.get(baseURL + "/post_new/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("html/body/center[2]/h4/a/u")).click();	
	String actualTitle = driver.getTitle();
	Assert.assertTrue("Not the expected title", expectedTitle.equals(actualTitle));
			//TODO after that	
	}
}


