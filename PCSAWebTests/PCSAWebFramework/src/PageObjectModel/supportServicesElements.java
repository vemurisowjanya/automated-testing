/*
 * @author Anjali
 * @since 2016-06-22
 * This class maintains page elements for the Support Services Features.
 */
package PageObjectModel;
import org.openqa.selenium.WebElement;
import WebDriver.driver;

import java.util.List;

public class supportServicesElements
{
	public static WebElement element = null;
	
	/*
	 * @return 'Support Services Main' Tab on the Side in Menu bar
	 */
	public static WebElement supportServicesMainTab()
	{
		element = driver.Instance.findElement(constants.supportServicesMainTab);
		return element;
	}
	
	/*
	 * @return 'Benefits of seeking Staff Support Tab' on the Side in Menu bar
	 */
	public static WebElement benefitsofSeekingStaffSupportTab()
	{
		element = driver.Instance.findElement(constants.benefitsofSeekingStaffSupportTab);
		return element;
	}

	//@return 'Benefits of seeking Staff Support Tab' title
	public static WebElement benefitsofSeekingStaffSupportTitle()
	{
		element = driver.Instance.findElement(constants.benefitsofSeekingStaffSupportTitle);
		return element;
	}

	//@return 'Benefits of seeking Staff Support Tab' UI cards
	public static WebElement benefitsofSeekingStaffSupportUiCards()
	{
		element = driver.Instance.findElement(constants.benefitsofSeekingStaffSupportUiCards);
		return element;
	}
	
	/*
	 * @return 'Available Services After a Sexual Assault' Tab on the Side in Menu bar
	 */
	public static WebElement availableServicesAfterASexualAssaultTab()
	{
		element = driver.Instance.findElement(constants.availableServicesAfterASexualAssaultTab);
		return element;
	}

	//@return 'Available Services After a Sexual Assault' title
	public static WebElement availableServicesAfterASexualAssaultTitle()
	{
		element = driver.Instance.findElement(constants.availableServicesAfterASexualAssaultTitle);
		return element;
	}

	//@return 'Available Services After a Sexual Assault' Ui Cards
	public static List<WebElement> availableServicesAfterASexualAssaultUiCards()
	{
		List<WebElement> WebElementList = driver.Instance.findElements(constants.availableServicesAfterASexualAssaultUiCards);
		return WebElementList;
	}

	
	/*
	 * @return 'Peace Corps' Commitment to Victims of Sexual Assault' Tab on the Side in Menu bar
	 */
	public static WebElement commitmentToVictimsOfSexualAssaultTab()
	{
		element = driver.Instance.findElement(constants.commitmentToVictimsOfSexualAssaultTab);
		return element;
	}

	//@return 'Peace Corps' Commitment to Victims of Sexual Assault' title
	public static WebElement commitmentToVictimsOfSexualAssaultTitle()
	{
		element = driver.Instance.findElement(constants.commitmentToVictimsOfSexualAssaultTitle);
		return element;
	}

	//@return 'Peace Corps' Commitment to Victims of Sexual Assault' Ui cards
	public static WebElement commitmentToVictimsOfSexualAssaultUiCards()
	{
		element = driver.Instance.findElement(constants.commitmentToVictimsOfSexualAssaultUiCards);
		return element;
	}
	
	/*
	 * @return 'What to do After an Assault' Tab on the Side in Menu bar
	 */
	public static WebElement whatToDoAfterAnAssaultTab()
	{
		element = driver.Instance.findElement(constants.whatToDoAfterAnAssaultTab);
		return element;
	}

	/*
	 * @return 'Confidentiality' Tab on the Side in Menu bar
	 */
	public static WebElement confidentialityTab()
	{
		element = driver.Instance.findElement(constants.confidentialityTab);
		return element;
	}

	// @return 'Confidentiality' Title
	public static WebElement confidentialityTitle()
	{
		element = driver.Instance.findElement(constants.confidentialityTitle);
		return element;
	}

	// @return 'Confidentiality' Ui cards
	public static WebElement confidentialityUiCards()
	{
		element = driver.Instance.findElement(constants.confidentialityUiCards);
		return element;
	}

	/*
	 * @return 'Peace Corps Mythbusters:Assumptions and Facts' Tab on the Side in Menu bar
	 */
	public static WebElement peaceCorpsMythbustersTab()
	{
		element = driver.Instance.findElement(constants.peaceCorpsMythbustersTab);
		return element;
	}

	//@return 'Peace Corps Mythbusters:Assumptions and Facts' Title
	public static WebElement peaceCorpsMythbustersTitle()
	{
		element = driver.Instance.findElement(constants.peaceCorpsMythbustersTitle);
		return element;
	}

	//@return 'Peace Corps Mythbusters:Assumptions and Facts' UI cards
	public static List<WebElement> peaceCorpsMythbustersUiCards()
	{
		List<WebElement> WebElementList = driver.Instance.findElements(constants.peaceCorpsMythbustersUiCards);
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
