/*
 * @author Anjali
 * @since 2016-06-22
 * This class maintains page elements for the Policies and Glossary Features.
 */
package PageObjectModel;

import org.openqa.selenium.WebElement;

import WebDriver.driver;

public class policiesAndGlossaryElements 
{
	public static WebElement element;
	
	/*
	 * @return 'PeaceCorps Policy Summary Sheet' Tab on the Side in Menu bar
	 */
	public static WebElement policySummarySheetTab()
	{
		element = driver.Instance.findElement(constants.policySummarySheetTab);
		return element;
	}
	
	/*
	 * @return 'Glossary' Tab on the Side in Menu bar
	 */
	public static WebElement glossaryTab()
	{
		element = driver.Instance.findElement(constants.glossaryTab);
		return element;
	}
	
	/*
	 * @return 'Further Resources' Tab on the Side in Menu bar
	 */
	public static WebElement furtherResourcesTab()
	{
		element = driver.Instance.findElement(constants.furtherResourcesTab);
		return element;
	}
}
