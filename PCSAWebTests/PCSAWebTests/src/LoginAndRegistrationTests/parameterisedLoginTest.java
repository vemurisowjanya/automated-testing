/*
 * @author Anjali
 * @since 2016-07-01
 * This script checks login by taking in different login credentials data in a parameterized form.
 */

package LoginAndRegistrationTests;
import PageObjectModel.loginPageElements;
import WebDriver.driver;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import BaseTests.commonTest;
import LoginAndRegistration.loggedInCheck;
import LoginAndRegistration.loginPage;
import LoginAndRegistration.loginCommand;

import java.io.IOException;

public class parameterisedLoginTest extends commonTest
{
	@DataProvider(name = "Credentials")
	public static Object[][] credentials()
	{
		return new Object[][]{{"test_user_one@email.com","password"}	};
	}
	
	@Test(dataProvider="Credentials")
	public void canUserLogin(String emailId, String password) throws IOException
	{
		loginPage.Goto();
		loginCommand logInObj = new loginCommand(emailId).withPassword(password);
		driver.waitDriverForElement(loginPageElements.emailId());
		logInObj.login();
		Assert.assertEquals(loggedInCheck.hasLogeedIn(), true, "parameterised LoginTest failed");
	}
}
