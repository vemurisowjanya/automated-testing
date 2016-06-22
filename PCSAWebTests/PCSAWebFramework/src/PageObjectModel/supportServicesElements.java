/*
 * @author Anjali
 * @since 2016-06-22
 * This class maintains page elements for the Support Services Features.
 */
package PageObjectModel;
import org.openqa.selenium.WebElement;
import WebDriver.driver;

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
	
	/*
	 * @return 'Available Services After a Sexual Assault' Tab on the Side in Menu bar
	 */
	public static WebElement availableServicesAfterASexualAssaultTab()
	{
		element = driver.Instance.findElement(constants.availableServicesAfterASexualAssaultTab);
		return element;
	}
	
	/*
	 * @return 'Peace Corps' Commitment to Victims of Sexual Assault' Tab on the Side in Menu bar
	 */
	public static WebElement commitmentToVictimsOfSexualAssaultTab()
	{
		element = driver.Instance.findElement(constants.commitmentToVictimsOfSexualAssaultTab);
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
	 * @return 'Peace Corps Mythbusters:Assumptions and Facts' Tab on the Side in Menu bar
	 */
	public static WebElement mythbustersAssumptionsandFactsTab()
	{
		element = driver.Instance.findElement(constants.mythbustersAssumptionsandFactsTab);
		return element;
	}
}
