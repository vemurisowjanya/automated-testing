package MiscellaneousCommunityFeatures;

import Login.LoginPage;

/*
* @author Anjali
*There should be four different types of user added to the community prior to this.
*/

public class Logins 
{

	public static void LogInAsContentContributor()
	{
		LoginPage.Goto();
		LoginPage.LoginAs("dummyUser1").WithPassword("dummyPass1").Login();
		
	}

	public static void LogInAsCommunityUserandContentManager() 
	{
		LoginPage.Goto();
		LoginPage.LoginAs("dummyUser2").WithPassword("dummyPass2").Login();
		
	}

	public static void LogInAsCommunityContentManager() 
	{
		LoginPage.Goto();
		LoginPage.LoginAs("dummyUser3").WithPassword("dummyPass3").Login();
		
	}

	public static void LogInAsCommunityUserWithNoPermission() 
	{
		LoginPage.Goto();
		LoginPage.LoginAs("dummyUser4").WithPassword("dummyPass4").Login();
		
	}

}
