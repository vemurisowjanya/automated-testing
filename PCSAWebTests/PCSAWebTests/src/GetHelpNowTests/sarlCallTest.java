/*
 * @author Anjali
 * @since 2016-06-27
 * This script checks if a user is able to Voice Call after selecting it from Contact SARL.
 */
package GetHelpNowTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import BaseTests.commonTest;
import GetHelpNowFeatures.getHelpNow;
import Logs.log4j;

public class sarlCallTest extends commonTest
{
	@Test
	public void test()
	{
		log4j.Log.info("Starting sarlCallTest");
		getHelpNow.gotoGetHelp();
		Assert.assertEquals(getHelpNow.canCallSarl(), true, "sarlCallTest failed");
		log4j.Log.info("sarlCallTest over");
	}
}
