/*
 * @author Anjali
 * @since 2016-06-11
 * This script checks registration by taking different combinations of inputs for registration field.
 */
package LoginAndRegistrationTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseTests.commonTest;
import LoginAndRegistration.registration;
import Logs.log4j;
import PageObjectModel.constants;
import Utilities.excelUtil;

public class registrationTest extends commonTest
{
	@DataProvider(name="Registration")
	public Object[][] registrationData() throws Exception
	{
		 Object[][] testObjArray = excelUtil.getDataFromExcel("src//TestData//TestsData.xlsm",constants.registrationSheet);
	     return (testObjArray);
	}
	
	/*
	 * @param Username for registration is the first parameter
	 * @param Password for registration is the second parameter
	 * @param Host Country for registration is the third parameter
	 * @param Email for registration is the forth parameter
	 */
	@Test(dataProvider="Registration")
	public void test(String emailId, String username, String password, String confirmPassword, String country)
	{
		log4j.Log.info("Starting Registration Test");
		registration.Goto();
		registration.registerWith(emailId, username, password, confirmPassword, country);
		Assert.assertEquals(registration.hasRegistered(), true, "Registration failed");
		log4j.Log.info("Registration test over");
		
	}
}
