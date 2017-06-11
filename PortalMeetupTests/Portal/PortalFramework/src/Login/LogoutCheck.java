package Login;
import org.openqa.selenium.WebElement;
import PageElements.PageObjRef;
import WebDriver.Driver;

/*
* @author Anjali
*/
public class LogoutCheck
{
	public static boolean HasLoggedOut()
	{
		//Goto Dropdown list on the upper left of the page, choose logout and click it
		WebElement DropDownList= Driver.Instance.findElement(PageObjRef.AdminDropdown);
		DropDownList.click();
		WebElement Logout= Driver.Instance.findElement(PageObjRef.Logout);
		Logout.click();
		
		//Confirm logout
		WebElement ConfirmLogout= Driver.Instance.findElement(PageObjRef.ConfirmLogout);
		ConfirmLogout.click();
		
		//Validate Logout
		WebElement CheckLogout= Driver.Instance.findElement(PageObjRef.LogoutCheck);
		String check= CheckLogout.getText();
	
		if((Driver.Instance.getCurrentUrl().equals(PageObjRef.baseURL)) && (check.equals("You have signed out.")) )
		    return true;
		else
			return false;
	}
}
