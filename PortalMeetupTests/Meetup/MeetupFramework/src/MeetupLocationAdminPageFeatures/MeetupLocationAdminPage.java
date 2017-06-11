package MeetupLocationAdminPageFeatures;
import org.openqa.selenium.WebElement;
import MeetupLocationPageFeatures.MeetupLocationAdminLogin;
import WebDriver.Driver;
import WebElements.PageObjModel;

/*
 * @author Anjali
 */

public class MeetupLocationAdminPage 
{
	//Take to a chosen Meetup location page
	public static void GotoMeetupLocationPage()
	{
		MeetupLocationAdminLogin.AdminLogin();
		//Choose Meetup Locations from homepage
	    WebElement MeetupLocations= Driver.Instance.findElement(PageObjModel.MeetupLocations);
	    
	    //Click 
	    MeetupLocations.click();
	    
		//Select Meetup Location and goto that location page
		WebElement ChooseLocation= Driver.Instance.findElement(PageObjModel.SelectLocation);
		ChooseLocation.click();
	}

    //Validate addition of a new meetup by the meetup location admin.
	public static boolean CanAddNewMeetup(String title, String slug, String date, String time, String venue, String description) 
	{
		GotoMeetupLocationPage();
		
		//Choose Add Meetup from side bar
		WebElement AddMeetup= Driver.Instance.findElement(PageObjModel.AddNewMeetup);
		AddMeetup.click();
		
		WebElement Title, Slug , Date, Time, Venue, Description, Submit;
		
		//Fill details
		Title= Driver.Instance.findElement(PageObjModel.NewMeetupTitle);
		Title.sendKeys(title);
		
		Slug= Driver.Instance.findElement(PageObjModel.NewMeetupSlug);
		Slug.sendKeys(slug);
		
		Date= Driver.Instance.findElement(PageObjModel.NewMeetupDate);
		Date.sendKeys(date);
		
		Time= Driver.Instance.findElement(PageObjModel.NewMeetupTime);
		Time.sendKeys(time);
		
		Venue= Driver.Instance.findElement(PageObjModel.NewMeetupVenue);
		Venue.sendKeys(venue);
		
		//Switch to Description frame and enter description
		Description= Driver.Instance.findElement(PageObjModel.NewMeetupDescription);
		Driver.Instance.switchTo().frame(Description);
	    Driver.Instance.switchTo().activeElement().sendKeys(description);
	    Driver.Instance.switchTo().defaultContent();
		 
	    //Click submit
	    Submit= Driver.Instance.findElement(PageObjModel.NewMeetupSubmit);
	    Submit.click();
	    
	    //Title of New Meetup page
	    String MeetupTitle= Driver.Instance.findElement(PageObjModel.NewMeetupHeading).getText();
	   
	    //Validate creation
	    if(MeetupTitle.equals(title) && Driver.Instance.getCurrentUrl().equals(PageObjModel.baseURL+"meetup/"+PageObjModel.meetupLocationSlug+"/"+slug+"/"))
	    	return true;
	    else 
	    	return false;
	}

    //Validate deletion of an already existing meetup by the meetup location admin.
	public static boolean CanDeleteMeetup(String meetupSlug) 
	{
		GotoMeetupLocationPage();
		
		//Goto the delete Page
		Driver.Instance.get(PageObjModel.baseURL+"meetup/"+PageObjModel.meetupLocationSlug+"/"+meetupSlug+"/delete/");
		
		//Click on delete
		WebElement Delete= Driver.Instance.findElement(PageObjModel.DeleteMeetup);
		Delete.click();
		
		//Validate delete
		if(Driver.Instance.getCurrentUrl().equals(PageObjModel.baseURL+"meetup/"+PageObjModel.meetupLocationSlug+"/about/"))
			return true;
		else
			return false;
	}

}
