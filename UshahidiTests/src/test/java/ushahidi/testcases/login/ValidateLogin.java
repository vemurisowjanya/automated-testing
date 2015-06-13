/**
 * 
 */
package ushahidi.testcases.login;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ushahidi.commons.ApplicationConstants;
import ushahidi.commons.Driver;
import ushahidi.pages.loginpage.LoginPageRefrence;

/**
 * @author Kesha
 *
 */
public class ValidateLogin {

	WebDriver driver = null;
	LoginPageRefrence pageref;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		Driver d = new Driver();
		driver = d.getInstance();
		pageref = new LoginPageRefrence();
	}

	public void loginWith(String username, String password)
			throws InterruptedException {

		driver.get(ApplicationConstants.baseUrl + ApplicationConstants.extlogin);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Enter user email id
		WebElement login_text = driver.findElements(pageref.getLogin_text_class()).get(0);
		WebElement uname = login_text.findElement(pageref.getUsername_id());
		uname.sendKeys(username);

		// Enter user password
		login_text = driver.findElements(pageref.getLogin_text_class()).get(1);
		WebElement pswd = login_text.findElement(pageref.getPassword_id());
		pswd.sendKeys(password);

		// Press Enter
		WebElement login = driver.findElement(pageref.getSubmit_id());
		login.submit();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test
	public void loginCorrectUsernameCorrectPassword() throws InterruptedException {
		loginWith("kesha.shah1106@gmail.com", "abc123");

		// Check for logout button
		driver.findElement(By.className("header_nav_label")).click();
		String check = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[2]/li/ul/li[4]/a/em")).getText();
		System.out.println(check);
		Assert.assertEquals("Logout", check);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
}
