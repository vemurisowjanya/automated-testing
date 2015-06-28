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
import ushahidi.commons.LoginPageConstants;
import ushahidi.pages.loginpage.LoginPageReference;

/**
 * @author Kesha
 *
 */
public class ValidateLoginTests {

	private WebDriver driver = null;
	private LoginPageReference pageref;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		Driver d = new Driver();
		driver = d.getInstance();
		pageref = new LoginPageReference();
	
		// Getting to the login page URL
		driver.get(ApplicationConstants.baseUrl + ApplicationConstants.extlogin);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	private void loginWith(String username, String password)
			throws InterruptedException {
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
		System.out.println("Test: loginCorrectUsernameCorrectPassword ");
		
		loginWith("kesha.shah1106@gmail.com", "abc123");

		// Check for logout button
		driver.findElement(By.className("header_nav_label")).click();
		String check = driver.findElement(pageref.getLogout_xpath()).getText();
		System.out.println("Test: loginCorrectUsernameCorrectPassword " + check);
		Assert.assertEquals(LoginPageConstants.logout, check);
		driver.findElement(pageref.getLogout_xpath()).click();
	}

	@Test
	public void loginCorrectUsernameIncorrectPassword() throws InterruptedException {
		System.out.println("Test: loginCorrectUsernameIncorrectPassword ");
		
		loginWith("kesha.shah1106@gmail.com", "123abc");

		// Check for logout button
		String check = driver.findElement(pageref.getAutherror_xpath()).getText();
		System.out.println("Test: loginCorrectUsernameIncorrectPassword " + check);
		Assert.assertEquals(LoginPageConstants.incorrectuseridorpassword, check);
	}
	
	@Test
	public void loginIncorrectUsernameCorrectPassword() throws InterruptedException {
		System.out.println("Test: loginIncorrectUsernameCorrectPassword ");
		
		loginWith("missshah1106@gmail.com", "abc123");

		// Check for logout button
		String check = driver.findElement(pageref.getAutherror_xpath()).getText();
		System.out.println("Test: loginIncorrectUsernameCorrectPassword " + check);
		Assert.assertEquals(LoginPageConstants.incorrectuseridorpassword, check);
	}
	
	@Test
	public void loginNoUsernameAndSomePassword() throws InterruptedException {
		System.out.println("Test: loginNoUsernameAndSomePassword ");
		
		loginWith("", "abc123");

		// Check for logout button
		String check = driver.findElement(pageref.getAutherror_xpath()).getText();
		System.out.println("Test: loginNoUsernameAndSomePassword " + check);
		Assert.assertEquals(LoginPageConstants.nouserid, check);
	}
	
	@Test
	public void loginSomeUsernameAndNoPassword() throws InterruptedException {
		System.out.println("Test: loginSomeUsernameAndNoPassword ");
		
		loginWith("missshah1106@gmail.com", "");

		// Check for logout button
		String check = driver.findElement(pageref.getAutherror_xpath()).getText();
		System.out.println("Test: loginSomeUsernameAndNoPassword " + check);
		Assert.assertEquals(LoginPageConstants.nopassword, check);
	}
	
	@Test
	public void loginNoUsernameAndNoPassword() throws InterruptedException {
		System.out.println("Test: loginNoUsernameAndNoPassword ");
		
		loginWith("", "");

		// Check for logout button
		String check = driver.findElement(pageref.getAutherror_xpath()).getText();
		System.out.println("Test: loginSomeUsernameAndNoPassword " + check);
		Assert.assertEquals(LoginPageConstants.nouserid+"\n"+LoginPageConstants.nopassword, check);
	}
		
	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
}
