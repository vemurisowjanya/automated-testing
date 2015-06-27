/**
 * 
 */
package ushahidi.pages.homepage;

import org.openqa.selenium.By;


/**
 * @author Kesha
 *
 */
public class MenubarPageReference {
	private By opportunity= By.xpath("/html/body/div[2]/div/div/ul/li[3]/a");

	/**
	 * @return the opportunity
	 */
	public By getOpportunity() {
		return opportunity;
	}
}
