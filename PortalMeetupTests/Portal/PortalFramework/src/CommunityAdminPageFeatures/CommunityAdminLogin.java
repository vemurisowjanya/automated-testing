package CommunityAdminPageFeatures;

import org.openqa.selenium.WebElement;

import Login.LoginPage;
import PageElements.PageObjRef;
import WebDriver.Driver;


/*
* @author Anjali
*/

/*
 *
 * Logs in as an admin for community before validating community page tests. A dummy community should be created 
 *before running this with an admin. Replace username n password with appropriate admin details for the created community.
 */
public class CommunityAdminLogin 
{
	public static void login()
	{
		LoginPage.Goto();
		LoginPage.LoginAs("dummyUsername").WithPassword("dummyPassword").Login();
		WebElement DummyCommunityName=Driver.Instance.findElement(PageObjRef.DummyCommunityName);
		DummyCommunityName.click();
	}
	
	public static void dummyLogin()
	{
		//Uses a different account
		LoginPage.Goto();
		LoginPage.LoginAs("henrydang").WithPassword("password").Login();
	}
}
