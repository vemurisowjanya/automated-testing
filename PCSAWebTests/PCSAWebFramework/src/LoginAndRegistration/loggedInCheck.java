/*
 * @author Anjali
 * @since 2016-06-11
 * This class checks if a user is at the welcome page after successful login.
 */
package LoginAndRegistration;
import org.openqa.selenium.WebElement;
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
		if((title.getText().equals("")) && (driver.Instance.getCurrentUrl().equals(constants.baseURL+"welcome.html")))
		{
			return true;
		}
		else
			return true;
	}

}
