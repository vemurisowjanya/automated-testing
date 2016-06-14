/*
 * @author Anjali
 * @since 2016-06-13
 * This class navigates to the registration page and validates against user registration in the application.
 */
package LoginAndRegistration;
import org.openqa.selenium.WebElement;
import Logs.log4j;
import PageObjectModel.constants;
import PageObjectModel.registrationPageElements;
import WebDriver.driver;


public class registration
{
	private static String URL;

	/*
	 * Takes to the registration page.
	 */
	public static void Goto() 
	{
		
		driver.Instance.get(constants.baseURL+"login.php");
		log4j.Log.info("Navigating to the registration page");
		WebElement gotoCreateAccount = registrationPageElements.gotoCreateAccountButton();
		gotoCreateAccount.click();
	}
	
	/*
	 * @return true if at registration page else false
	 */
	public static boolean isAtRegistrationPage()
	{
		URL = driver.Instance.getCurrentUrl();
		if(URL.contains(constants.baseURL+"registration.php"))
		{
			log4j.Log.info("At Registration Page");
			return true;
		}
		else 
			return false;
	}
    
	/*
	 * @param Username for registration is the first parameter
	 * @param Password for registration is the second parameter
	 * @param Host Country for registration is the third parameter
	 * @param Email for registration is the forth parameter
	 */
	public static void registerWith(String username, String password, String hostCountry, String emailId)
	{
		if(isAtRegistrationPage())
		{
			WebElement usrnm, passwrd, hostCntry, emlID, createAccount;
			usrnm = registrationPageElements.username();
			passwrd = registrationPageElements.password();
			hostCntry = registrationPageElements.hostCountry();
			emlID = registrationPageElements.emaiId();
			createAccount = registrationPageElements.createAccount();
			usrnm.clear();
			usrnm.sendKeys(username);
			passwrd.clear();
			passwrd.sendKeys(password);
			hostCntry.clear();
			hostCntry.sendKeys(hostCountry);
			emlID.clear();
			emlID.sendKeys(emailId);
			createAccount.click();
			
			//After successful registration, it goes to the log in page
			loginPage.loginAs(emailId)
			 .withPassword(password)
			 .login();
		}
		else
			return;
		
	}

	/*
	 * Validates Registration
	 * @return true if user is at the welcome page after registration else false
	 */
	public static boolean hasRegistered() 
	{	
		URL = driver.Instance.getCurrentUrl();
		WebElement title = driver.Instance.findElement(constants.welcomeTtile);
		
		if(title.getText().contains(constants.pageTitleWelcome) && URL.contains(constants.baseURL+"welcome.html"))
			return true;
		else
			return false;
	}

}
