/**
 * 
 */
package ushahidi.pages.opportunities;

import org.openqa.selenium.By;

/**
 * @author Kesha
 *
 */
public class SuccessOpportunityPageReference {
	
	private By success = By.xpath("/html/body/div[3]/div/div/div/div/div/div/h3");
	private By returntoopportunity = By.xpath("/html/body/div[3]/div/div/div/div/div/div/div/a[1]");
	private By submitopportunity = By.xpath("/html/body/div[3]/div/div/div/div/div/div/div/a[2]");
	/**
	 * @return the success
	 */
	public By getSuccess() {
		return success;
	}
	/**
	 * @return the returntoopportunity
	 */
	public By getReturntoopportunity() {
		return returntoopportunity;
	}
	/**
	 * @return the submitopportunity
	 */
	public By getSubmitopportunity() {
		return submitopportunity;
	}
}
