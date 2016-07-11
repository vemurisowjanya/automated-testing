/*
 * @author Anjali
 * @since 2016-07-01
 * This script checks login by taking in different login credentials data in a parameterized form.
 */

package LoginAndRegistrationTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import BaseTests.commonTest;
import LoginAndRegistration.loggedInCheck;
import LoginAndRegistration.loginPage;

public class parameterisedLoginTest extends commonTest
{
	@DataProvider(name = "Credentials")
	public static Object[][] credentials()
	{
		return new Object[][]{{"test@gmail.com","test"},{"dummy@gmail.com","dummy_password"}};
	}
	
	@Test(dataProvider="Credentials")
	public void canUserLogin(String emailId, String password)
	{
		loginPage.Goto();
		loginPage.loginAs(emailId)
		.withPassword(password)
		.login();
        Assert.assertEquals(loggedInCheck.hasLogeedIn(), true, "parameterisedLoginTest failed");
	}
}
