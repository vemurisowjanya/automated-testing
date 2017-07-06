/*
 * @author Anjali
 * @since 2016-06-22
 * This class maintains page elements for the Safety Tools Features.
 */
package PageObjectModel;
import org.openqa.selenium.WebElement;
import WebDriver.driver;

import java.util.List;

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
	 * @return 'Safety Plan Worksheet' title page of "Safety Tools"
	 */
	public static WebElement safetyPlanWorksheetTitle()
	{
		element = driver.Instance.findElement(constants.safetyPlanWorksheetTitle);
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

	/*
	* @return radar mutli ui cards for RADAR
	* */
	public static List<WebElement> radarUiCards(){
		List<WebElement> webElementList = driver.Instance.findElements(constants.radarUiCards);
		return webElementList;
	}

	/*
	* @return coping with Unwanted attentions strategies mutli ui cards for coping with unwanted attention
	* */
	public static List<WebElement> copingWithUnwantedAttentionUiCards(){
		List<WebElement> webElementList = driver.Instance.findElements(constants.copingWithUnwantedAttentionUiCards);
		return webElementList;
	}

	/*
	* @return commonalities of sexual predators multi ui cards for coping with unwanted attention
	* */
	public static List<WebElement> commonalitiesOfSexualPredatorsUiCards(){
		List<WebElement> WebElementList = driver.Instance.findElements(constants.commonalitiesofSexualPredatorsUiCards);
		return WebElementList;
	}

	/*
	* @return list of bystander of Intervention multi ui cards
	* */
	public static List<WebElement> bystanderInterventionUiCards(){
		List<WebElement> WebElementList = driver.Instance.findElements(constants.bystanderInterventionUiCards);
		return WebElementList;
	}

	/*
	* @return list of Safety plan basics multi ui cards
	* */
	public static List<WebElement> safetyPlanBasicsUiCards(){
		List<WebElement> WebElementList = driver.Instance.findElements(constants.safetyPlanBasicsUiCards);
		return WebElementList;
	}

	/*
	* @return list of Safety plan worksheet multi ui cards
	* */
	public static List<WebElement> safetyPlanWorksheetUiCards(){
		List<WebElement> WebElementList = driver.Instance.findElements(constants.safetyPlanWorksheetUiCards);
		return WebElementList;
	}

	/*
	* @return right navigation button
	* */
	public static WebElement rightNavButton(){
		element = driver.Instance.findElement(constants.rightNavButton);
		return element;
	}

	/*
	* @return left navigation button
	* */
	public static WebElement leftNavButton(){
		element = driver.Instance.findElement(constants.leftNavButton);
		return element;
	}
	
}
