/*
 * @author Anjali
 * @since 2016-06-09
 * This script tests the navigation to the Safety Strategies Page on click of the button  on Recommended Pages.
 * This script uses stub and needs to be updated when the functionality is ready.
 */
package RecommendedPagesTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import BaseTests.commonTest;
import Logs.log4j;
import RecommendedPagesFeatures.recommendedPage;

public class safetyStrategiesHelplineTest extends commonTest
{
	@Test
	public void test()
	{
		log4j.Log.info("Starting safetyStrategiesHelplineTest");
		recommendedPage.gotoRecommendedPage();
		Assert.assertEquals(true, recommendedPage.isAtSafetyStrategiesHelpline(), "safetyStrategiesHelplineTest Failed");
		log4j.Log.info("safetyStrategiesHelplineTest completed");
	}
}
