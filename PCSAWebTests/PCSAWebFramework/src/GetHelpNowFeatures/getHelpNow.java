/*
 * @author Anjali
 * @since 2016-06-22
 * This class maintains validation steps carried out for Get Help Now Feature.
 */
package GetHelpNowFeatures;

import org.openqa.selenium.WebElement;

import LoginAndRegistration.existingUserLogin;
import PageObjectModel.constants;
import PageObjectModel.getHelpNowPageElements;
import PageObjectModel.sideInMenuBarElements;
import WebDriver.driver;

public class getHelpNow 
{
	private static String URL;
	public static void gotoGetHelp()
	{
		existingUserLogin.login();
		WebElement getHelpTab = sideInMenuBarElements.getHelpNowTab();
		getHelpTab.click();
	}

	public static boolean isAtGetHelpNow() 
	{
		URL = driver.Instance.getCurrentUrl();
		WebElement gethelpPageTitle = getHelpNowPageElements.gethelpPageTitle();
		if(URL.contains(constants.baseURL+"getHelpNow.html")&& gethelpPageTitle.getText().contains(constants.getHelpTitle))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
