/**
 * 
 */
package ushahidi.pages.loginpage;

import org.openqa.selenium.By;

/**
 * @author Kesha
 *
 */
public class UIPageReference {
	private By loginUi_id = By.id("signin_userpass");
	private By emailLink_xpath = By.xpath("/html/body/div[2]/div[2]/h2[2]/a");
	private By signupUi_id = By.id("signin_new");
	private By createAccount_xpath = By.xpath("/html/body/div[2]/div[3]/h2/a");
	private By forgotUi_id = By.id("signin_forgot");
	private By registeredemail_xpath = By.xpath("/html/body/div[2]/div[2]/div[1]/form/table/tbody/tr[5]/td/a");
	/**
	 * @return the loginUi_id
	 */
	public By getLoginUi_id() {
		return loginUi_id;
	}
	/**
	 * @return the emailLink_xpath
	 */
	public By getEmailLink_xpath() {
		return emailLink_xpath;
	}
	/**
	 * @return the signupUi_id
	 */
	public By getSignupUi_id() {
		return signupUi_id;
	}
	/**
	 * @return the createAccount_xpath
	 */
	public By getCreateAccount_xpath() {
		return createAccount_xpath;
	}
	/**
	 * @return the forgotUi_id
	 */
	public By getForgotUi_id() {
		return forgotUi_id;
	}
	/**
	 * @return the registeredemail_xpath
	 */
	public By getRegisteredemail_xpath() {
		return registeredemail_xpath;
	}
	
}
