/*
 * @author Anjali
 * @since 2016-06-08
 * This class maintains page elements for Login and Registration page.
 */
package PageObjectModel;
import org.openqa.selenium.WebElement;
import WebDriver.driver;

public class loginPageElements 
{
	public static WebElement element = null;
	
	/*
	 * @return EmailId field from login page.
	 */
	public static WebElement emailId()
	{
		element = driver.Instance.findElement(constants.EmailId);
		return element;
	}
	
	/*
	 * @return Password field on login page.
	 */
	public static WebElement password()
	{
		element = driver.Instance.findElement(constants.password);
		return element;
	}
	
	/*
	 * @return Sign In button on login page.
	 */
	public static WebElement signInButton()
	{
		element = driver.Instance.findElement(constants.signInButton);
		return element;
	}
}
