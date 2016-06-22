/*
 * @author Anjali
 * @since 2016-06-22
 * This script checks if a user is able to goto 'Get Help Now' page after successful login.
 */
package GetHelpNowTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import BaseTests.commonTest;
import GetHelpNowFeatures.getHelpNow;
import Logs.log4j;

public class getHelpNavigationTest extends commonTest
{
	@Test
	public void test()
	{
		log4j.Log.info("getHelpNavigationTest stating");
		getHelpNow.gotoGetHelp();
		Assert.assertEquals(getHelpNow.isAtGetHelpNow(), true, "getHelpNavigationTest failed");
		log4j.Log.info("getHelpNavigationTest over");
	}
}
