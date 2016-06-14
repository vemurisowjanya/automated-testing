/*
 * @author Anjali
 * @since 2016-06-11
 * This script checks if the user is able to logout after successful login.
 */
package LoginAndRegistrationTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTests.commonTest;
import LoginAndRegistration.logout;
import Logs.log4j;

public class logoutTest extends commonTest
{
	@Test
	public void test()
	{
		log4j.Log.info("Starting Logout test");
		Assert.assertEquals(logout.isAbleToLogout(), true, "Logout failed");
		log4j.Log.info("Logout test over");
	}
}
