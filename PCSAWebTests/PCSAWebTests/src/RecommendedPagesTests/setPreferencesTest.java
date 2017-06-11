/*
 * @author Anjali
 * @since 2016-06-16
 * This script tests the navigation to the Preferences Page on click of the button on Recommended Pages.
 * This script uses stub and needs to be updated when the functionality is ready.
 */
package RecommendedPagesTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTests.commonTest;
import Logs.log4j;
import RecommendedPagesFeatures.recommendedPage;

public class setPreferencesTest extends commonTest
{
	@Test
	public void test()
	{
		log4j.Log.info("Staring setPreferencesTest");
		recommendedPage.gotoRecommendedPage();
		Assert.assertEquals(true, recommendedPage.isAtsetPreference(), "setPreferencesTest Failed");
		log4j.Log.info("setPreferencesTest completed");
	}
}
