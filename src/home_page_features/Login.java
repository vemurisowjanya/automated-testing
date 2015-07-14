/**
 * The login test
 *
 * Make sure test works anywhere where login is required
 * 
 * @author Daisy Nkweteyim
 */
package home_page_features;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends common.CommonCode {
	
	private String expectedTitle; 
	
	
	//test what happens with false values(expected/actual list)
	@Test
	public void login() {
		expectedTitle = "Welcome !";
		driver.get(baseURL);
		driver.manage().window().maximize();
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("admin");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("mypassword");
		
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
		
		Assert.assertEquals("Dashboard", driver.getTitle());
	}
}

		