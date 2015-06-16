/**
 * 
 */
package ushahidi.pages.loginpage;

import org.openqa.selenium.By;

/**
 * @author Kesha
 *
 */
public class ForgotPasswordPageReference {
	private By email = By.className("login_text");
	private By email_id = By.id("resetemail");
	private By submit = By.className("login_btn");
	private By error = By.xpath("/html/body/div[2]/div[2]");
	
	/**
	 * @return the email
	 */
	public By getEmail() {
		return email;
	}
	/**
	 * @return the submit
	 */
	public By getSubmit() {
		return submit;
	}
	/**
	 * @return the error
	 */
	public By getError() {
		return error;
	}
	/**
	 * @return the email_id
	 */
	public By getEmail_id() {
		return email_id;
	}
	
}
