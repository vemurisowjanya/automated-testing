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
	public String msg= "";
	
	/*
	 * This is the case when sms is sent with message. It will pass
	 */
	@Test
	public void testWithMessage()
	{
		log4j.Log.info("Starting ssmSMSTest");
		msg="Test";
		getHelpNow.gotoGetHelp();
		Assert.assertEquals(getHelpNow.canMessageSSM(msg), true, "ssmSMSTest failed");
		log4j.Log.info("ssmSMSTest over");
	}
	
	/*
	 * This is the case when sms is sent without any message. It will fail
	 */
	@Test
	public void testWithoutMessage()
	{
		log4j.Log.info("Starting ssmSMSTest");
		msg="";
		getHelpNow.gotoGetHelp();
		Assert.assertEquals(getHelpNow.canMessageSSM(msg), true, "ssmSMSTest failed");
		log4j.Log.info("ssmSMSTest over");
	}
}
