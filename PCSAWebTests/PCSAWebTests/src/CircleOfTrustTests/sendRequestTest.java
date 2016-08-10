/*
 * @author Anjali
 * @since 2016-07-24
 * This test script tests checks if the user is able to send all the messages after clicking on "Help Me".
 */
package CircleOfTrustTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import BaseTests.commonTest;
import CircleOfTrustFeatures.circleOfTrust;
import Logs.log4j;

public class sendRequestTest extends commonTest
{
	/*
	 * This checks if the first message is sent successfully
	 */
	@Test
	public void canSendMsg1()
	{
		log4j.Log.info("Starting canSendMsg1");
		circleOfTrust.gotoCOT();
		Assert.assertEquals(circleOfTrust.canSendMsg1(), true, "canSendMsg1 failed");
		log4j.Log.info("canSendMsg1 over");
	}
	
	/*
	 * This checks if the second message is sent successfully
	 */
	@Test
	public void canSendMsg2()
	{
		log4j.Log.info("Starting canSendMsg2");
		circleOfTrust.gotoCOT();
		Assert.assertEquals(circleOfTrust.canSendMsg2(), true, "canSendMsg2 failed");
		log4j.Log.info("canSendMsg2 over");
	}
	
	/*
	 * This checks if the third message is sent successfully
	 */
	@Test
	public void canSendMsg3()
	{
		log4j.Log.info("Starting canSendMsg3");
		circleOfTrust.gotoCOT();
		Assert.assertEquals(circleOfTrust.canSendMsg3(), true, "canSendMsg3 failed");
		log4j.Log.info("canSendMsg3 over");
	}
}
