package CommunityAdminPageFeatures;

import org.openqa.selenium.WebElement;

import Login.LoginPage;
import PageElements.PageObjRef;
import WebDriver.Driver;


/*
* @author Anjali
*/

/*
 * Logs in as an admin for community before validating community page tests
 */
public class CommunityAdminLogin 
{
	public static void login()
	{
		LoginPage.Goto();
		LoginPage.LoginAs("anjali").WithPassword("anjali").Login();
		WebElement DummyCommunityName=Driver.Instance.findElement(PageObjRef.DummyCommunityName);
		DummyCommunityName.click();
	}
}
