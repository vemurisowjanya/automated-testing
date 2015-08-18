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
		//Choose Meetup Locations from homepage
	    WebElement MeetupLocations= Driver.Instance.findElement(PageObjModel.MeetupLocations);
	    
	    //Click 
	    MeetupLocations.click();
		
		//Extracting page title
		WebElement MeetupLocationsPageTitle= Driver.Instance.findElement(PageObjModel.MeetupLocationsTitle);
		String Title= MeetupLocationsPageTitle.getText();
		
		WebElement Map= Driver.Instance.findElement(PageObjModel.Map);
		
		//Validate
		if(Title.equals("Systers Meetup Locations") && Map.getText().startsWith("Terms of Use")
				&& Driver.Instance.getCurrentUrl().equals(PageObjModel.baseURL+"meetup/locations/"))
			return true;
		else
			return false;
	}

	public static boolean CanChooseLocation()
	{
		//Choose Meetup Locations from homepage
	    WebElement MeetupLocations= Driver.Instance.findElement(PageObjModel.MeetupLocations);
	    
	    //Click 
	    MeetupLocations.click();
		
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
