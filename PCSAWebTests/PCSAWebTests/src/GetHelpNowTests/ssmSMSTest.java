/*
 * @author Anjali
 * @since 2016-06-27
 * This script checks if a user is able to Send Message after selecting it from Contact SSM.
 */
package GetHelpNowTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import BaseTests.commonTest;
import GetHelpNowFeatures.getHelpNow;
import Logs.log4j;

public class ssmSMSTest extends commonTest
{
	@Test
	public void test()
	{
		log4j.Log.info("Starting ssmSMSTest");
		getHelpNow.gotoGetHelp();
		Assert.assertEquals(getHelpNow.canMessageSSM(), true, "ssmSMSTest failed");
		log4j.Log.info("ssmSMSTest over");
	}
}
