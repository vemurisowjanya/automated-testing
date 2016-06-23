/*
 * @author Anjali
 * @since 2016-06-22
 * This class maintains validation steps carried out for Get Help Now Feature.
 */
package GetHelpNowFeatures;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import LoginAndRegistration.existingUserLogin;
import PageObjectModel.constants;
import PageObjectModel.getHelpNowPageElements;
import PageObjectModel.sideInMenuBarElements;
import WebDriver.driver;

public class getHelpNow 
{
	private static String URL;
	public static void gotoGetHelp()
	{
		existingUserLogin.login();
		WebElement getHelpTab = sideInMenuBarElements.getHelpNowTab();
		getHelpTab.click();
	}

	/*
	 * Checks if the user is at Get Help Now
	 */
	public static boolean isAtGetHelpNow() 
	{
		URL = driver.Instance.getCurrentUrl();
		WebElement gethelpPageTitle = getHelpNowPageElements.gethelpPageTitle();
		if(URL.contains(constants.baseURL+"getHelpNow.html")&& gethelpPageTitle.getText().contains(constants.getHelpTitle))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	/*
	 * Checks if the user is able to select the country from the dropdown
	 */
	public static boolean canSelectCountry() 
	{
		WebElement changeLocationDropdown = getHelpNowPageElements.changeLocationDropdown();
		WebElement chooseLocationText = getHelpNowPageElements.chooseLocationText();
		String countryArr[] = {"Syria","Uganda","Tunisia"};
		Select country = new Select(changeLocationDropdown);
		//get all the option from the dropdown
		List<WebElement> optionCount = country.getOptions();
		String s="";
		//iterate through all the option
		for(int i= 0;i<optionCount.size();i++)
		{
			country.selectByIndex(i);
			s = optionCount.get(i).getText();
			if(!(s.equals(countryArr[i]))||!(chooseLocationText.getText().contains(optionCount.get(i).getText())))
			{
				System.out.println("inside");
				return false;
			}
			System.out.println(s);
			System.out.println(chooseLocationText.getText());
		}
		
		return true;
	}
	
	
}
