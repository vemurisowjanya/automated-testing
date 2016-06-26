/*
 * @author Anjali
 * @since 2016-06-26
 * This test script tests the navigation by clicking on "Safety Tools" on the side in menu bar.
 */
package SideInMenuBarTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import BaseTests.commonTest;
import Logs.log4j;
import SideInMenuBarFeatures.sideInMenu;

public class safetyToolsNavigationTest extends commonTest
{
	@Test
	public void test()
	{
		log4j.Log.info("Starting safetyToolsNavigation");
		sideInMenu.gotoWelcomePage();
		Assert.assertEquals(sideInMenu.canNavigateToSafetyTools(), true, "safetyToolsNavigation failed");
		log4j.Log.info("safetyToolsNavigation over");
	}
}
