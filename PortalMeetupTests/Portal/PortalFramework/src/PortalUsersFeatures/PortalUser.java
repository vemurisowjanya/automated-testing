package PortalUsersFeatures;
import org.openqa.selenium.WebElement;
import PageElements.PageObjRef;
import WebDriver.Driver;

/*
* @author Anjali
*/

public class PortalUser
{

	public static void Goto()
	{
		//Login as a portal registered user
		UserLogin.Login();
				
		//Choose community
		WebElement Community= Driver.Instance.findElement(PageObjRef.CommunityTab);
		Community.click();
		WebElement CommunityToJoin= Driver.Instance.findElement(PageObjRef.CommunityToJoin);
	    CommunityToJoin.click();
		
	}
	
	//Validates if a registered user is able to send join request to a community
	public static boolean CanSendJoinRequest() 
	{	
		//login and Goto community
		Goto();
		
		//Send Join request
		WebElement JoinCommunity= Driver.Instance.findElement(PageObjRef.JoinCommunity);
		JoinCommunity.click();
		
		//Validate
		String Check= Driver.Instance.findElement(PageObjRef.CheckJoinRequestSent).getText();		
		if(Check.endsWith("In a short while someone will review your request."))
			return true;
		else
			return false;
	}
    
	//Validates if a registered user is able to cancel the sent join request to a community
	public static boolean CanCancelJoinRequest()
	{
		//login and Goto community
		Goto();
		
		//Send Join request
		WebElement CancelRequest= Driver.Instance.findElement(PageObjRef.CancelRequest);
		CancelRequest.click();
				
		//Validate
		String Check= Driver.Instance.findElement(PageObjRef.CheckCancelRequest).getText();		
		if(Check.endsWith("was canceled."))
			return true;
		else
			return false;
	}

}
