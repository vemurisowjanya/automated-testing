package SideInMenuBarFeatures;

import LoginAndRegistration.existingUserLogin;
import PageObjectModel.constants;
import PageObjectModel.safetyToolsElements;
import PageObjectModel.sideInMenuBarElements;
import WebDriver.driver;
import org.openqa.selenium.WebElement;

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
	public static boolean canGotoRadar()
	{
		sideInMenuBarElements.safetyToolsTab().click();

		WebElement radarTitle = safetyToolsElements.radarTitle();

		if(radarTitle.getText().contains("RADAR") && driver.Instance.getCurrentUrl().contains("radar"))
		{
			return true;
		}
		return true;
	}

	/*
	 * @return true if the navigation to "RADAR" is successful.
	 */
	public static boolean canGotoUnwantedAttention()
	{
		sideInMenuBarElements.safetyToolsTab().click();

		WebElement copingwithUnwantedAttentionTitle = safetyToolsElements.copingwithUnwantedAttentionTitle();

		if(copingwithUnwantedAttentionTitle.getText().contains("Coping With Unwanted Attention Strategies") && driver.Instance.getCurrentUrl().contains("unwanted-attention"))
		{
			return true;
		}
		else
			return false;
	}

	/*
	 * @return true if the navigation to "RADAR" is successful.
	 */
	public static boolean canGotoCommonalitiesOfSexualPredators()
	{
		sideInMenuBarElements.safetyToolsTab().click();

		WebElement commonalitiesOfSexualPredatorsTitle = safetyToolsElements.commonalitiesofSexualPredatorsTitle();

		if(commonalitiesOfSexualPredatorsTitle.getText().contains("Commonalities Of Sexual Predators") && driver.Instance.getCurrentUrl().contains("sexual-predators"))
		{
			return true;
		}
		else
			return false;
	}

	/*
	* @return true if the navigation to "Bystander Intervention" is successful
	* */
	public static boolean canGoToBystanderIntervention()
	{
		sideInMenuBarElements.safetyToolsTab().click();

		WebElement bystanderInterventionTitle = safetyToolsElements.bystanderInterventionTitle();

		if(bystanderInterventionTitle.getText().contains("Bystander Intervention") && driver.Instance.getCurrentUrl().contains("bystander-intervention")){
			return true;
		}
		else
			return false;
	}

	/*
	* @return true if the navigation to "Bystander Intervention" is successful
	* */
	public static boolean canGoToSafetyPlanBasics()
	{
		sideInMenuBarElements.safetyToolsTab().click();
		WebElement safetyPlanBasicsTitle = safetyToolsElements.safetyPlanBasicsTitle();
		if(safetyPlanBasicsTitle.getText().contains("Safety Plan Basics") && driver.Instance.getCurrentUrl().contains("safety-plan-basics")){
			return true;
		}
		else
			return false;
	}

	/*
	* @return true if the navigation to "Safety Plan Worksheet" is successful
	* */
	public static boolean canGoToSafetyPlanWorksheet()
	{
		sideInMenuBarElements.safetyToolsTab().click();
		WebElement safetyPlanWorksheetTitle = safetyToolsElements.safetyPlanWorksheetTitle();
		if(safetyPlanWorksheetTitle.getText().contains("Safety Plan Worksheet") && driver.Instance.getCurrentUrl().contains("safety-plan-worksheet")){
			return true;
		}
		else
			return false;
	}

	
	
	

}
