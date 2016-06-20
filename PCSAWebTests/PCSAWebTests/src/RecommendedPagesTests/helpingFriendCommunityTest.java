/*
 * @author Anjali
 * @since 2016-06-09
 * This script tests the navigation to the Helping a Friend or Community member Page on click of the button  on Recommended Pages.
 */
package RecommendedPagesTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTests.commonTest;
import Logs.log4j;
import RecommendedPagesFeatures.recommendedPage;

public class helpingFriendCommunityTest extends commonTest
{
	@Test
	public static void test()
	{
		log4j.Log.info("Starting helpingFriendCommunityTest");
		recommendedPage.gotoRecommendedPage();
		Assert.assertEquals(true, recommendedPage.isAtHelpingFriendCommunity(), "helpingFriendCommunity Failed");
		log4j.Log.info("helpingFriendCommunityTest completed");
	}
}
