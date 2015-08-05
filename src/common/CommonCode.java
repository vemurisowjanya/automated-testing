/**
 * This class provides common functionalities for other classes.
 * 
 * @author daisy
 */

package common;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonCode {
	private String expectedTitle; 

	protected static String baseURL; 
	protected static WebDriver driver;		

	@Before
	public void start() {
		baseURL = utilities.Constants.baseURL;			
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		expectedTitle = "Welcome !";
		driver.get(baseURL);
		driver.manage().window().maximize();
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys(utilities.Constants.defaultUsername);
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(utilities.Constants.defaultPassword);		
		WebElement submit = driver.findElement(By.name(utilities.Constants.sumbitButton));
		submit.click();
		
		//wait for load page to get title
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);		
		Assert.assertEquals("Dashboard", driver.getTitle());
	}
	
	@After
	public void destroy() {
		driver.close();
	}
}
