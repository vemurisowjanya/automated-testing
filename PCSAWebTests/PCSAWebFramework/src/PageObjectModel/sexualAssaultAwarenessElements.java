/*
 * @author Anjali
 * @since 2016-06-22
 * This class maintains page elements for the Sexual Assault Awareness Features.
 */
package PageObjectModel;
import org.openqa.selenium.WebElement;

import WebDriver.driver;

import java.util.List;

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
	 * @return 'Was it Sexual Assault' Tab on the Side in Menu bar --------------------------------
	 */
	public static WebElement wasItSexualAssaultTab()
	{
		element = driver.Instance.findElement(constants.wasItSexualAssaultTab);
		return element;
	}

	//@return 'Was it Sexual Assault' title
	public static WebElement wasItSexualAssaultTitle()
	{
		element = driver.Instance.findElement(constants.wasItSexualAssaultTitle);
		return element;
	}

	//@return 'Was it Sexual Assault' Know more button
	public static WebElement wasItSexualAssaultKnowMoreButton()
	{
		element = driver.Instance.findElement(constants.wasItSexualAssaultKnowMoreButton);
		return element;
	}

	//@return 'Was it Sexual Assault' Ui cards
	public static List<WebElement> wasItSexualAssaultUiCards()
	{
		List<WebElement> WebElementList = driver.Instance.findElements(constants.wasItSexualAssaultUiCards);
		return WebElementList;
	}

	/*
	 * @return 'Sexual Assault Common Questions' Tab on the Side in Menu bar ----------------------------
	 */
	public static WebElement sexualAssaultCommonQuestionsTab()
	{
		element = driver.Instance.findElement(constants.sexualAssaultCommonQuestionsTab);
		return element;
	}

	//@return 'Sexual Assault Common Questions' title
	public static WebElement sexualAssaultCommonQuestionsTitle()
	{
		element = driver.Instance.findElement(constants.sexualAssaultCommonQuestionsTitle);
		return element;
	}

	//@return 'Sexual Assault Common Questions' Ui cards
	public static List<WebElement> sexualAssaultCommonQuestionsUiCards()
	{
		List<WebElement> WebElementList = driver.Instance.findElements(constants.sexualAssaultCommonQuestionsUiCards);
		return WebElementList;
	}


	
	/*
	 * @return 'Impact of Sexual Assault' Tab on the Side in Menu bar ---------------------------------
	 */
	public static WebElement impactOfSexualAssaultTab()
	{
		element = driver.Instance.findElement(constants.impactOfSexualAssaultTab);
		return element;
	}

	//@return 'Impact of Sexual Assault' title
	public static WebElement impactOfSexualAssaultTitle()
	{
		element = driver.Instance.findElement(constants.impactOfSexualAssaultTitle);
		return element;
	}

	//@return 'Impact of Sexual Assault' Ui cards
	public static List<WebElement> impactOfSexualAssaultUiCards()
	{
		List<WebElement> WebElementList = driver.Instance.findElements(constants.impactOfSexualAssaultUiCards);
		return WebElementList;
	}
	
	/*
	 * @return 'Sexual Harassment' Tab on the Side in Menu bar ----------------------------
	 */
	public static WebElement sexualHarassmentTab()
	{
		element = driver.Instance.findElement(constants.sexualHarassmentTab);
		return element;
	}

	//@return 'Sexual Harassment' title
	public static WebElement sexualHarassmentTitle()
	{
		element = driver.Instance.findElement(constants.sexualHarassmentTitle);
		return element;
	}

	//@return 'Sexual Harassment' Ui cards
	public  static WebElement sexualHarassmentUiCards()
	{
		element = driver.Instance.findElement(constants.sexualHarassmentUiCards);
		return element;
	}

	
	/*
	 * @return 'Helping a Friend or Community Member' Tab on the Side in Menu bar ----------------------
	 */
	public static WebElement helpingAFriendOrCommunityMemberTab()
	{
		element = driver.Instance.findElement(constants.helpingAFriendOrCommunityMemberTab);
		return element;
	}

	//@return 'Helping a Friend or Community Member' title
	public static WebElement helpingAFriendOrCommunityMemberTitle()
	{
		element = driver.Instance.findElement(constants.helpingAFriendOrCommunityMemberTitle);
		return element;
	}

	//@return 'Impact of Sexual Assault' Ui cards
	public static List<WebElement> helpingAFriendOrCommunityMemberUiCards()
	{
		List<WebElement> WebElementList = driver.Instance.findElements(constants.helpingAFriendOrCommunityMemberUiCards);
		return WebElementList;
	}



	/*
	*  @return Right and Left Page Navigation Buttons
	* */
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
