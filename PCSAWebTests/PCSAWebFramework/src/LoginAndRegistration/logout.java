/*
 * @author Anjali
 * @since 2016-06-08
 * This class validates logout feature of the application.
 */
package LoginAndRegistration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjectModel.constants;
import PageObjectModel.logoutPageElements;
import WebDriver.driver;


public class logout
{
	private static String URL;
	public static boolean isAtWelcome()
	{
		existingUserLogin.login();
		
		URL = driver.Instance.getCurrentUrl();
		System.out.println(URL);
		if(URL.contains(constants.baseURL+"welcome.php"))
		{
			return true;
		}
		else
			return false;
	}

	public static boolean isAbleToLogout() 
	{
		if(isAtWelcome())
		{
			WebElement logoutButton = logoutPageElements.logoutButton();
			logoutButton.click();
			URL = driver.Instance.getCurrentUrl();
			if(URL.contains(constants.baseURL+"login.php"))
			{
				return true;
			}
		}
		return false;
	}
	
}
