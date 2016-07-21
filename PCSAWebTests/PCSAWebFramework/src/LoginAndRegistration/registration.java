/*
 * @author Anjali
 * @since 2016-06-13
 * This class navigates to the registration page and validates against user registration in the application.
 */

package LoginAndRegistration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Logs.log4j;
import PageObjectModel.constants;
import PageObjectModel.logoutPageElements;
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
	
	public static String checkForAlert()
	{
		Alert simpleAlert = driver.Instance.switchTo().alert();
		String alertText = simpleAlert.getText();
		simpleAlert.accept();
		return alertText;
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
			//System.out.println("reaching here");
			if(driver.Instance.findElements(constants.alertButton).size()!=0)
			{
				try
				{
					//accept button
					driver.Instance.findElement(constants.alertButton).click();
					//driver.Instance.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					WebDriverWait wait = new WebDriverWait(driver.Instance, 10);
					wait.until(ExpectedConditions.urlContains(constants.baseURL+"login.php"));
					//driver.Instance.get(constants.baseURL+"login.php");
					//After successful registration, it goes to the log in page
					loginPage.loginAs(emailId)
					 .withPassword(password)
					 .login();
				}
				catch(Exception e)
				{
					e.printStackTrace();
					return;
				}
			}
			
			else
			{
				return;
			}
			
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
		System.out.println("inside hasRegistered");
		System.out.println(driver.Instance.getCurrentUrl());
		
		if(driver.Instance.getCurrentUrl().contains(constants.baseURL+"progressBar.php"))
		{
			System.out.println("inside progressBar");
			//wait for the page to load until it finds the logout button
			WebDriverWait wait = new WebDriverWait(driver.Instance, 20);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(logoutPageElements.logoutButton()));
		}
		
	
		URL = driver.Instance.getCurrentUrl();
		System.out.println(URL);
	
		
		if(URL.contains(constants.baseURL+"welcome.php") && driver.Instance.findElement(constants.welcomeTtile).getText().contains(constants.pageTitleWelcome)  )
			return true;
		else
			return false;
	}

}
