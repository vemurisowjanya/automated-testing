/*
 * @author Anjali
 * @since 2016-07-24
 * This class maintains validation steps carried out for Circle of Trust Feature.
 */
package CircleOfTrustFeatures;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import LoginAndRegistration.existingUserLogin;
import PageObjectModel.circleOfTrustPageElements;
import PageObjectModel.constants;
import PageObjectModel.sideInMenuBarElements;
import WebDriver.driver;

public class circleOfTrust 
{

	/*
	 * This method navigates to Circle of Trust
	 */
	public static void gotoCOT() 
	{
		existingUserLogin.login();
		WebElement circleOfTrustTab = sideInMenuBarElements.circleOfTrustTab();
		circleOfTrustTab.click();
	}

	/*
	 * @return true if the user is at Circle of Trust
	 */
	private static boolean isAtCircleOfTrust()
	{
		WebElement pageTitle = circleOfTrustPageElements.circleOfTrustTitle();
		
		if(pageTitle.getText().contains("") && driver.Instance.getCurrentUrl().contains(constants.baseURL+"circleOfTrust.php"))
		{
			return true;
		}
		return false;
	}
	
	/*
	 * return true if the user is on Edit Comrade page.
	 */
	public static boolean isAtEditComrade() 
	{
		if(isAtCircleOfTrust())
		{
			WebElement circleOfTrustEditButton = circleOfTrustPageElements.circleOfTrustEditButton();
			circleOfTrustEditButton.click();
			if(driver.Instance.getCurrentUrl().contains(constants.baseURL+"editComrades.php"))
			{
				return true;
			}
			
			else
			{
				return false;
			}
		}
		return false;
	}

	/*
	 * @return true if the first message is sent successfully
	 */
	public static boolean canSendMsg1() 
	{
		if(isAtCircleOfTrust())
		{
			WebElement circleOfTrusHelpMeButton = circleOfTrustPageElements.circleOfTrusHelpMeButton();
			circleOfTrusHelpMeButton.click();
			WebElement msg1_Button = circleOfTrustPageElements.msg1_Button();
			msg1_Button.click();
			
			try
			{
				WebElement okButton = driver.Instance.findElement(constants.alertButton);
				okButton.click();
				System.out.println("inside try1");
				return true;
			}
			catch(NoSuchElementException e)
			{
				return false;
			}
		}
		return false;
	}

	/*
	 * @return true if the second message is sent successfully
	 */
	public static boolean canSendMsg2() 
	{
		if(isAtCircleOfTrust())
		{
			WebElement circleOfTrusHelpMeButton = circleOfTrustPageElements.circleOfTrusHelpMeButton();
			circleOfTrusHelpMeButton.click();
			WebElement msg2_Button = circleOfTrustPageElements.msg2_Button();
			msg2_Button.click();
			
			try
			{
				WebElement okButton = driver.Instance.findElement(constants.alertButton);
				okButton.click();
				System.out.println("inside try2");
				return true;
			}
			catch(NoSuchElementException e)
			{
				return false;
			}
		}
		return false;
	}

	/*
	 * @return true if the third message is sent successfully
	 */
	public static boolean canSendMsg3() 
	{
		if(isAtCircleOfTrust())
		{
			WebElement circleOfTrusHelpMeButton = circleOfTrustPageElements.circleOfTrusHelpMeButton();
			circleOfTrusHelpMeButton.click();
			WebElement msg3_Button = circleOfTrustPageElements.msg3_Button();
			msg3_Button.click();
			
			try
			{
				WebElement okButton = driver.Instance.findElement(constants.alertButton);
				okButton.click();
				System.out.println("inside try3");
				return true;
			}
			catch(NoSuchElementException e)
			{
				return false;
			}
		}
		return false;
	}


	

}
