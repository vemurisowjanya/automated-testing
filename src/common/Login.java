package common;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends common.CommonCode{

	private String expectedTitle; 
	
	
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
}
