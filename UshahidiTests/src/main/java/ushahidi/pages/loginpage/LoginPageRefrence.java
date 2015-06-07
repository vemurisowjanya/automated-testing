/**
 * 
 */
package ushahidi.pages.loginpage;

import org.openqa.selenium.By;

/**
 * @author Kesha
 *
 */
public class LoginPageRefrence {
	
	// Query
	By query = By.name("q");
	
	/**
	 * @return the query
	 */
	public By getQuery() {
		return query;
	}
	
	// Login with
	By username = By.id("username");
	By password = By.id("password");
	By remember = By.id("remember");
	By submit = By.id("submit");
	By forgotpassword = By.linkText("Forgot your password?");
	By logintoggle = By.linkText("Email and Password");

	
	// Create an Account
	
}
