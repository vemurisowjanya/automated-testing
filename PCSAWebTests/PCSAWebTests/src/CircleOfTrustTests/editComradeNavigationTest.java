/*
 * @author Anjali
 * @since 2016-07-24
 * This test script tests the navigation by clicking on "Edit" button on Circle of Trust main page.
 */
package CircleOfTrustTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import BaseTests.commonTest;
import CircleOfTrustFeatures.circleOfTrust;
import Logs.log4j;

public class editComradeNavigationTest extends commonTest
{
	@Test
	public void test()
	{
		log4j.Log.info("Starting editComradeNavigationTest");
		circleOfTrust.gotoCOT();
		Assert.assertEquals(circleOfTrust.isAtEditComrade(), true, "editComradeNavigationTest failed");
		log4j.Log.info("editComradeNavigationTest over");
	}
}
