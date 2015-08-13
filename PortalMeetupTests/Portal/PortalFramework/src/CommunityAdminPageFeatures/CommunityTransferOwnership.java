package CommunityAdminPageFeatures;

import org.openqa.selenium.WebElement;

import PageElements.PageObjRef;
import WebDriver.Driver;

/*
 * @author Anjali
 */
public class CommunityTransferOwnership extends CommunityAdminLogin
{

	public static boolean CanTransferOwnership()
	{
		//Login as community admin
		login();
		
		//Select Transfer Ownership and click
		WebElement TransferOwnership= Driver.Instance.findElement(PageObjRef.TransferOwnership);
		TransferOwnership.click();
		
		//Choose new admin and submit
		WebElement NewCommunityList, ChooseNewAdmin, Submit;
		NewCommunityList= Driver.Instance.findElement(PageObjRef.NewCommunityAdminLIst);
		NewCommunityList.click();
		ChooseNewAdmin= Driver.Instance.findElement(PageObjRef.ChooseNewAdmin);
		ChooseNewAdmin.click();
		Submit= Driver.Instance.findElement(PageObjRef.NewAdminSubmit);
		Submit.click();
		
		//Validate
		String check= Driver.Instance.findElement(PageObjRef.CheckNewAdmin).getText();
		if(check.endsWith("You no longer have any admin permissions in this community."))
			return true;
		else
			return false;
	}
	
}
