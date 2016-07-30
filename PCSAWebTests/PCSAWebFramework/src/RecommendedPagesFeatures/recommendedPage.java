/*
 * @author Anjali
 * @since 2016-06-09
 * This class maintains validation steps carried out for Recommended Pages.
 */
package RecommendedPagesFeatures;

import org.openqa.selenium.WebElement;

import LoginAndRegistration.existingUserLogin;
import Logs.log4j;
import PageObjectModel.constants;
import PageObjectModel.recommendedPagesElements;
import WebDriver.driver;


public class recommendedPage 
{
	private static String url;
    //Navigates to Recommended Page
	public static void gotoRecommendedPage() 
	{
		// TODO Auto-generated method stub
		existingUserLogin.login();
		log4j.Log.info("Navigating to Recommended Pages");
		
		//driver.Instance.get(constants.baseURL+"welcome.php");
		log4j.Log.info("On Recommended Pages");
	}
	
	public static boolean isAtRecommendedPages()
	{
		url = driver.Instance.getCurrentUrl();
		if(url.contains(constants.baseURL+"welcome.php"))
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

	/*
	 * Verifies whether the user is able to navigate to the 'Safety Strategies Helpline' on the recommended page.
	 */
	public static boolean isAtSafetyStrategiesHelpline()
	{
		// TODO Auto-generated method stub
		url = driver.Instance.getCurrentUrl();
		WebElement title = recommendedPagesElements.recommendedPageTitle();
		log4j.Log.info("The title is "+title.getText());
		
		if(isAtRecommendedPages())
		{
			WebElement safetyStrategyButton = recommendedPagesElements.safetyStrategyButton();
			safetyStrategyButton.click();
			
			//TBA Code for navigation validation
			return true;
		}
		
		else
		{
			return false;
		}
		
	}

	/*
	 * Verifies whether the user is able to navigate to the 'Helping a Friend or a Community Member' on the recommended page.
	 */
	public static boolean isAtHelpingFriendCommunity() 
	{
		if(isAtRecommendedPages())
		{
			WebElement safetyStrategyButton = recommendedPagesElements.helpButton();
			safetyStrategyButton.click();
			url = driver.Instance.getCurrentUrl();
			
			//TBA Code for navigation validation
			return true;
		}
		else
		{
			return false;
		}
		
	}

	/*
	 * Verifies whether the user is able to navigate to the 'Things to Know before you Travel to Ghana' on the recommended page.
	 */
	public static boolean isAtThingsToKnow() 
	{
		if(isAtRecommendedPages())
		{
			log4j.Log.info("At Recommended Pages");
			WebElement thingsToKnowButton =recommendedPagesElements.thingsToKnowButton();
			thingsToKnowButton.click();
			url = driver.Instance.getCurrentUrl();
			
			//TBA Code for navigation validation
			return true;
		}
		else
		{
			return false;
		}
	}

	public static boolean isAtsetPreference() 
	{
		if(isAtRecommendedPages())
		{
			log4j.Log.info("At recommemded pages");
			WebElement setPreferences = recommendedPagesElements.setPreferences();
			setPreferences.click();
			url = driver.Instance.getCurrentUrl();
			
			return true;
		}
		else
		{
			return false;
		}
	}

}
