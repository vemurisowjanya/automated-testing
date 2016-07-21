/*
 * @author Anjali
 * @since 2016-07-16
 * This script checks if a user is able to use the Contact Now available in Office of Victim Advocacy under 'Get Help Now'
 */
package GetHelpNowTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTests.commonTest;
import GetHelpNowFeatures.getHelpNow;
import Logs.log4j;

public class OfficeofVictimAdvocacyContactNowTest extends commonTest
{
	public String msg= "";

	@Test(priority = 0)
	public void voiceCallTest() 
	{
		log4j.Log.info("stating voice test call for OfficeofVictimAdvocacyContactNowTest");
		getHelpNow.gotoHelp2();
		Assert.assertEquals(getHelpNow.canVoiceOfficeofVA(), true, "OfficeofVictimAdvocacyContactNowTest failed");
	}

	/*
	 * This is the case when sms is sent with message. It will pass
	 */
	@Test(priority = 1)
	public void sendSMSTestWithMessage() 
	{
		log4j.Log.info("stating send message for OfficeofVictimAdvocacyContactNowTest");
		msg="Test";
		getHelpNow.gotoHelp2();
		Assert.assertEquals(getHelpNow.canMessageOfficeofVA(msg), true, "OfficeofVictimAdvocacyContactNowTest failed");
	}
	
	/*
	 * This is the case when sms is sent without message. It will fail
	 */
	@Test(priority = 2)
	public void sendSMSTestWithoutMessage() 
	{
		log4j.Log.info("stating send message for OfficeofVictimAdvocacyContactNowTest");
		msg="";
		getHelpNow.gotoHelp2();
		Assert.assertEquals(getHelpNow.canMessageOfficeofVA(msg), true, "OfficeofVictimAdvocacyContactNowTest failed");
	}
}
