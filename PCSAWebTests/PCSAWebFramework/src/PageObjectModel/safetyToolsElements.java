/*
 * @author Anjali
 * @since 2016-06-22
 * This class maintains page elements for the Safety Tools Features.
 */
package PageObjectModel;
import org.openqa.selenium.WebElement;
import WebDriver.driver;

public class safetyToolsElements
{
	public static WebElement element = null;
	
	/*
	 * @return 'Safety Tools Main' Tab on the Side in Menu bar
	 */
	public static WebElement safetyToolsMainTab()
	{
		element = driver.Instance.findElement(constants.safetyToolsMainTab);
		return element;
	}
	
	/*
	 * @return 'Personal Security Strategies' Tab on the Side in Menu bar
	 */
	public static WebElement personalSecurityStrategiesTab()
	{
		element = driver.Instance.findElement(constants.personalSecurityStrategiesTab);
		return element;
	}
	
	/*
	 * @return 'RADAR' Tab on the Side in Menu bar
	 */
	public static WebElement radarTab()
	{
		element = driver.Instance.findElement(constants.radarTab);
		return element;
	}
	
	/*
	 * @return 'Coping with unwanted attention' Tab on the Side in Menu bar
	 */
	public static WebElement copingwithUnwantedAttentionTab()
	{
		element = driver.Instance.findElement(constants.copingwithUnwantedAttentionTab);
		return element;
	}
	
	/*
	 * @return 'Commonalities of Sexual Predators' Tab on the Side in Menu bar
	 */
	public static WebElement commonalitiesofSexualPredatorsTab()
	{
		element = driver.Instance.findElement(constants.commonalitiesofSexualPredatorsTab);
		return element;
	}
	
	/*
	 * @return 'Bystander Intervention' Tab on the Side in Menu bar
	 */
	public static WebElement bystanderInterventionTab()
	{
		element = driver.Instance.findElement(constants.bystanderInterventionTab);
		return element;
	}
	
	/*
	 * @return 'Safety Plan Basics' Tab on the Side in Menu bar
	 */
	public static WebElement safetyPlanBasicsTab()
	{
		element = driver.Instance.findElement(constants.safetyPlanBasicsTab);
		return element;
	}
	
	/*
	 * @return 'Safety Plan Worksheet' Tab on the Side in Menu bar
	 */
	public static WebElement safetyPlanWorksheetTab()
	{
		element = driver.Instance.findElement(constants.safetyPlanWorksheetTab);
		return element;
	}
	
	/*
	 * @return 'Personal Security Strategies' Button on the first page of "Safety Tools"
	 */
	public static WebElement personalSecurityStrategiesButton()
	{
		element = driver.Instance.findElement(constants.personalSecurityStrategiesButton);
		return element;
	}
	
	/*
	 * @return 'RADAR' Button on the first page of "Safety Tools"
	 */
	public static WebElement radarButton()
	{
		element = driver.Instance.findElement(constants.radarButton);
		return element;
	}
	
	/*
	 * @return 'Coping with unwanted attention' Button on the first page of "Safety Tools"
	 */
	public static WebElement copingwithUnwantedAttentionButton()
	{
		element = driver.Instance.findElement(constants.copingwithUnwantedAttentionButton);
		return element;
	}
	
	/*
	 * @return 'Commonalities of Sexual Predators' Button on the first page of "Safety Tools"
	 */
	public static WebElement commonalitiesofSexualPredatorsButton()
	{
		element = driver.Instance.findElement(constants.commonalitiesofSexualPredatorsButton);
		return element;
	}
	
	/*
	 * @return 'Bystander Intervention' Button on the second page of "Safety Tools"
	 */
	public static WebElement bystanderInterventionButton()
	{
		element = driver.Instance.findElement(constants.bystanderInterventionButton);
		return element;
	}
	
	/*
	 * @return 'Safety Plan Basics' Button on the second page of "Safety Tools"
	 */
	public static WebElement safetyPlanBasicsButton()
	{
		element = driver.Instance.findElement(constants.safetyPlanBasicsButton);
		return element;
	}
	
	/*
	 * @return 'Safety Plan Worksheet' Button on the second page of "Safety Tools"
	 */
	public static WebElement safetyPlanWorksheetButton()
	{
		element = driver.Instance.findElement(constants.safetyPlanWorksheetButton);
		return element;
	}
	
	/*
	 * @return Page title of the 'Safety Tools' 
	 */
	public static WebElement safetyToolsPageTitle()
	{
		element = driver.Instance.findElement(constants.safetyToolsPageTitle);
		return element;
	}
	
	
	/*
	 * @return Page title of the 'Personal Security Strategies' page
	 */
	public static WebElement personalSecurityStrategiesTitle()
	{
		element = driver.Instance.findElement(constants.personalSecurityStrategiesTitle);
		return element;
	}
	
	/*
	 * @return Page title of the 'RADAR' page
	 */
	public static WebElement radarTitle()
	{
		element = driver.Instance.findElement(constants.radarTitle);
		return element;
	}
	
	/*
	 * @return Page title of the 'Coping With Unwanted Attention Strategies' page
	 */
	public static WebElement copingwithUnwantedAttentionTitle()
	{
		element = driver.Instance.findElement(constants.copingwithUnwantedAttentionTitle);
		return element;
	}
	
	/*
	 * @return Page title of the 'Commonalities Of Sexual Predators' page
	 */
	public static WebElement commonalitiesofSexualPredatorsTitle()
	{
		element = driver.Instance.findElement(constants.commonalitiesofSexualPredatorsTitle);
		return element;
	}
	
	/*
	 * @return Page title of the 'Bystander Intervention' page
	 */
	public static WebElement bystanderInterventionTitle()
	{
		element = driver.Instance.findElement(constants.bystanderInterventionTitle);
		return element;
	}
	
	/*
	 * @return Page title of the 'Safety Plan Basics' page
	 */
	public static WebElement safetyPlanBasicsTitle()
	{
		element = driver.Instance.findElement(constants.safetyPlanBasicsTitle);
		return element;
	}
	
	
}
