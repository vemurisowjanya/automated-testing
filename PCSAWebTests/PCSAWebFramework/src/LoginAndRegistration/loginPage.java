/*
 * @author Anjali
 * @since 2016-06-11
 * This class takes to the login page.
 */
package LoginAndRegistration;
import Logs.log4j;
import PageObjectModel.constants;
import WebDriver.driver;



public class loginPage 
{

	public static void Goto() 
	{
		log4j.Log.info("Navigated to Login page");
		driver.Instance.get(constants.baseURL);
		log4j.Log.info("At login page");
	}

	public static loginCommand loginAs(String emailId) 
	{
		return new loginCommand(emailId);
	}
	
}
