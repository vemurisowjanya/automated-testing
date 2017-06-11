/**
 * 
 */
package ushahidi.pages.contact;

import org.openqa.selenium.By;

/**
 * @author Kesha
 *
 */
public class ContactUsPageReference {
	private By name = By.xpath("/html/body/div[3]/div/div/div/div/div/div/form/div[1]/input");
	private By email = By.xpath("/html/body/div[3]/div/div/div/div/div/div/form/div[2]/input");
	private By phno = By.xpath("/html/body/div[3]/div/div/div/div/div/div/form/div[3]/input");
	private By subject = By.xpath("/html/body/div[3]/div/div/div/div/div/div/form/div[4]/input");
	private By message = By.xpath("/html/body/div[3]/div/div/div/div/div/div/form/div[5]/textarea");
	private By securityAns = By.xpath("/html/body/div[3]/div/div/div/div/div/div/form/div[6]/input");
	private By securityQue = By.xpath("/html/body/div[3]/div/div/div/div/div/div/form/div[6]");
	private By sendmessage = By.xpath("/html/body/div[3]/div/div/div/div/div/div/form/div[7]/input");
	private By error = By.xpath("/html/body/div[3]/div/div/div/div/div/div/div/h3");
	private By errorList = By.xpath("/html/body/div[3]/div/div/div/div/div/div/div/ul/li");
	private By success = By.xpath("/html/body/div[3]/div/div/div/div/div/div/div/h3");
	
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
	 * @return the phno
	 */
	public By getPhno() {
		return phno;
	}
	/**
	 * @return the subject
	 */
	public By getSubject() {
		return subject;
	}
	/**
	 * @return the message
	 */
	public By getMessage() {
		return message;
	}
	/**
	 * @return the securityAns
	 */
	public By getSecurityAns() {
		return securityAns;
	}
	/**
	 * @return the securityQue
	 */
	public By getSecurityQue() {
		return securityQue;
	}
	/**
	 * @return the sendmessage
	 */
	public By getSendmessage() {
		return sendmessage;
	}
	/**
	 * @return the error
	 */
	public By getError() {
		return error;
	}
	/**
	 * @return the errorList
	 */
	public By getErrorList() {
		return errorList;
	}
	/**
	 * @return the success
	 */
	public By getSuccess() {
		return success;
	}
	
}
