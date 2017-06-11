/*
 * @author Anjali
 * @since 2016-06-13
 * This class maintains page elements for Registration page.
 */
package PageObjectModel;
import org.openqa.selenium.WebElement;

import WebDriver.driver;


public class registrationPageElements
{
	private static WebElement element = null;
	
	/*
	 * @return Link to the cretae account page
	 */
	public static WebElement gotoCreateAccountButton()
	{
		element = driver.Instance.findElement(constants.gotoCreateAccountButton);
		return element;
	}
	
	/*
	 * @return Username field in the registration page.
	 */
	public static WebElement username()
	{
		element = driver.Instance.findElement(constants.username);
		return element;
	}
	
	/*
	 * @return Password field on the registration page.
	 */
	public static WebElement password()
	{
		element = driver.Instance.findElement(constants.signUpPassword);
		return element;
	}
	
	/*
	 * @return Host Country field on the registration page.
	 */
	public static WebElement hostCountry()
	{
		element = driver.Instance.findElement(constants.hostCountry);
		return element;
	}
	
	/*
	 * @return Email Id field in the registration page.
	 */
	public static WebElement emaiId()
	{
		element = driver.Instance.findElement(constants.signUpEmailId);
		return element;
	}
	
	/*
	 * @return Create Account button on the registration page.
	 */
	public static WebElement createAccount()
	{
		element = driver.Instance.findElement(constants.createAccount);
		return element;
	}
	
}
