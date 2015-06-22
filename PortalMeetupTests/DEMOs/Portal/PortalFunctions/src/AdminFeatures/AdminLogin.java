package AdminFeatures;
import Login.LoginPage;

/*
* @author Anjali
*/

/*
 * Logs in as default admin before validating admin tests
 */
public class AdminLogin 
{
	public static void login()
	{
		LoginPage.Goto();
		LoginPage.LoginAs("anjali").WithPassword("anjali").Login();
	}
}
