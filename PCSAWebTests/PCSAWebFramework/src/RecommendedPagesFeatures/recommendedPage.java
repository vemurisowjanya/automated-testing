/*
 * @author Anjali
 * @since 2016-06-09
 * This class maintains page elements for Recommended Pages.
 */
package RecommendedPagesFeatures;
import org.openqa.selenium.WebElement;
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
		log4j.Log.info("Navigating to Recommended Pages");
		driver.Instance.get(constants.baseURL+"welcome.html");
		log4j.Log.info("On Recommended Pages");
	}

	public static boolean isAtSafetyStrategiesHelpline()
	{
		// TODO Auto-generated method stub
		url = driver.Instance.getCurrentUrl();
		WebElement title = recommendedPagesElements.recommendedPageTitle();
		log4j.Log.info("The title is "+title.getText());
		WebElement safetyStrategyButton = recommendedPagesElements.safetyStrategyButton();
		safetyStrategyButton.click();
		
		//TBA Code for navigation validation
		if(title.getText().equals("Welcome to First Aide")&& url.equals(constants.baseURL+"welcome.html"))
			return true;
		else
			return false;
	}

	public static boolean isAtHelpingFriendCommunity() 
	{
		// TODO Autreturn null;// TODO Auto-generated method stub
		url = driver.Instance.getCurrentUrl();
		WebElement title = recommendedPagesElements.recommendedPageTitle();
		log4j.Log.info("The title is "+title.getText());
		WebElement safetyStrategyButton = recommendedPagesElements.helpButton();
		safetyStrategyButton.click();
		
		//TBA Code for navigation validation
		if(title.getText().equals("Welcome to First Aide")&& url.equals(constants.baseURL+"welcome.html"))
			return true;
		else
			return false;
	}

}
