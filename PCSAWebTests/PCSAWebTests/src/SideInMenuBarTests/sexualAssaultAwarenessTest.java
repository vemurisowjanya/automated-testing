/*
 * @author Anjali
 * @since 2016-06-26
 * This test script tests the navigation by clicking on "Sexual Assault Awareness" on the side in menu bar.
 */
package SideInMenuBarTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import BaseTests.commonTest;
import Logs.log4j;
import SideInMenuBarFeatures.sideInMenu;

public class sexualAssaultAwarenessTest extends commonTest
{
	@Test
	public void test()
	{
		log4j.Log.info("Starting sexualAssaultAwarenessTest");
		sideInMenu.gotoWelcomePage();
		Assert.assertEquals(sideInMenu.canNavigateToSexualAssualtAwareness(), true, "sexualAssaultAwarenessTest failed");
		log4j.Log.info("sexualAssaultAwarenessTest over");
	}
}
