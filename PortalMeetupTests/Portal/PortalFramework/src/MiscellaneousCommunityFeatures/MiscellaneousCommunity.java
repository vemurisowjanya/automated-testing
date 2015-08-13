package MiscellaneousCommunityFeatures;

import org.openqa.selenium.WebElement;

import PageElements.PageObjRef;
import WebDriver.Driver;

/*
* @author Anjali
*/

public class MiscellaneousCommunity 
{
	private static WebElement Permission;
	private static String check;

	//Checks if an community's content contributor has the required permission
	public static boolean IsCommunityContentContributor()
	{
		// Login as Community's Content Contributor
		Logins.LogInAsContentContributor();
		
		//Check for permission
		Permission= Driver.Instance.findElement(PageObjRef.CommunityPermission);
		check= Permission.getText();
		
		//Validate
		if(check.endsWith("Content Contributor"))
			return true;
		else
			return false;
	}

	//Checks if an community's user and content manager has the required permission
	public static boolean IsCommunityUserandContentManager() 
	{
		// Login as Community's User and Content Manager
		Logins.LogInAsCommunityUserandContentManager();
				
		//Check for permission
		Permission= Driver.Instance.findElement(PageObjRef.CommunityPermission);
		check= Permission.getText();
				
		//Validate
		if(check.endsWith(" User and Content Manager"))
			return true;
		else
			return false;
	}

	//Checks if an community's content manager has the required permission
	public static boolean IsCommuntiyContentManagerTest()
	{
		// Login as Community's Content Manager
		Logins.LogInAsCommunityContentManager();
						
		//Check for permission
		Permission= Driver.Instance.findElement(PageObjRef.CommunityPermission);
		check= Permission.getText();
						
		//Validate
		if(check.endsWith("Content Manager"))
			return true;
		else
			return false;
	}

	//Checks if an community's user with no permission has no permission
	public static boolean UserHasNoPermission() 
	{
		// Login as Community's User with no permission
		Logins.LogInAsCommunityUserWithNoPermission();
	
	    //Check for permission
	    Permission= Driver.Instance.findElement(PageObjRef.CommunityNoPermission);
	    check= Permission.getText();
					
	    //Validate
	    if(check.equals("Looks like you have no permissions."))
	    	return true;
	    else
	    	return false;
	}

}
