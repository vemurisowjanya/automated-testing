/*
 * @author Anjali
 * @since 2016-06-22
 * This class maintains validation steps carried out for Get Help Now Feature.
 */
package GetHelpNowFeatures;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import LoginAndRegistration.existingUserLogin;
import Logs.log4j;
import PageObjectModel.constants;
import PageObjectModel.getHelpNowPageElements;
import PageObjectModel.sideInMenuBarElements;
import WebDriver.driver;

public class getHelpNow 
{
	private static String URL;
	public static void gotoGetHelp()
	{
		existingUserLogin.login();
		WebElement getHelpTab = sideInMenuBarElements.getHelpNowTab();
		getHelpTab.click();
	}

	/*
	 * Checks if the user is at Get Help Now
	 */
	public static boolean isAtGetHelpNow() 
	{
		URL = driver.Instance.getCurrentUrl();
		WebElement gethelpPageTitle = getHelpNowPageElements.gethelpPageTitle();
		if(URL.contains(constants.baseURL+"getHelpNow.html")&& gethelpPageTitle.getText().contains(constants.getHelpTitle))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	/*
	 * Checks if the user is able to select the country from the dropdown
	 */
	public static boolean canSelectCountry() 
	{
		WebElement changeLocationDropdown = getHelpNowPageElements.changeLocationDropdown();
		WebElement chooseLocationText = getHelpNowPageElements.chooseLocationText();
		String countryArr[] = {"Syria","Uganda","Tunisia"};
		Select country = new Select(changeLocationDropdown);
		//get all the option from the dropdown
		List<WebElement> optionCount = country.getOptions();
		String s="";
		
		if(isAtGetHelpNow())
		{
			//iterate through all the option
			for(int i= 0;i<optionCount.size();i++)
			{
				country.selectByIndex(i);
				s = optionCount.get(i).getText();
				if(!(s.equals(countryArr[i]))||!(chooseLocationText.getText().contains(optionCount.get(i).getText())))
				{
					System.out.println("inside");
					return false;
				}
				System.out.println(s);
				System.out.println(chooseLocationText.getText());
			}
			
			return true;
		}
		
		return false;
		
	}

	public static boolean canCallPCMO()
	{
		if(isAtGetHelpNow())
		{
			WebElement contactPCMO = getHelpNowPageElements.contactPCMO();
			contactPCMO.click();
			WebElement pcmoCallButton = getHelpNowPageElements.pcmoCallButton();
			pcmoCallButton.click();
			
			//Switch for alert pop up for Voice Call
			Alert simpleAlert = driver.Instance.switchTo().alert();
			String alertText = simpleAlert.getText();
			simpleAlert.accept();
			System.out.println("Alert text is " + alertText);
			System.out.println("URL " + driver.Instance.getCurrentUrl());
			if(alertText.contains("Call started")&&driver.Instance.getCurrentUrl().contains(constants.baseURL+"twilioCall.php?phone="))
			{
				return true;
			}
			
		}
			return false;
	}

	public static boolean canMessagePCMO()
	{
		if(isAtGetHelpNow())
		{
			WebElement contactPCMO = getHelpNowPageElements.contactPCMO();
			contactPCMO.click();
			WebElement pcmoSMSButton = getHelpNowPageElements.pcmoSMSButton();
			pcmoSMSButton.click();
			WebElement smsBodyTextBox = getHelpNowPageElements.smsBodyTextBox();
			smsBodyTextBox.sendKeys("Test");
			WebElement sendSMSButton = getHelpNowPageElements.sendSMSButton();
			sendSMSButton.click();
			
			//Switch for alert pop up for SMS
			Alert simpleAlert = driver.Instance.switchTo().alert();
			String alertText = simpleAlert.getText();
			simpleAlert.accept();
			System.out.println("Alert text is " + alertText);
			System.out.println("URL " + driver.Instance.getCurrentUrl());
			if(alertText.contains("SMS Sent Successfully")&&driver.Instance.getCurrentUrl().contains(constants.baseURL+"twilioSMS.php?phone="))
			{
				return true;
			}
		}
		return false;
	}

	public static boolean canCallSSM()
	{
		if(isAtGetHelpNow())
		{
			WebElement contactSSM = getHelpNowPageElements.contactSSM();
			contactSSM.click();
			WebElement ssmCallButton = getHelpNowPageElements.ssmCallButton();
			ssmCallButton.click();
			
			//Switch for alert pop up for Voice Call
			Alert simpleAlert = driver.Instance.switchTo().alert();
			String alertText = simpleAlert.getText();
			simpleAlert.accept();
			System.out.println("Alert text is " + alertText);
			System.out.println("URL " + driver.Instance.getCurrentUrl());
			if(alertText.contains("Call started")&&driver.Instance.getCurrentUrl().contains(constants.baseURL+"twilioCall.php?phone="))
			{
				return true;
			}
			
		}
			return false;
	}

	public static boolean canCallSarl()
	{
		if(isAtGetHelpNow())
		{
			WebElement contactSARL = getHelpNowPageElements.contactSARL();
			contactSARL.click();
			WebElement sarlCallButton = getHelpNowPageElements.sarlCallButton();
			sarlCallButton.click();
			
			//Switch for alert pop up for Voice Call
			Alert simpleAlert = driver.Instance.switchTo().alert();
			String alertText = simpleAlert.getText();
			simpleAlert.accept();
			System.out.println("Alert text is " + alertText);
			System.out.println("URL " + driver.Instance.getCurrentUrl());
			if(alertText.contains("Call started")&&driver.Instance.getCurrentUrl().contains(constants.baseURL+"twilioCall.php?phone="))
			{
				return true;
			}
			
		}
			return false;
	}

	public static boolean canMessageSARL() 
	{
		if(isAtGetHelpNow())
		{
			WebElement contactSARL = getHelpNowPageElements.contactSARL();
			contactSARL.click();
			WebElement sarlSMSButton = getHelpNowPageElements.sarlSMSButton();
			sarlSMSButton.click();
			WebElement smsBodyTextBox = getHelpNowPageElements.smsBodyTextBox();
			smsBodyTextBox.sendKeys("Test");
			WebElement sendSMSButton = getHelpNowPageElements.sendSMSButton();
			sendSMSButton.click();
			
			//Switch for alert pop up for SMS
			Alert simpleAlert = driver.Instance.switchTo().alert();
			String alertText = simpleAlert.getText();
			simpleAlert.accept();
			System.out.println("Alert text is " + alertText);
			System.out.println("URL " + driver.Instance.getCurrentUrl());
			if(alertText.contains("SMS Sent Successfully")&&driver.Instance.getCurrentUrl().contains(constants.baseURL+"twilioSMS.php?phone="))
			{
				return true;
			}
		}
		return false;
	}

	public static boolean canMessageSSM() 
	{
		if(isAtGetHelpNow())
		{
			WebElement contactSSM = getHelpNowPageElements.contactSSM();
			contactSSM.click();
			WebElement ssmSMSButton = getHelpNowPageElements.ssmSMSButton();
			ssmSMSButton.click();
			WebElement smsBodyTextBox = getHelpNowPageElements.smsBodyTextBox();
			smsBodyTextBox.sendKeys("Test");
			WebElement sendSMSButton = getHelpNowPageElements.sendSMSButton();
			sendSMSButton.click();
			
			//Switch for alert pop up for SMS
			Alert simpleAlert = driver.Instance.switchTo().alert();
			String alertText = simpleAlert.getText();
			simpleAlert.accept();
			System.out.println("Alert text is " + alertText);
			System.out.println("URL " + driver.Instance.getCurrentUrl());
			if(alertText.contains("SMS Sent Successfully")&&driver.Instance.getCurrentUrl().contains(constants.baseURL+"twilioSMS.php?phone="))
			{
				return true;
			}
		}
		return false;
	}
}
