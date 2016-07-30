/*
 * @author Anjali
 * @since 2016-07-30
 * This test script tests the addition of all the comrades numbers on the "My trustees" after clicking on the
 * edit button from the main page of "Circle of Trust" .
 */
package CircleOfTrustTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import BaseTests.commonTest;
import CircleOfTrustFeatures.circleOfTrust;
import Logs.log4j;

public class addComradeNumbersTest extends commonTest
{
	@Test
	public void test()
	{
		//All the numbers should be different
		String phNumbers[] = {"4444","5555","6666","9740314115","3333","1111"};
		System.out.println(phNumbers[3]);
		log4j.Log.info("Starting addComradeNumbersTest");
		circleOfTrust.gotoCOT();
		Assert.assertEquals(circleOfTrust.canAddComradesNumbers(phNumbers), true, "addComradeNumbersTest failed");
		log4j.Log.info("editComradeNavigationTest over");
	}
}
