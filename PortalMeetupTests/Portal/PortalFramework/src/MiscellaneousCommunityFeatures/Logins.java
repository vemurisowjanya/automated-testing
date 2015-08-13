package MiscellaneousCommunityFeatures;

import Login.LoginPage;

/*
* @author Anjali
*/

public class Logins 
{

	public static void LogInAsContentContributor()
	{
		LoginPage.Goto();
		LoginPage.LoginAs("ABC").WithPassword("abcabc").Login();
		
	}

	public static void LogInAsCommunityUserandContentManager() 
	{
		LoginPage.Goto();
		LoginPage.LoginAs("xyz").WithPassword("xyzxyz").Login();
		
	}

	public static void LogInAsCommunityContentManager() 
	{
		LoginPage.Goto();
		LoginPage.LoginAs("pqr").WithPassword("pqrpqr").Login();
		
	}

	public static void LogInAsCommunityUserWithNoPermission() 
	{
		LoginPage.Goto();
		LoginPage.LoginAs("ABCD").WithPassword("abcdabcd").Login();
		
	}

}
