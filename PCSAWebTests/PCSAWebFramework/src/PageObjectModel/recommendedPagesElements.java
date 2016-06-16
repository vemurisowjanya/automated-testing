/*
 * @author Anjali
 * @since 2016-06-09
 * This class maintains page elements for Recommended Pages.
 */
package PageObjectModel;
import org.openqa.selenium.WebElement;
import WebDriver.driver;


public class recommendedPagesElements 
{
	private static WebElement element = null;
	
	/*
	 * @return Title of the recommended pages
	 */
	public static WebElement recommendedPageTitle()
	{
		element = driver.Instance.findElement(constants.recommendedPagesTitle);
		return element;
	}
	
	/*
	 * @return Safety Strategies Helpline button from the recommended pages.
	 */
	public static WebElement safetyStrategyButton()
	{
		element = driver.Instance.findElement(constants.safetyStrategyButton);
		return element;
	}
	
	/*
	 * @return Helping a Friend or Community Member button from the recommended pages.
	 */
	public static WebElement helpButton()
	{
		element = driver.Instance.findElement(constants.helpButton);
		return element;
	}
	
	/*
	 * @return Things to know before you Travel to Ghana button from the recommended pages.
	 */
	public static WebElement thingsToKnowButton()
	{
		element = driver.Instance.findElement(constants.thingsToKnowButton);
		return element;
	}
	
	/*
	 * @return Set your peer counseling preferences from the recommended pages.
	 */
	public static WebElement setPreferences()
	{
		element = driver.Instance.findElement(constants.setPreferences);
		return element;
	}
}
