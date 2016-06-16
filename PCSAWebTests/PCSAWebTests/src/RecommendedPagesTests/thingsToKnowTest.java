/*
 * @author Anjali
 * @since 2016-06-16
 * This script tests the navigation to Things to know before you travel to Ghana  Page on click of the button on Recommended Pages.
 */
package RecommendedPagesTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import BaseTests.commonTest;
import Logs.log4j;
import RecommendedPagesFeatures.recommendedPage;

public class thingsToKnowTest extends commonTest
{
	@Test
	public void test()
	{
		log4j.Log.info("Starting thingsToKnowTest");
		recommendedPage.gotoRecommendedPage();
		Assert.assertEquals(true, recommendedPage.isAtThingsToKnow(), "thingsToKnowTest Failed");
		log4j.Log.info("thingsToKnowTest completed");
	}
}
