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
	 * @return Button to take to the second page of Get Help Now.
	 */
	public static WebElement toGetHelpPage2()
	{
		element = driver.Instance.findElement(constants.toGetHelpPage2);
		return element;
	}

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
	 * @return Voice Call Button for Contact PCMO.
	 */
	public static WebElement pcmoCallButton()
	{
		element = driver.Instance.findElement(constants.pcmoCallButton);
		return element;
	}
	
	/*
	 * @return Send Message Button for Contact PCMO.
	 */
	public static WebElement pcmoSMSButton()
	{
		element = driver.Instance.findElement(constants.pcmoSMSButton);
		return element;
	}
	
	/*
	 * @return Voice Call Button for Contact SSM.
	 */
	public static WebElement ssmCallButton()
	{
		element = driver.Instance.findElement(constants.ssmCallButton);
		return element;
	}
	
	/*
	 * @return Send Message Button for Contact SSM.
	 */
	public static WebElement ssmSMSButton()
	{
		element = driver.Instance.findElement(constants.ssmSMSButton);
		return element;
	}
	
	/*
	 * @return Voice Call Button for Contact SARL.
	 */
	public static WebElement sarlCallButton()
	{
		element = driver.Instance.findElement(constants.sarlCallButton);
		return element;
	}
	
	/*
	 * @return Send Message Button for Contact SARL.
	 */
	public static WebElement sarlSMSButton()
	{
		element = driver.Instance.findElement(constants.sarlSMSButton);
		return element;
	}
	
	/*
	 * @return Text Box for Send Message.
	 */
	public static WebElement smsBodyTextBox()
	{
		element = driver.Instance.findElement(constants.smsBodyTextBox);
		return element;
	}
	
	/*
	 * @return Send SMS Button.
	 */
	public static WebElement sendSMSButton()
	{
		element = driver.Instance.findElement(constants.sendSMSButton);
		return element;
	}
	
	/*
	 * @return Button for "PC Saves Anonymous Helpline" on the second page of Get Help Now.
	 */
	public static WebElement PCHelpline()
	{
		element = driver.Instance.findElement(constants.pcSavesAnonymousHelpline);
		return element;
	}
	
	/*
	 * @return Button for "Office of Victim Advocacy" on the second page of Get Help Now.
	 */
	public static WebElement officeOfVictimAdvocacy()
	{
		element = driver.Instance.findElement(constants.officeOfVictimAdvocacy);
		return element;
	}
	
	/*
	 * @return Button for "Office of Inspector General" on the second page of Get Help Now.
	 */
	public static WebElement officeOfInspectorGeneral()
	{
		element = driver.Instance.findElement(constants.officeOfInspectorGeneral);
		return element;
	}
	
	/*
	 * @return Button for "Office of Civil Rights and Diversity" on the second page of Get Help Now.
	 */
	public static WebElement officeOfCivilRightsAndDiversity()
	{
		element = driver.Instance.findElement(constants.officeOfCivilRightsAndDiversity);
		return element;
	}
	
	/*
	 * @return Button for "Contact Now" under PC Saves Anonymous Helpline.
	 */
	public static WebElement contactNowPCHelpline()
	{
		element = driver.Instance.findElement(constants.contactNowButtonPCSavesAnonymousHelpline);
		return element;
	}
	
	/*
	 * @return Button for "Contact Now" under Office of Victim Advocacy.
	 */
	public static WebElement contactNowButtonOfficeOfVictimAdvocacy()
	{
		element = driver.Instance.findElement(constants.contactNowButtonOfficeOfVictimAdvocacy);
		return element;
	}
	
	/*
	 * @return Button for "Contact Now" under Office of Inspector General.
	 */
	public static WebElement contactNowButtonOfficeOfInspectorGeneral()
	{
		element = driver.Instance.findElement(constants.contactNowButtonOfficeOfInspectorGeneral);
		return element;
	}
	
	/*
	 * @return Button for "Contact Now" under Office of Civil Rights and Diversity.
	 */
	public static WebElement contactNowButtonoOfficeOfCivilRightsAndDiversity()
	{
		element = driver.Instance.findElement(constants.contactNowButtonoOfficeOfCivilRightsAndDiversity);
		return element;
	}
	
	/*
	 * @return Button for "Voice Call" from the pop up that appears after Clicking on Contact Now.
	 */
	public static WebElement voiceCallButton()
	{
		element = driver.Instance.findElement(constants.voiceCallButton);
		return element;
	}
	
	/*
	 * @return Button for "Send Message" from the pop up that appears after Clicking on Contact Now.
	 */
	public static WebElement sendMessageButton()
	{
		element = driver.Instance.findElement(constants.sendMessageButton);
		return element;
	}
	
	/*
	 * @return Link to Learn More on PC Saves Anonymous Helpline.
	 */
	public static WebElement pcSavesLearnMoreLink()
	{
		element = driver.Instance.findElement(constants.pcSavesLearnMoreLink);
		return element;
	}
	
	/*
	 * @return Link to Email on Office of Victim Advocacy.
	 */
	public static WebElement officeOfVictimAdvocacyEmailLink()
	{
		element = driver.Instance.findElement(constants.officeOfVictimAdvocacyEmailLink);
		return element;
	}
	
	/*
	 * @return Link to Learn More on Office of Inspector General.
	 */
	public static WebElement officeOfInspectorGeneralLearnMoreLink()
	{
		element = driver.Instance.findElement(constants.officeOfInspectorGeneralLearnMoreLink);
		return element;
	}
	
	/*
	 * @return Link to Email on Office of Civil Rights and Diversity.
	 */
	public static WebElement officeOfCivilRightsAndDiversityEmailLink()
	{
		element = driver.Instance.findElement(constants.officeOfCivilRightsAndDiversityEmailLink);
		return element;
	}
	
}
