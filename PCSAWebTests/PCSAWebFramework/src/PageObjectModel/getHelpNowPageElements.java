/*
 * @author Anjali
 * @since 2016-06-22
 * This class maintains page elements for the Get Help Now Features.
 */
package PageObjectModel;

import org.openqa.selenium.WebElement;

import WebDriver.driver;

public class getHelpNowPageElements 
{
	public static WebElement element;
	
	/*
	 * @return Get help page title on the Get Help Page.
	 */
	public static WebElement gethelpPageTitle()
	{
		element = driver.Instance.findElement(constants.gethelpPageTitle);
		return element;
	}
}
