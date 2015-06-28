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
                //Log in and goto commmunity page
		login();
                
                //Click on News
		News= Driver.Instance.findElement(PageObjRef.News);
		News.click();

                //Validate
		if((Driver.Instance.getCurrentUrl()).equals(PageObjRef.baseURL+"community/"+PageObjRef.dummySlug+"/news/"))
			return true;
		else
			return false;
		
	}
	
	//Validate Resources button
	public static boolean IsAtResources() 
	{
                //Log in and goto commmunity page
		login();

                //Click on Resource
		Resources= Driver.Instance.findElement(PageObjRef.Resources);
		Resources.click();
 
                //Validate
		if((Driver.Instance.getCurrentUrl()).equals(PageObjRef.baseURL+"community/"+PageObjRef.dummySlug+"/resources/"))
			return true;
		else
			return false;
	}

	//Validate View Community Profile button
	public static boolean IsAtCommunityProfile()
        {
                //Log in and goto commmunity page
		login();

                //Click on View Community Profile
		ViewCommunityProfile= Driver.Instance.findElement(PageObjRef.ViewCommunityProfile);
		ViewCommunityProfile.click();

                //Validate
		if((Driver.Instance.getCurrentUrl()).equals(PageObjRef.baseURL+"community/"+PageObjRef.dummySlug+"/profile/"))
			return true;
		else
			return false;
	}

        //Takes to the edit community profile page
	public static void GotoEdit() 
	{
		login();
		EditCommunityProfile= Driver.Instance.findElement(PageObjRef.EditCommunityProfile);
		EditCommunityProfile.click();
		
	}

	public static boolean AreJoinRequestsViewable() 
	{
                //Log in and goto commmunity page
		login();

                //Click on Show Join Requests
		ShowJoinRequests= Driver.Instance.findElement(PageObjRef.ShowJoinRequests);
		ShowJoinRequests.click();

                //Validate
		if((Driver.Instance.getCurrentUrl()).equals(PageObjRef.baseURL+"community/"+PageObjRef.dummySlug+"/join_requests/"))
			return true;
		else
			return false;
	}

}
