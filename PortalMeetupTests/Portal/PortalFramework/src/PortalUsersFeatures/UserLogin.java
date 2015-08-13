package PortalUsersFeatures;
import Login.LoginPage;

/*
* @author Anjali
*/

/*
 * Logs in as a registered portal user before validating portal user tests
 */
public class UserLogin 
{
	public static void Login()
	{
		LoginPage.Goto();
		LoginPage.LoginAs("shally").WithPassword("shally").Login();
	}
}
