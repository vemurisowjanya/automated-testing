/**
 * This class tests the signup functionality 
 *  
 * @author Daisy Nkweteyim
 */


package home_page_features;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class Signup extends common.CommonCode{
	private String expectedTitle;

	@Test
	public void signup() {
		
		expectedTitle = "Sign Up";	
		driver.get(baseURL);
		driver.manage().window().maximize();
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		
		driver.findElement(By.xpath("html/body/center/div/form/h4/b/font/a/u")).click();
		
		//TODO complete signup
	}
		
}

