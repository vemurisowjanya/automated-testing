/*
 * @author Anjali
 * @since 2016-07-17
 * This script checks proper navigation on clicking on "Learn More Link" on POffice of Inspector General page.
 */
package GetHelpNowTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTests.commonTest;
import GetHelpNowFeatures.getHelpNow;
import Logs.log4j;

public class officeoOfInspectorGeneralLearnMoreNavigationTest extends commonTest
{
	@Test
	public void test()
	{
		log4j.Log.info("stating  officeoOfInspectorGeneralLearnMoreNavigationTest");
		getHelpNow.gotoHelp2();
		Assert.assertEquals(getHelpNow.canGotoLearnMoreOfficeOfIG(), true, "officeoOfInspectorGeneralLearnMoreNavigationTest failed");
	}
}
