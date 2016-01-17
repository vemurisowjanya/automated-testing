package AdminFeatures;
import Login.LoginPage;
import PageElements.PageObjRef;
import WebDriver.Driver;

/*
* @author Anjali
*/

/*
 * Logs in as default admin before validating admin tests. Replace with existing username and password 
 for this test to run.
 */
public class AdminLogin 
{
	public static void login()
	{
		LoginPage.Goto();
		LoginPage.LoginAs("dummyUsername").WithPassword("dummyPassword").Login();
	}
	
	public static void dummyLogin(){
		//Uses a different account
		LoginPage.Goto();
		LoginPage.LoginAs("henrydang").WithPassword("password").Login();
	}
	
	public static void signOutUser(){
		Driver.Instance.findElement(PageObjRef.AdminDropdown).click();
		Driver.Instance.findElement(PageObjRef.Logout).click();
		Driver.Instance.findElement(PageObjRef.ConfirmLogout).click();
	}
}
