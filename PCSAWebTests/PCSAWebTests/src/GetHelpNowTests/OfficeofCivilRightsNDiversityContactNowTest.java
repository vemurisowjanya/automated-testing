/*
 * @author Anjali
 * @since 2016-07-16
 * This script checks if a user is able to use the Contact Now available in Office of Civil Rights and Diversity under 'Get Help Now'
 */
package GetHelpNowTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTests.commonTest;
import GetHelpNowFeatures.getHelpNow;
import Logs.log4j;

public class OfficeofCivilRightsNDiversityContactNowTest extends commonTest
{
	@Test(priority = 0)
	public void voiceCallTest() 
	{
		log4j.Log.info("stating voice test call for OfficeofCivilRightsNDiversityContactNowTest");
		getHelpNow.gotoHelp2();
		Assert.assertEquals(getHelpNow.canVoiceOfficeofCivilRights(), true, "OfficeofCivilRightsNDiversityContactNowTest failed");
	}

	@Test(priority = 1)
	public void sendMessageTest() 
	{
		log4j.Log.info("stating send message for OfficeofCivilRightsNDiversityContactNowTest");
		getHelpNow.gotoHelp2();
		Assert.assertEquals(getHelpNow.canMessageOfficeofCivilRights(), true, "OfficeofCivilRightsNDiversityContactNowTest failed");
	}
}
