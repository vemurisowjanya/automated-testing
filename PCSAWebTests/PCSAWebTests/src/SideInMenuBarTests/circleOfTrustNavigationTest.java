/*
 * @author Anjali
 * @since 2016-06-26
 * This test script tests the navigation by clicking on "Circle of Trust" on the side in menu bar.
 */
package SideInMenuBarTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import BaseTests.commonTest;
import Logs.log4j;
import SideInMenuBarFeatures.sideInMenu;

public class circleOfTrustNavigationTest extends commonTest
{
	@Test
	public void test()
	{
		log4j.Log.info("Starting circleOfTrustNavigationTest");
		sideInMenu.gotoWelcomePage();
		Assert.assertEquals(sideInMenu.canNavigateToCircleOfTrust(), true, "circleOfTrustNavigationTest failed");
		log4j.Log.info("circleOfTrustNavigationTest over");
	}
}
