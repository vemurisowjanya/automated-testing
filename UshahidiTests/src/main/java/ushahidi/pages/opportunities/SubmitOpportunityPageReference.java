/**
 * 
 */
package ushahidi.pages.opportunities;

import org.openqa.selenium.By;

/**
 * @author Kesha
 *
 */
public class SubmitOpportunityPageReference {
	private By resource = By.xpath("/html/body/div[3]/div/div/div/div/div/div[1]/form/div[1]/input");
	private By pcv = By.xpath("/html/body/div[3]/div/div/div/div/div/div[1]/form/div[2]/input");
	private By availableFrom = By.xpath("/html/body/div[3]/div/div/div/div/div/div[1]/form/div[3]/input");
	private By availableUntil = By.xpath("/html/body/div[3]/div/div/div/div/div/div[1]/form/div[4]/input");
	private By contactby = By.xpath("/html/body/div[3]/div/div/div/div/div/div[1]/form/div[5]/h4/textarea");
	private By additionalInfo = By.xpath("/html/body/div[3]/div/div/div/div/div/div[1]/form/div[6]/textarea");
	private By submit = By.xpath("/html/body/div[3]/div/div/div/div/div/div[2]/input");
	
	// error log
	private By error = By.xpath("/html/body/div[3]/div/div/div/div/div/div[1]/div/h3");
	private By errorlog = By.xpath("/html/body/div[3]/div/div/div/div/div/div[1]/div/ul/li");
	
	/**
	 * @return the resource
	 */
	public By getResource() {
		return resource;
	}
	/**
	 * @return the pcv
	 */
	public By getPcv() {
		return pcv;
	}
	/**
	 * @return the availableFrom
	 */
	public By getAvailableFrom() {
		return availableFrom;
	}
	/**
	 * @return the availableUntil
	 */
	public By getAvailableUntil() {
		return availableUntil;
	}
	/**
	 * @return the contactby
	 */
	public By getContactby() {
		return contactby;
	}
	/**
	 * @return the additionalInfo
	 */
	public By getAdditionalInfo() {
		return additionalInfo;
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
	 * @return the errorlog
	 */
	public By getErrorlog() {
		return errorlog;
	}
	
}
