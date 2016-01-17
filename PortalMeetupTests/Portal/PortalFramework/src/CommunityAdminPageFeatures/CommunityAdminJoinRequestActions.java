package CommunityAdminPageFeatures;
import org.junit.Before;
import org.openqa.selenium.WebElement;

import AdminFeatures.AdminLogin;
import PageElements.PageObjRef;
import WebDriver.Driver;

/*
 * @author Anjali
 */
public class CommunityAdminJoinRequestActions extends CommunityAdminLogin
{
	
	public static void createNewRequest(){
		dummyLogin();
		
		WebElement communities = Driver.Instance.findElement(PageObjRef.CommunityTab);
		communities.click();
		
		WebElement dummyCommunity = Driver.Instance.findElement(PageObjRef.DummyCommunity);
		dummyCommunity.click();
		
		WebElement joinCommunity = Driver.Instance.findElement(PageObjRef.JoinCommunityButton);
		joinCommunity.click();
		
		AdminLogin.signOutUser();
	}
	
	public static boolean CanApproveRequest() 
	{
		createNewRequest();
		
		//Log in as community Admin
		login();
		
		//Goto to JOin requests page
		WebElement ShowJoinRequests= Driver.Instance.findElement(PageObjRef.ShowJoinRequests);
		ShowJoinRequests.click();
		
		//Approve request
		WebElement Approve= Driver.Instance.findElement(PageObjRef.ApproveJoinRequest);
		Approve.click();
		
		//Validate approval
		String check= Driver.Instance.findElement(PageObjRef.CheckRequestAction).getText();
		if(check.contains(" successfully became a member of"))
		    return true;
		else
			return false;
	}
	
	public static boolean CanRejectRequest() 
	{
		createNewRequest();
		//Log in as community Admin
		login();
		
		//Goto to JOin requests page
		WebElement ShowJoinRequests= Driver.Instance.findElement(PageObjRef.ShowJoinRequests);
		ShowJoinRequests.click();
		
		//Approve request
		WebElement Approve= Driver.Instance.findElement(PageObjRef.RejectJoinRequest);
		Approve.click();
		
		//Validate approval
		String check= Driver.Instance.findElement(PageObjRef.CheckRequestAction).getText();
		if(check.contains(" was successfully rejected to become a member of"))
		    return true;
		else
			return false;
	}

}
