/*
 * @author Anjali
 * @since 2016-06-13
 * This class performs log in as an existing user to carry out other functions that requires login.
 * It serves as a prerequisite for validating other functions after successful login.
 */
package LoginAndRegistration;
import PageObjectModel.constants;
import WebDriver.driver;

public class existingUserLogin 
{
	public static void login()
	{
		driver.Instance.get(constants.baseURL+"login.php");
		loginPage.loginAs(constants.existingEmailId)
		.withPassword(constants.existingPassword)
		.login();
	}
}
