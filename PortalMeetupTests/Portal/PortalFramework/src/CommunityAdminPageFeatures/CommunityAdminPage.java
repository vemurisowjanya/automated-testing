package CommunityAdminPageFeatures;
import org.openqa.selenium.WebElement;
import PageElements.PageObjRef;
import WebDriver.Driver;

/*
 * @author Anjali
 */
public class CommunityAdminPage extends CommunityAdminLogin
{
    static WebElement News, Resources, ViewCommunityProfile, EditCommunityProfile, ShowJoinRequests;
    
    //Validate news button
	public static boolean IsAtNews() 
	{
		login();
		News= Driver.Instance.findElement(PageObjRef.News);
		News.click();
		if((Driver.Instance.getCurrentUrl()).equals(PageObjRef.baseURL+"community/"+PageObjRef.dummySlug+"/news/"))
			return true;
		else
			return false;
		
	}
	
	//Validate Resources button
	public static boolean IsAtResources() 
	{
		login();
		Resources= Driver.Instance.findElement(PageObjRef.Resources);
		Resources.click();
		if((Driver.Instance.getCurrentUrl()).equals(PageObjRef.baseURL+"community/"+PageObjRef.dummySlug+"/resources/"))
			return true;
		else
			return false;
	}

	//Validate View Community Profile button
	public static boolean IsAtCommunityProfile()
    {
		login();
		ViewCommunityProfile= Driver.Instance.findElement(PageObjRef.ViewCommunityProfile);
		ViewCommunityProfile.click();
		if((Driver.Instance.getCurrentUrl()).equals(PageObjRef.baseURL+"community/"+PageObjRef.dummySlug+"/profile/"))
			return true;
		else
			return false;
	}

	public static void GotoEdit() 
	{
		login();
		EditCommunityProfile= Driver.Instance.findElement(PageObjRef.EditCommunityProfile);
		EditCommunityProfile.click();
		
	}

	public static boolean AreJoinRequestsViewable() 
	{
		login();
		ShowJoinRequests= Driver.Instance.findElement(PageObjRef.ShowJoinRequests);
		ShowJoinRequests.click();
		if((Driver.Instance.getCurrentUrl()).equals(PageObjRef.baseURL+"community/"+PageObjRef.dummySlug+"/join_requests/"))
			return true;
		else
			return false;
	}

}
