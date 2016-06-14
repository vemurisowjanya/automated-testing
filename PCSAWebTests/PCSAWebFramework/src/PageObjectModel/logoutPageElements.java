/*
 * @author Anjali
 * @since 2016-06-13
 * This class maintains page elements for Logout feature.
 */
package PageObjectModel;
import org.openqa.selenium.WebElement;

import WebDriver.driver;

public class logoutPageElements 
{
	private static WebElement element;
	
	/*
	 * @return Logout link on the welcome page.
	 */
	public static WebElement logoutButton()
	{
		element = driver.Instance.findElement(constants.logoutButton);
		return element;
	}
}
