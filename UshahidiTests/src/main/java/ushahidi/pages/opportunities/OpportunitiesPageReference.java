/**
 * 
 */
package ushahidi.pages.opportunities;

import org.openqa.selenium.By;

/**
 * @author Kesha
 *
 */
public class OpportunitiesPageReference {
	private By SubmitBtn = By.xpath("/html/body/div[3]/div/div/div/div/div/form/input");
	private By resourceAvailable = By.xpath("/html/body/div[3]/div/div/div/div/div/div/div[2]/table/tbody/tr");
	private By insearchof = By.xpath("/html/body/div[3]/div/div/div/div/div/div/div[1]/table/tbody/tr");
	/**
	 * @return the submitBtn
	 */
	public By getSubmitBtn() {
		return SubmitBtn;
	}
	/**
	 * @return the resourceAvailable
	 */
	public By getResourceAvailable() {
		return resourceAvailable;
	}
	/**
	 * @return the insearchof
	 */
	public By getInsearchof() {
		return insearchof;
	}

}
