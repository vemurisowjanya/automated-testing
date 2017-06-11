/**
 * 
 */
package ushahidi.testcases.login;

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
import ushahidi.pages.loginpage.LoginPageReference;
import ushahidi.pages.loginpage.UIPageReference;

/**
 * @author Kesha
 *
 */
public class UILoginTests {

	WebDriver driver = null;
	UIPageReference pageref;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp()  throws Exception {
		Driver d = new Driver();
		driver = d.getInstance();
		pageref = new UIPageReference();
	
		// Getting to the login page URL
		driver.get(ApplicationConstants.baseUrl + ApplicationConstants.extlogin);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test
	public void LoginUIisOpenByDefault() {
		System.out.println("Test: LoginUIisOpenByDefault ");
		
		WebElement loginUI = driver.findElement(pageref.getLoginUi_id());
		String getDisplayValue = loginUI.getCssValue("display");
		System.out.println(getDisplayValue);
		Assert.assertEquals(LoginPageConstants.visible_css, getDisplayValue);
	}
	
	@Test
	public void LoginUIisClosedByClicking() {
		System.out.println("Test: LoginUIisClosedByClicking ");
		
		driver.findElement(pageref.getEmailLink_xpath()).click();
		WebElement loginUI = driver.findElement(pageref.getLoginUi_id());
		String getDisplayValue = loginUI.getCssValue("display");
		System.out.println(getDisplayValue);
		Assert.assertEquals(LoginPageConstants.visible_css, getDisplayValue);	
	}

	@Test
	public void SignupUIisCloseByDefault() {
		System.out.println("Test: SignupUIisCloseByDefault ");
		
		WebElement signupUI = driver.findElement(pageref.getSignupUi_id());
		String getDisplayValue = signupUI.getCssValue("display");
		System.out.println(getDisplayValue);
		Assert.assertEquals(LoginPageConstants.nonvisible_css, getDisplayValue);
	}
	
	@Test
	public void SignupUIisOpenedByClicking() {
		System.out.println("Test: SignupUIisOpenedByClicking ");
		
		driver.findElement(pageref.getCreateAccount_xpath()).click();
		WebElement signupUI = driver.findElement(pageref.getSignupUi_id());
		String getDisplayValue = signupUI.getCssValue("display");
		System.out.println(getDisplayValue);
		Assert.assertEquals(LoginPageConstants.visible_css, getDisplayValue);
	}

	@Test
	public void ForgotPasswordUIisCloseByDefault() {
		System.out.println("Test: ForgotPasswordUIisCloseByDefault ");
		
		WebElement forgotUI = driver.findElement(pageref.getForgotUi_id());
		String getDisplayValue = forgotUI.getCssValue("display");
		System.out.println(getDisplayValue);
		Assert.assertEquals(LoginPageConstants.nonvisible_css, getDisplayValue);
	}

	@Test
	public void ForgotPasswordUIisOpenedByClicking() {
		System.out.println("Test: ForgotPasswordUIisOpenedByClicking ");
		
		driver.findElement(pageref.getRegisteredemail_xpath()).click();
		WebElement forgotUI = driver.findElement(pageref.getForgotUi_id());
		String getDisplayValue = forgotUI.getCssValue("display");
		System.out.println(getDisplayValue);
		Assert.assertEquals(LoginPageConstants.visible_css, getDisplayValue);
	}

		
	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
}
