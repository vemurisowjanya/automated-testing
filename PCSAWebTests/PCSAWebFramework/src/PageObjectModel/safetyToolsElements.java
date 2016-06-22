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
}
