/**
 * This class is a subclass to other classes.  It will serve as the common code which these classes will share.
 * It describes what will happen before and after the actual tests.
 * 
 * @author Daisy Nkweteyim
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

	protected String baseURL; 
	protected WebDriver driver;		

	@Before
	public void start() {
		baseURL = "http://localhost:8001";			
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//public void login() {
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
		
		//wait to load page to get title
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);		
		Assert.assertEquals("Dashboard", driver.getTitle());
	}
	
	@After
	public void destroy() {
		driver.close();
	}
}
