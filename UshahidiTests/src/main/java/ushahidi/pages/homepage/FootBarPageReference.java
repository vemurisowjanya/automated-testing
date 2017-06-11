/**
 * 
 */
package ushahidi.pages.homepage;

import org.openqa.selenium.By;

/**
 * @author Kesha
 *
 */
public class FootBarPageReference {
	private By submitReport = By.xpath("/html/body/div[4]/div/div/div[2]/div[2]/table/tbody/tr/td[2]/a");
	private By home = By.xpath("/html/body/div[4]/div/div/div[2]/div[2]/table/tbody/tr/td[1]/a");
	private By opportunities = By.xpath("/html/body/div[4]/div/div/div[2]/div[2]/table/tbody/tr/td[3]/a");
	private By contactUs = By.xpath("/html/body/div[4]/div/div/div[2]/div[2]/table/tbody/tr/td[4]/a");
	/**
	 * @return the submitReport
	 */
	public By getSubmitReport() {
		return submitReport;
	}
	/**
	 * @return the home
	 */
	public By getHome() {
		return home;
	}
	/**
	 * @return the opportunities
	 */
	public By getOpportunities() {
		return opportunities;
	}
	/**
	 * @return the contactUs
	 */
	public By getContactUs() {
		return contactUs;
	}
}
