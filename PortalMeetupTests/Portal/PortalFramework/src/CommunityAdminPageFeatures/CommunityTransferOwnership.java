package CommunityAdminPageFeatures;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		
		WebDriverWait wait = new WebDriverWait(Driver.Instance, 10);
		Submit= Driver.Instance.findElement(PageObjRef.NewAdminSubmit);
		Submit.submit();
		
		//Wait until page loads the Edit Profile button in the profile dashboard
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(PageObjRef.Edit));
		
		//Validate
		String check= Driver.Instance.findElement(PageObjRef.CheckNewAdmin).getText();
		if(check.endsWith("You no longer have any admin permissions in this community."))
			return true;
		else
			return false;
	}
}
