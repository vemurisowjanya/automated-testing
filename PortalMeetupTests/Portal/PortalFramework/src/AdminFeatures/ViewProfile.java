package AdminFeatures;
import org.openqa.selenium.WebElement;
import PageElements.PageObjRef;
import WebDriver.Driver;

/*
* @author Anjali
*/
public class ViewProfile 
{
	public static boolean CanViewProfile()
	{
		//Select Profile tab from dropdown and click on it
		WebElement Dropdown, Profile;
		Dropdown= Driver.Instance.findElement(PageObjRef.AdminDropdown);
		Dropdown.click();
		Profile= Driver.Instance.findElement(PageObjRef.Profile);
		Profile.click();
		
		//Validate
		WebElement ProfileCheck= Driver.Instance.findElement(PageObjRef.ProfileCheck);
		String check= ProfileCheck.getText();

		if(check.equals("Profile"))
		    return true;
		else
			return false;
	}
}
