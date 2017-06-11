/**
 * 
 */
package ushahidi.pages.report;

import org.openqa.selenium.By;

/**
 * @author Kesha
 *
 */
public class SubmittedReportPageReference {
	private By message = By.xpath("/html/body/div[3]/div/div/div/div/div/div/h3");
	private By reportPage = By.xpath("/html/body/div[3]/div/div/div/div/div/div/div/a[1]");
	private By newReport = By.xpath("/html/body/div[3]/div/div/div/div/div/div/div/a[2]");
	/**
	 * @return the message
	 */
	public By getMessage() {
		return message;
	}
	/**
	 * @return the reportPage
	 */
	public By getReportPage() {
		return reportPage;
	}
	/**
	 * @return the newReport
	 */
	public By getNewReport() {
		return newReport;
	}
	
	
}
