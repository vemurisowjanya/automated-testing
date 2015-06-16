/**
 * 
 */
package ushahidi.pages.loginpage;

import org.openqa.selenium.By;

/**
 * @author Kesha
 *
 */
public class LoginPageReference {
	
	// Login with
	private By login_text_class = By.className("login_text");
	private By username_id = By.id("username");
	private By password_id = By.id("password");
	private By remember_id = By.id("remember");
	private By submit_id = By.id("submit");
	private By forgotpassword_id = By.linkText("Forgot your password?");
	private By logintoggle_id = By.linkText("Email and Password");
	private By logout_xpath = By.xpath("/html/body/div[1]/div/div/div/ul[2]/li/ul/li[4]/a/em");
	private By autherror_xpath = By.xpath("/html/body/div[2]/div[2]");
	/**
	 * @return the login_text_class
	 */
	public By getLogin_text_class() {
		return login_text_class;
	}
	/**
	 * @return the username_id
	 */
	public By getUsername_id() {
		return username_id;
	}
	/**
	 * @return the password_id
	 */
	public By getPassword_id() {
		return password_id;
	}
	/**
	 * @return the remember_id
	 */
	public By getRemember_id() {
		return remember_id;
	}
	/**
	 * @return the submit_id
	 */
	public By getSubmit_id() {
		return submit_id;
	}
	/**
	 * @return the forgotpassword_id
	 */
	public By getForgotpassword_id() {
		return forgotpassword_id;
	}
	/**
	 * @return the logintoggle_id
	 */
	public By getLogintoggle_id() {
		return logintoggle_id;
	}
	/**
	 * @return the logout_xpath
	 */
	public By getLogout_xpath() {
		return logout_xpath;
	}
	/**
	 * @return the autherror_xpath
	 */
	public By getAutherror_xpath() {
		return autherror_xpath;
	}
	
	
}
