package MeetupLocationPageFeatures;
import Login.LoginPage;


/*
 * @author Anjali
 *An admin must be added
 */
public class MeetupLocationAdminLogin
{
	public static void AdminLogin()
	{
		LoginPage.Goto();
		LoginPage.LoginAs("dummyUsername").WithPassword("dummyPassword").Login();
	}
}