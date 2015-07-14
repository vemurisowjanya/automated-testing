/**
 * Tests the logout functionality.
 * Make sure test works anywhere where logout is required
 * 
 * @author Daisy Nkweteyim
 */
package home_page_features;


import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;


public class Logout extends common.CommonCode{
		
	@Test
	public void logout() {
		
		driver.findElement(By.xpath
				("html/body/div[1]/div/div/div/div[2]/div/h4/a[2]/font")).click();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);		

		String actualTitle = driver.getTitle();
		Assert.assertEquals("Welcome !", actualTitle);
			
	}
		
}