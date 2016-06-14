/*
 * @author Anjali
 * @since 2016-06-11
 * This class checks if a user is at the welcome page after successful login.
 */
package LoginAndRegistration;
import org.openqa.selenium.WebElement;

import Logs.log4j;
import PageObjectModel.constants;
import WebDriver.driver;


public class loggedInCheck 
{
    /*
     * @return boolean value for validation(pass or fail)
     */
	public static boolean hasLogeedIn() 
	{
		WebElement title = driver.Instance.findElement(constants.welcomeTtile);
		String URL = driver.Instance.getCurrentUrl();
		log4j.Log.info("Title after login" + title.getText());
		String pageTitle = title.getText();
		System.out.println("url"+constants.baseURL+URL);
		if((pageTitle.contains(constants.pageTitleWelcome)) && (URL.contains(constants.baseURL+"welcome.html")))
		{
			return true;
		}
		else
			return false;
	}

}
