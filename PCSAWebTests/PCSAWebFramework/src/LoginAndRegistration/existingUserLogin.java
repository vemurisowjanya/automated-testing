/*
 * @author Anjali
 * @since 2016-06-13
 * This class performs log in as an existing user to carry out other functions that requires login.
 * It serves as a prerequisite for validating other functions after successful login.
 */
package LoginAndRegistration;
import Logs.log4j;
import PageObjectModel.loginPageElements;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjectModel.constants;
import PageObjectModel.logoutPageElements;
import WebDriver.driver;

import java.io.IOException;

public class existingUserLogin 
{
	public static void login()
	{
		driver.Instance.get(constants.baseURL);
		loginPage.Goto();
		loginCommand logInObj = new loginCommand(constants.existingEmailId).withPassword(constants.existingPassword);
		try {
			driver.waitDriverForElement(loginPageElements.emailId());
		}catch(IOException ex) {
			System.out.print(ex);
		}
		logInObj.login();
		if(loggedInCheck.hasLogeedIn()){
			return;
		}
		else{
			log4j.Log.info("Login failed!");
		}
	}
}
