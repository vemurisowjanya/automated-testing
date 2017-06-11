package AdminFeatures;

import org.openqa.selenium.WebElement;

import PageElements.PageObjRef;
import WebDriver.Driver;

/*
* @author Anjali
*/
public class ChangePassword 
{

	public static boolean HasPasswordChanged(String oldPassword, String newPassword) 
	{
		//Select Change Password and goto to change password page
		WebElement Dropdown= Driver.Instance.findElement(PageObjRef.AdminDropdown);
		Dropdown.click();
		WebElement ChangePassword= Driver.Instance.findElement(PageObjRef.ChangePassword);
		ChangePassword.click();
		
		//Enter OldPassword
		WebElement OldPassword= Driver.Instance.findElement(PageObjRef.CurrentPassword);
		OldPassword.clear();
		OldPassword.sendKeys(oldPassword);
		
		//Enter NewPassword
		WebElement NewPassword= Driver.Instance.findElement(PageObjRef.NewPassword);
		NewPassword.clear();
		NewPassword.sendKeys(newPassword);
		
		//Confirm NewPassword
		WebElement ConfirmNewPassword= Driver.Instance.findElement(PageObjRef.ConfirmNewPassword);
		ConfirmNewPassword.clear();
		ConfirmNewPassword.sendKeys(newPassword);
		
		//Click submit
		Driver.Instance.findElement(PageObjRef.SubmitPassword).click();
		
		//Validate password update
		String check= Driver.Instance.findElement(PageObjRef.CheckPasswordChange).getText();
		
		if(check.equals("Password successfully changed."))
		    return true;
		else
		    return false;
	}

}
