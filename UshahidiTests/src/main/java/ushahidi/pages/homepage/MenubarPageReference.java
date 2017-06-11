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
	private By faq = By.xpath("/html/body/div[2]/div/div/ul/li[5]/a");
	private By contactus = By.xpath("/html/body/div[2]/div/div/ul/li[4]/a");
	
	/**
	 * @return the opportunity
	 */
	public By getOpportunity() {
		return opportunity;
	}

	/**
	 * @return the faq
	 */
	public By getFaq() {
		return faq;
	}

	/**
	 * @return the contactus
	 */
	public By getContactus() {
		return contactus;
	}
	
}
