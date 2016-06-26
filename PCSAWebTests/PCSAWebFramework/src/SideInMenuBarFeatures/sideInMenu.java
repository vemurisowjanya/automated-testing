/*
 * @author Anjali
 * @since 2016-06-26
 * This class validates test steps for Side in Menu Bar.
 */
package SideInMenuBarFeatures;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import LoginAndRegistration.existingUserLogin;
import Logs.log4j;
import PageObjectModel.constants;
import PageObjectModel.policiesAndGlossaryElements;
import PageObjectModel.safetyToolsElements;
import PageObjectModel.sexualAssaultAwarenessElements;
import PageObjectModel.sideInMenuBarElements;
import PageObjectModel.supportServicesElements;
import WebDriver.driver;

public class sideInMenu 
{
	private static String pageTitle;
	/*
	 * Takes to the Welcome Page.
	 */
	public static void gotoWelcomePage()
	{
		log4j.Log.info("Navigating to Welcome page");
		existingUserLogin.login();
	}
	
	/*
	 * @return true if the user is at the Welcome Page after login else false
	 */
	public static boolean isAtWelcome()
	{
		if(driver.Instance.getCurrentUrl().contains(constants.baseURL+"welcome.php"))
		{
			System.out.println("inside check");
			return true;
		}
		
		return false;
	}

	/*
	 * @return true if the user is able to successfully navigate after clicking on "FirstAide" on the side in menu 
	 */
	public static boolean canNavigateToFirstAide() 
	{
		if(isAtWelcome())
		{
			WebElement firstAideTab = sideInMenuBarElements.firstAideTab();
			WebElement title = driver.Instance.findElement(constants.welcomeTtile);
			pageTitle = title.getText();
			firstAideTab.click();
			if(pageTitle.contains(constants.pageTitleWelcome)&& driver.Instance.getCurrentUrl().contains(constants.baseURL+"welcome.php"))
			{
				return true;
			}
		}
		return false;
	}

	/*
	 * @return true if the user is able to successfully navigate after clicking on "Circle of Trust" on the side in menu 
	 */
	public static boolean canNavigateToCircleOfTrust() 
	{
		WebElement circleOfTrustTab = sideInMenuBarElements.circleOfTrustTab();
		circleOfTrustTab.click();
		
		//TBA validation steps
		return true;
	}

	/*
	 * @return true if the user is able to successfully navigate after clicking on "Safety Tools" on the side in menu 
	 */
	public static boolean canNavigateToSafetyTools() 
	{
		WebElement safetyToolsTab = sideInMenuBarElements.safetyToolsTab();
		safetyToolsTab.click();
		
		if(isAtWelcome())
		{
			//checks if the safety tools menu become visible after clicking on "Safety Tools"
			 try 
			 {
			        WebElement safetyToolsMainTab = safetyToolsElements.safetyToolsMainTab();
			        System.out.println("Element Present");
			    
			 } 
			 catch (NoSuchElementException e) 
			 {
			        return false;
			 }
			    return true;
		}
		
		else
		{
			return false;
		}
	
	}

	/*
	 * @return true if the user is able to successfully navigate after clicking on "Support Services" on the side in menu 
	 */
	public static boolean canNavigateToSupportServices() 
	{
		WebElement supportServicesTab = sideInMenuBarElements.supportServicesTab();
		supportServicesTab.click();
		
		if(isAtWelcome())
		{
			//checks if the support services menu become visible after clicking on "Support Services"
			 try 
			 {
			        WebElement supportServicesMainTab = supportServicesElements.supportServicesMainTab();
			        System.out.println("Element Present");
			    
			 } 
			 catch (NoSuchElementException e) 
			 {
			        return false;
			 }
			    return true;
		}
		
		else
		{
			return false;
		}
	
	}

	/*
	 * @return true if the user is able to successfully navigate after clicking on "Sexual Assault Awareness" on the side in menu 
	 */
	public static boolean canNavigateToSexualAssualtAwareness() 
	{
		WebElement sexualAssaultAwarenesstTab = sideInMenuBarElements.sexualAssaultAwarenesstTab();
		sexualAssaultAwarenesstTab.click();
		
		if(isAtWelcome())
		{
			//checks if the sexual assault awareness menu become visible after clicking on "Sexual Assault Awareness"
			 try 
			 {
			        WebElement sexualAssaultMainTab = sexualAssaultAwarenessElements.sexualAssaultMainTab();
			        System.out.println("Element Present");
			    
			 } 
			 catch (NoSuchElementException e) 
			 {
			        return false;
			 }
			    return true;
		}
		
		else
		{
			return false;
		}
	}

	/*
	 * @return true if the user is able to successfully navigate after clicking on "Policies and Glossary" on the side in menu 
	 */
	public static boolean canNavigateToPoliciesAndGlossary()
	{
		WebElement policiesAndGlossaryTab = sideInMenuBarElements.policiesAndGlossaryTab();
		policiesAndGlossaryTab.click();
		
		if(isAtWelcome())
		{
			//checks if the policies and glossary menu become visible after clicking on "Policies and Glossary"
			 try 
			 {
			        WebElement policySummarySheetTab = policiesAndGlossaryElements.policySummarySheetTab();
			        System.out.println("Element Present");
			    
			 } 
			 catch (NoSuchElementException e) 
			 {
			        return false;
			 }
			    return true;
		}
		
		else
		{
			return false;
		}
	}
}
