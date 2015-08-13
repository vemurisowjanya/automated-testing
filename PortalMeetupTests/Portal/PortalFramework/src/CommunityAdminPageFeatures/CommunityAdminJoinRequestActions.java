package CommunityAdminPageFeatures;
import org.openqa.selenium.WebElement;
import PageElements.PageObjRef;
import WebDriver.Driver;

/*
 * @author Anjali
 */
public class CommunityAdminJoinRequestActions extends CommunityAdminLogin
{

	public static boolean CanApproveRequest() 
	{
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
		if(check.contains(" successfully became a member of DummyCommunity community."))
		    return true;
		else
			return false;
	}
	
	public static boolean CanRejectRequest() 
	{
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
		if(check.contains(" was successfully rejected to become a member of DummyCommunity community"))
		    return true;
		else
			return false;
	}

}
