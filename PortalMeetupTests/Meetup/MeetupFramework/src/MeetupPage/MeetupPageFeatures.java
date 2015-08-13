package MeetupPage;
import org.openqa.selenium.WebElement;
import WebDriver.Driver;
import WebElements.PageObjModel;

/*
 * @author Anjali
 */

public class MeetupPageFeatures 
{
    //Validates proper navigation to meetup page
	public static boolean CanGotoMeetupPage() 
	{
		//Goto Meetup Page
		Driver.Instance.get(PageObjModel.baseURL+"meetup/"+PageObjModel.meetupLocationSlug+"/"+PageObjModel.MeetupSlug+"/");
		WebElement MeetupName;
		MeetupName= Driver.Instance.findElement(PageObjModel.MeetupNameElement);
		//Validate
		if(MeetupName.getText().equals(PageObjModel.MeetupName))
			return true;
		else
			return false;
	}

}
