/**
 * This class contains the test case for login with TestNG Data Provider
 * 
 * @author daisy
 */
package common;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class LoginTest extends CommonCode {
	private String expectedTitle;
	
	
  @Test(dataProvider = "Authentication")
  public void login(String username, String password) {
		expectedTitle = "Welcome !";
		driver.get(baseURL);
		driver.manage().window().maximize();
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys(username);
		WebElement passWord = driver.findElement(By.name("password"));
		passWord.sendKeys(password);
		
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
		
		//wait to load page to get title
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);		
		Assert.assertEquals("Dashboard", driver.getTitle());
	}

  @DataProvider (name = "Authentication")
  public static Object[][] credentials() {
	  //tests will be executed thrice using the excel sheet
	  Object[][] credentials = new Object[][] {{"username, password"}};
	  return credentials;
  }
}
