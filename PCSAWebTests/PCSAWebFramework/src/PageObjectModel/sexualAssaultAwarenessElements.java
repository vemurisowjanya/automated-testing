/*
 * @author Anjali
 * @since 2016-06-22
 * This class maintains page elements for the Sexual Assault Awareness Features.
 */
package PageObjectModel;
import org.openqa.selenium.WebElement;

import WebDriver.driver;

public class sexualAssaultAwarenessElements 
{
	public static WebElement element = null;
	
	/*
	 * @return 'Sexual Assault Main' Tab on the Side in Menu bar
	 */
	public static WebElement sexualAssaultMainTab()
	{
		element = driver.Instance.findElement(constants.sexualAssaultMainTab);
		return element;
	}
	
	/*
	 * @return 'Was it Sexual Assault' Tab on the Side in Menu bar
	 */
	public static WebElement wasItSexualAssaultTab()
	{
		element = driver.Instance.findElement(constants.wasItSexualAssaultTab);
		return element;
	}
	
	/*
	 * @return 'Sexual Assault Common Questions' Tab on the Side in Menu bar
	 */
	public static WebElement sexualAssaultCommonQuestionsTab()
	{
		element = driver.Instance.findElement(constants.sexualAssaultCommonQuestionsTab);
		return element;
	}
	
	/*
	 * @return 'Impact of Sexual Assault' Tab on the Side in Menu bar
	 */
	public static WebElement impactOfSexualAssaultTab()
	{
		element = driver.Instance.findElement(constants.impactOfSexualAssaultTab);
		return element;
	}
	
	/*
	 * @return 'Sexual Harassment' Tab on the Side in Menu bar
	 */
	public static WebElement sexualHarrasmentTab()
	{
		element = driver.Instance.findElement(constants.sexualHarrasmentTab);
		return element;
	}
	
	/*
	 * @return 'Helping a Friend or Community Member' Tab on the Side in Menu bar
	 */
	public static WebElement HelpingAFriendOrCommunityMemberTab()
	{
		element = driver.Instance.findElement(constants.HelpingAFriendOrCommunityMemberTab);
		return element;
	}
}
