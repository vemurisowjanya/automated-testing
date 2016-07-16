/*
 * @author Anjali
 * @since 2016-07-16
 * This script checks if a user is able to use the Contact Now available in PC Saves Anonymous Helpline under 'Get Help Now'
 */
package GetHelpNowTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import BaseTests.commonTest;
import GetHelpNowFeatures.getHelpNow;
import Logs.log4j;

public class PCSaveAnonymousHelplineContactNowTest extends commonTest 
{

	@Test(priority = 0)
	public void voiceCallTest() 
	{
		log4j.Log.info("stating voice test call for PCSaveAnonymousHelplineContactNowTest");
		getHelpNow.gotoHelp2();
		Assert.assertEquals(getHelpNow.canVoiceCallPC(), true, "PCSaveAnonymousHelplineContactNowTest failed");
	}

	@Test(priority = 1)
	public void sendMessageTest() 
	{
		log4j.Log.info("stating send message for PCSaveAnonymousHelplineContactNowTest");
		getHelpNow.gotoHelp2();
		Assert.assertEquals(getHelpNow.canMessagePC(), true, "PCSaveAnonymousHelplineContactNowTest failed");
	}
}
