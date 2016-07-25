/*
 * @author Anjali
 * @since 2016-07-25
 * This test script tests the navigation by clicking on different tabs/buttons on  "Safety Tools" page.
 */
package SafetyToolsTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import BaseTests.commonTest;
import Logs.log4j;
import SafetyToolsFeatures.safetyTools;

public class safetyToolsNavigationsTest extends commonTest
{
	/*
	 * Checks if the user is able to navigate to "Personal Security Strategies" page by clicking on its button 
	 * from the first page of "Safety Tools"
	 */
	@Test(priority = 0)
	public void canGotoPersonalSecurityStrategies()
	{
		log4j.Log.info("starting canGotopersonalSecurityStrategies test" );
		safetyTools.gotoSafetyToolsPage1();
		Assert.assertEquals(safetyTools.canGotoPersonalSecurityStrategies(), true, "firstAideNavigationTest failed");
		log4j.Log.info("canGotopersonalSecurityStrategies Test over");
	}
	
	/*
	 * Checks if the user is able to navigate to "RADAR" page by clicking on its button 
	 * from the first page of "Safety Tools"
	 */
	@Test(priority = 1)
	public void canGotoRadar()
	{
		log4j.Log.info("starting canGotoRadar test" );
		safetyTools.gotoSafetyToolsPage1();
		Assert.assertEquals(safetyTools.canGotoRadar(), true, "firstAideNavigationTest failed");
		log4j.Log.info("canGotoRadar Test over");
	}
}
