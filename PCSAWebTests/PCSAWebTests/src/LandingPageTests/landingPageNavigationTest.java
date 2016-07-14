/*
 * @author Anjali
 * @since 2016-06-08
 * This script tests navigation to the landing page by entering URL in the browser.
 */
package LandingPageTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import BaseTests.commonTest;
import LandingPage.landingPageNavigation;


public class landingPageNavigationTest extends commonTest
{
	@Test
	public void test()
	{
		landingPageNavigation.navigateToURL();
		Assert.assertEquals(true, landingPageNavigation.isAtLanding(), "Landing Page Navigation Failed");
	}
}
