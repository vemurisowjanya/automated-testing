package MeetupLocationsPage;
import org.openqa.selenium.WebElement;
import WebDriver.Driver;
import WebElements.PageObjModel;

/*
 * @author Anjali
 */

public class MeetupLocations
{

	//Validates navigation to Meetup locations page
	public static boolean IsAtMeetupLocationsPage()
	{
		Driver.Instance.get(PageObjModel.baseURL+"meetup/locations/");
		
		//Extracting page title
		WebElement MeetupLocationsPageTitle= Driver.Instance.findElement(PageObjModel.MeetupLocationsTitle);
		String Title= MeetupLocationsPageTitle.getText();
		
		WebElement Map= Driver.Instance.findElement(PageObjModel.Map);
		
		//Validate
		if(Title.equals("Systers Meetup Locations") && Map.getText().startsWith("Terms of Use"))
			return true;
		else
			return false;
	}

	public static boolean CanChooseLocation()
	{
		//Goto Meetup Locations
		Driver.Instance.get(PageObjModel.baseURL+"meetup/locations/");
		
		//Choose Location
		WebElement ChooseLocation= Driver.Instance.findElement(PageObjModel.SelectLocation);
		String MeetupLocName= ChooseLocation.getText();
		ChooseLocation.click();
		
		//Title on the selected meetup location page
		WebElement MeetupLocTitle= Driver.Instance.findElement(PageObjModel.MeetupLocTitle);
		String Title= MeetupLocTitle.getText();
		
		//Validate
		if(MeetupLocName.equals(Title))
			return true;
		else
			return false;
	}

}
