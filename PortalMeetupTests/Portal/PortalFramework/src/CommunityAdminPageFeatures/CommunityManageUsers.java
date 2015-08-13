package CommunityAdminPageFeatures;

import org.openqa.selenium.WebElement;

import PageElements.PageObjRef;
import WebDriver.Driver;

/*
 * @author Anjali
 */

public class CommunityManageUsers extends CommunityAdminLogin
{

	public static boolean CanManage() 
	{
		//Login as community admin
		login();
		
		//Goto Manage community users
		WebElement ManageCommunityUsers= Driver.Instance.findElement(PageObjRef.ManageCommunityUsers);
		ManageCommunityUsers.click();
		
		//Click on permissions
		WebElement Permissions= Driver.Instance.findElement(PageObjRef.CommunityPermissions);
		Permissions.click();
		
		//Change current permission for Community content contributor
		WebElement ContentContributor= Driver.Instance.findElement(PageObjRef.CommunityContentContributor);
		ContentContributor.click();
		
		//Submit
		WebElement Submit= Driver.Instance.findElement(PageObjRef.ManageCommunitySubmit);
		Submit.click();
		
		if(Driver.Instance.getCurrentUrl().equals(PageObjRef.baseURL+"community/"+PageObjRef.dummySlug+"/users/"))
			return true;
		else
			return false;
	}

}
