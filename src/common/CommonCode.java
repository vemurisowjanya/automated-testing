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
import org.junit.Test;
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
	
	@Test
	public void addpost(String title, String description) {
		
		expectedTitle = "Malaria : infoHub";
			
		driver.get(baseURL + "/malaria/" );
		String actualTitle = driver.getTitle();
		//Assert.assertEquals(expectedTitle, actualTitle);
	
		
		//TODO: input arbitrary values (more generic)perhaps from excel sheet.
		
		// click on new post
		driver.findElement(By.xpath("html/body/div[2]/div/button")).click();
		driver.findElement(By.xpath
				("html/body/div[2]/div[1]/form/div[1]/div[3]/input")).sendKeys(title);
		driver.findElement(By.xpath
				("html/body/div[2]/div[1]/form/div[2]/div[3]/textarea")).sendKeys
				(description);		

		//click on submit
		driver.findElement(By.xpath("html/body/div[2]/div[1]/form/center/div/div[2]/input")).click();
		String result = driver.findElement(By.xpath("html/body/div[2]/center[1]/h4")).getText();
		System.out.println(result);
	}
	
	@After
	public void destroy() {
		driver.close();
	}
}
