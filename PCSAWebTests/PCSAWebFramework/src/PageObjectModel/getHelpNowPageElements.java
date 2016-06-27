/*
 * @author Anjali
 * @since 2016-06-22
 * This class maintains page elements for the Get Help Now Features.
 */
package PageObjectModel;

import org.openqa.selenium.WebElement;

import WebDriver.driver;

public class getHelpNowPageElements 
{
	public static WebElement element;
	
	/*
	 * @return Get help page title on the Get Help Page.
	 */
	public static WebElement gethelpPageTitle()
	{
		element = driver.Instance.findElement(constants.gethelpPageTitle);
		return element;
	}
	
	/*
	 * @return Dropdown for 'Change Location' on the Get Help Page.
	 */
	public static WebElement changeLocationDropdown()
	{
		element = driver.Instance.findElement(constants.changeLocationDropdown);
		return element;
	}
	
	/*
	 * @return Text display for 'Change Location' on the Get Help Page.
	 */
	public static WebElement chooseLocationText()
	{
		element = driver.Instance.findElement(constants.chooseLocationText);
		return element;
	}
	
	/*
	 * @return Button for 'Contact PCMO' on the Get Help Page.
	 */
	public static WebElement contactPCMO()
	{
		element = driver.Instance.findElement(constants.contactPCMO);
		return element;
	}
	
	/*
	 * @return Button for 'Contact SSM' on the Get Help Page.
	 */
	public static WebElement contactSSM()
	{
		element = driver.Instance.findElement(constants.contactSSM);
		return element;
	}
	
	/*
	 * @return Button for 'Contact SARL' on the Get Help Page.
	 */
	public static WebElement contactSARL()
	{
		element = driver.Instance.findElement(constants.contactSARL);
		return element;
	}
	
	/*
	 * @return Voice Call Button for Contact PCMO
	 */
	public static WebElement pcmoCallButton()
	{
		element = driver.Instance.findElement(constants.pcmoCallButton);
		return element;
	}
	
	/*
	 * @return Send Message Button for Contact PCMO
	 */
	public static WebElement pcmoSMSButton()
	{
		element = driver.Instance.findElement(constants.pcmoSMSButton);
		return element;
	}
	
	/*
	 * @return Voice Call Button for Contact SSM
	 */
	public static WebElement ssmCallButton()
	{
		element = driver.Instance.findElement(constants.ssmCallButton);
		return element;
	}
	
	/*
	 * @return Send Message Button for Contact SSM
	 */
	public static WebElement ssmSMSButton()
	{
		element = driver.Instance.findElement(constants.ssmSMSButton);
		return element;
	}
	
	/*
	 * @return Voice Call Button for Contact SARL
	 */
	public static WebElement sarlCallButton()
	{
		element = driver.Instance.findElement(constants.sarlCallButton);
		return element;
	}
	
	/*
	 * @return Send Message Button for Contact SARL
	 */
	public static WebElement sarlSMSButton()
	{
		element = driver.Instance.findElement(constants.sarlSMSButton);
		return element;
	}
	
	/*
	 * @return Text Box for Send Message
	 */
	public static WebElement smsBodyTextBox()
	{
		element = driver.Instance.findElement(constants.smsBodyTextBox);
		return element;
	}
	
	/*
	 * @return Send SMS Button
	 */
	public static WebElement sendSMSButton()
	{
		element = driver.Instance.findElement(constants.sendSMSButton);
		return element;
	}
}
