/**
 * 
 */
package ushahidi.pages.loginpage;

import org.openqa.selenium.By;

/**
 * @author Kesha
 *
 */
public class SignUpPageReference {
	private By name = By.className("new_name");
	private By email = By.className("new_email");
	private By password = By.className("new_password");
	private By verifyPassword = By.className("new_password_again");
	private By signUpBtn = By.className("new_submit");
	private By error = By.xpath("/html/body/div[2]/div[2]");
	private By success = By.xpath("/html/body/div[2]/div[2]");
	
	/**
	 * @return the name
	 */
	public By getName() {
		return name;
	}
	/**
	 * @return the email
	 */
	public By getEmail() {
		return email;
	}
	/**
	 * @return the password
	 */
	public By getPassword() {
		return password;
	}
	/**
	 * @return the verifyPassword
	 */
	public By getVerifyPassword() {
		return verifyPassword;
	}
	/**
	 * @return the signUpBtn
	 */
	public By getSignUpBtn() {
		return signUpBtn;
	}
	/**
	 * @return the error
	 */
	public By getError() {
		return error;
	}
	/**
	 * @return the success
	 */
	public By getSuccess() {
		return success;
	}
	
	
}
