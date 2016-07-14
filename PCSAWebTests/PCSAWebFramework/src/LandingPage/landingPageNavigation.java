/*
 * @author Anjali
 * @since 2016-06-08
 * This triggers the landing page URL.
 */
package LandingPage;
import org.openqa.selenium.WebElement;

import PageObjectModel.constants;
import WebDriver.driver;


public class landingPageNavigation 
{
   //Navigates to the URL
	public static void navigateToURL() 
	{
		// TODO Auto-generated method stub
		driver.Instance.get(constants.baseURL);
	}

	public static boolean isAtLanding() 
	{
		if(driver.Instance.getCurrentUrl().contains(constants.baseURL))
			return true;
		else 
			return false;
	}
}
