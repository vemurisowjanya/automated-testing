/*
 * @author Anjali
 * @since 2016-06-27
 * This script checks if a user is able to Send Message after selecting it from Contact SARL.
 */
package GetHelpNowTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import BaseTests.commonTest;
import GetHelpNowFeatures.getHelpNow;
import Logs.log4j;

public class sarlSMSTest extends commonTest
{
	public String msg= "";
	
	/*
	 * This is the case when sms is sent with message. It will pass
	 */
	@Test
	public void testWithMessage()
	{
		log4j.Log.info("Starting sarlSMSTest");
		msg="Test";
		getHelpNow.gotoGetHelp();
		Assert.assertEquals(getHelpNow.canMessageSARL(msg), true, "sarlSMSTest failed");
		log4j.Log.info("sarlSMSTest over");
	}
	
	/*
	 * This is the case when sms is sent without any message. It will fail
	 */
	@Test
	public void testWithoutMessage()
	{
		log4j.Log.info("Starting sarlSMSTest");
		msg="";
		getHelpNow.gotoGetHelp();
		Assert.assertEquals(getHelpNow.canMessageSARL(msg), true, "sarlSMSTest failed");
		log4j.Log.info("sarlSMSTest over");
	}
}
