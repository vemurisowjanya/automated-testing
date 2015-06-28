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
                //logs in as an admin
		LoginPage.Goto();
		LoginPage.LoginAs("anjali").WithPassword("anjali").Login();

                //Takes to the dummy meetup location page
		WebElement DummyCommunityName=Driver.Instance.findElement(PageObjRef.DummyCommunityName);
		DummyCommunityName.click();
	}
}
