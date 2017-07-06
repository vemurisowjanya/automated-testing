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
	 * @return 'Peace Corps Policy Summary Sheet' Tab on the Side in Menu bar ---------------------------------------------
	 */
	public static WebElement policySummarySheetTab()
	{
		element = driver.Instance.findElement(constants.policySummarySheetTab);
		return element;
	}

	//@return 'Peace Corps Policy Summary Sheet' Title
	public static WebElement policySummarySheetTitle()
	{
		element = driver.Instance.findElement(constants.policySummarySheetTitle);
		return element;
	}

	//@return 'Peace Corps Policy Summary Sheet' UI cards
	public static WebElement policySummarySheetUiCards()
	{
		element = driver.Instance.findElement(constants.policySummarySheetUiCards);
		return element;
	}

	/*
	 * @return 'Glossary' Tab on the Side in Menu bar ---------------------------------------------
	 */
	public static WebElement glossaryTab()
	{
		element = driver.Instance.findElement(constants.glossaryTab);
		return element;
	}

	//@return 'Glossary' Title
	public static WebElement glossaryTitle()
	{
		element = driver.Instance.findElement(constants.glossaryTitle);
		return element;
	}

	//@return 'Glossary' UI cards
	public static WebElement glossaryUiCards()
	{
		element = driver.Instance.findElement(constants.glossaryUiCards);
		return element;
	}
	
	/*
	 * @return 'Further Resources' Tab on the Side in Menu bar ---------------------------------------------
	 */
	public static WebElement furtherResourcesTab()
	{
		element = driver.Instance.findElement(constants.furtherResourcesTab);
		return element;
	}

	//@return 'Further Resources' Title
	public static WebElement furtherResourcesTitle()
	{
		element = driver.Instance.findElement(constants.furtherResourcesTitle);
		return element;
	}

	//@return 'Further Resources' UI cards
	public static WebElement furtherResourcesUiCards()
	{
		element = driver.Instance.findElement(constants.furtherResourcesUiCards);
		return element;
	}
}
