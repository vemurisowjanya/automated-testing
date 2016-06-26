/*
 * @author Anjali
 * @since 2016-06-16
 * This class maintains page elements on the Side In Menu Bar.
 */
package PageObjectModel;
import org.openqa.selenium.WebElement;
import WebDriver.driver;

public class sideInMenuBarElements 
{
	private static WebElement element = null;
	
	/*
	 * @return First Aide Tab on the side In Menu
	 */
	public static WebElement firstAideTab()
	{
		element = driver.Instance.findElement(constants.firstAideTab);
		return element;
	}
	
	/*
	 * @return Get Help Now Tab on the side In Menu
	 */
	public static WebElement getHelpNowTab()
	{
		element = driver.Instance.findElement(constants.getHelpNowTab);
		return element;
	}
	
	/*
	 * @return Circle of Trust Tab on the side In Menu
	 */
	public static WebElement circleOfTrustTab()
	{
		element = driver.Instance.findElement(constants.circleOfTrustTab);
		return element;
	}
	
	/*
	 * @return Safety Tools Tab on the side In Menu
	 */
	public static WebElement safetyToolsTab()
	{
		element = driver.Instance.findElement(constants.safetyToolsTab);
		return element;
	}
	
	/*
	 * @return Support Services Tab on the side In Menu
	 */
	public static WebElement supportServicesTab()
	{
		element = driver.Instance.findElement(constants.supportServicesTab);
		return element;
	}
	
	/*
	 * @return Sexual Assault Awareness Tab on the side In Menu
	 */
	public static WebElement sexualAssaultAwarenesstTab()
	{
		element = driver.Instance.findElement(constants.sexualAssaultAwarenesstTab);
		return element;
	}
	
	/*
	 * @return Policies and Glossary  Tab on the side In Menu
	 */
	public static WebElement policiesAndGlossaryTab()
	{
		element = driver.Instance.findElement(constants.policiesAndGlossaryTab);
		return element;
	}
	
	/*
	 * @return Settings Tab on the side In Menu
	 */
	public static WebElement settingsTab()
	{
		element = driver.Instance.findElement(constants.settingsTab);
		return element;
	}
	
	/*
	 * @return Logged In As Tab on the side In Menu
	 */
	public static WebElement loggedInAsTab()
	{
		element = driver.Instance.findElement(constants.loggedInAsTab);
		return element;
	}
}
