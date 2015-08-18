package AdminFeatures;
import Login.LoginPage;

/*
* @author Anjali
*/

/*
 * Logs in as default admin before validating admin tests. Replace with existing username and password 
 for this test to run.
 */
public class AdminLogin 
{
	public static void login()
	{
		LoginPage.Goto();
		LoginPage.LoginAs("dummyUsername").WithPassword("dummyPassword").Login();
	}
}
