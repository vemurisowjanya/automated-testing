/*
 * @author Anjali
 * @since 2016-06-26
 * This test script tests the navigation by clicking on "Support Services" on the side in menu bar.
 */
package SideInMenuBarTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import BaseTests.commonTest;
import Logs.log4j;
import SideInMenuBarFeatures.sideInMenu;

public class supportServicesNavigationTest extends commonTest
{
	@Test
	public void test()
	{
		log4j.Log.info("Starting supportServicesNavigationTest");
		sideInMenu.gotoWelcomePage();
		Assert.assertEquals(sideInMenu.canNavigateToSupportServices(), true, "supportServicesNavigationTest failed");
		log4j.Log.info("supportServicesNavigationTest over");
	}
}
