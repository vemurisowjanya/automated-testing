/**
 * 
 */
package ushahidi.testcases.login;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ushahidi.commons.ApplicationConstants;
import ushahidi.commons.Driver;
import ushahidi.commons.LoginPageConstants;
import ushahidi.pages.loginpage.ForgotPasswordPageReference;
import ushahidi.pages.loginpage.LoginPageReference;
import ushahidi.pages.loginpage.UIPageReference;

/**
 * @author Kesha
 *
 */
public class ForgotPasswordTests {

	private WebDriver driver = null;
	private UIPageReference uipageref;
	private ForgotPasswordPageReference pageref; 
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		Driver d = new Driver();
		driver = d.getInstance();
		uipageref = new UIPageReference();
		pageref = new ForgotPasswordPageReference();
	
		// Getting to the login page URL
		driver.get(ApplicationConstants.baseUrl + ApplicationConstants.extlogin);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(uipageref.getRegisteredemail_xpath()).click();
	}

	@Test
	private void forgotpasswordofemail(String email) 
	{
		System.out.println("Test: forgotpasswordofemail ");
		// Entering user email
		WebElement email_temp = driver.findElements(pageref.getEmail()).get(2);
		WebElement email_element = email_temp.findElement(pageref.getEmail_id());
		email_element.sendKeys(email);
		
		// Clicking on the signup button
		WebElement signup = driver.findElements(pageref.getSubmit()).get(1);
		signup.submit();
	}
	
	@Test
	public void ExistingEmail_Success() {
		System.out.println("Test: ExistingEmail_Success ");
		// forgotpasswordofemail("kesha.shah1106@gmail.com");
		// boolean condition = check in inbox if instructions recieved ?
		
		boolean condition = true;
		assertTrue(condition);
	}
	
	@Test
	public void NonExistingEmail_Fail() {
		forgotpasswordofemail("akadbakkad@gmail.com");
		
		String check = driver.findElement(pageref.getError()).getText();
		System.out.println("NoPasswordDetails: " + check);
		Assert.assertEquals(LoginPageConstants.emailnotexist, check);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
}
