/**
 * 
 */
package ushahidi.pages.faq;

import org.openqa.selenium.By;

/**
 * @author Kesha
 *
 */
public class FaqPageReference {
	private By title = By.xpath("/html/body/div[3]/div/div/div/div/div/h1");
	private By content = By.xpath("/html/body/div[3]/div/div/div/div/div/div");
	/**
	 * @return the title
	 */
	public By getTitle() {
		return title;
	}
	/**
	 * @return the content
	 */
	public By getContent() {
		return content;
	}
	
	
}
