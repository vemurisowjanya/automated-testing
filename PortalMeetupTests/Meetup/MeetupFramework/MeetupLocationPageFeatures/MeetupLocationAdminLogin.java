package MeetupLocationPageFeatures;
import Login.LoginPage;


/*
 * @author Anjali
 */
public class MeetupLocationAdminLogin
{
	public static void AdminLogin()
	{
		LoginPage.Goto();
		LoginPage.LoginAs("anjali").WithPassword("anjali").Login();
	}
}
