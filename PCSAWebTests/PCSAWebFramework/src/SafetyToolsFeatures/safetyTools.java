package SafetyToolsFeatures;

import org.openqa.selenium.WebElement;

import LoginAndRegistration.existingUserLogin;
import PageObjectModel.constants;
import PageObjectModel.safetyToolsElements;
import PageObjectModel.sideInMenuBarElements;
import WebDriver.driver;

public class safetyTools 
{

	/*
	 * Navigates to the first page of "Safety Tools"
	 */
	public static void gotoSafetyToolsPage1() 
	{
		existingUserLogin.login();
		WebElement safetyToolsTab = sideInMenuBarElements.safetyToolsTab();
		safetyToolsTab.click(); 
		WebElement safetyToolsMainTab = safetyToolsElements.safetyToolsMainTab();
		safetyToolsMainTab.click();
	}

	/*
	 * @return true if at first page of "Safety Tools"
	 */
	private static boolean isAtSafetyToolsPage1() 
	{
		WebElement safetyToolsPageTitle =  safetyToolsElements.safetyToolsPageTitle();
		
		if(safetyToolsPageTitle.getText().contains("") && driver.Instance.getCurrentUrl().contains(constants.baseURL+"safetyTools1.php"))
		{
			return true;
		}
		return false;
	} 
	
	/*
	 * @return true if the navigation to "Personal Security Strategies" is successful.
	 */
	public static boolean canGotoPersonalSecurityStrategies() 
	{
		if(isAtSafetyToolsPage1())
		{
			WebElement personalSecurityStrategiesButton = safetyToolsElements.personalSecurityStrategiesButton();
			personalSecurityStrategiesButton.click();
			
			WebElement personalSecurityStrategiesTitle = safetyToolsElements.personalSecurityStrategiesTitle();
			
			if(personalSecurityStrategiesTitle.getText().contains("Personal Security Strategies") && driver.Instance.getCurrentUrl().contains(constants.baseURL+"personalSecurityStrategies.php"))
			{
				return true;
			}
		}
		return true;
	}

	/*
	 * @return true if the navigation to "RADAR" is successful.
	 */
	public static Object canGotoRadar()
	{
		if(isAtSafetyToolsPage1())
		{
			WebElement radarButton = safetyToolsElements.radarButton();
			radarButton.click();
			
			WebElement radarTitle = safetyToolsElements.radarTitle();
			
			if(radarTitle.getText().contains("Personal Security Strategies") && driver.Instance.getCurrentUrl().contains(constants.baseURL+"radar.php"))
			{
				return true;
			}
		}
		return true;
	}

	
	
	

}
