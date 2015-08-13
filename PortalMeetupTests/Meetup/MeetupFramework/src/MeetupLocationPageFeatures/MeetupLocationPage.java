package MeetupLocationPageFeatures;
import org.openqa.selenium.WebElement;

import MeetupLocationPageFeatures.MeetupLocationAdminLogin;
import WebDriver.Driver;
import WebElements.PageObjModel;

/*
 * @author Anjali
 */

/*
 * To be edited according to the UI later
 */
public class MeetupLocationPage extends MeetupLocationAdminLogin
{
	
	//Takes to the meetup location page
	public static void GotoMeetupLocationPage()
	{
		//Meetup Locations Page
		Driver.Instance.get(PageObjModel.baseURL+"meetup/locations/");
		
		//Select Meetup Location and goto that location page
		WebElement ChooseLocation= Driver.Instance.findElement(PageObjModel.SelectLocation);
		ChooseLocation.click();
	}

	//Validates About
	public static boolean IsAtAbout() 
	{
		//Login and goto Meetup location
		AdminLogin();
		GotoMeetupLocationPage();
		
		//Click on About
		WebElement About= Driver.Instance.findElement(PageObjModel.MeetupLocAbout);
		About.click();
		
		//Extract About title
		WebElement AboutTitle= Driver.Instance.findElement(PageObjModel.MeetupLocAboutTitle);
		String Title= AboutTitle.getText();
		
		//Validate URL and tile 
		if((Driver.Instance.getCurrentUrl()).equals(PageObjModel.baseURL+"meetup/"+PageObjModel.meetupLocationSlug+"/about/")
			&& Title.equals("About"))
			return true;
		else
			return false;
		
	}

	public static boolean IsAtUpcoming() 
	{
		//Login and goto Meetup location
		AdminLogin();
		GotoMeetupLocationPage();
		
		//Click on upcoming
		WebElement Upcoming= Driver.Instance.findElement(PageObjModel.MeetupLocUpcoming);
		Upcoming.click();
		
		//Validate
		/*
		 * Change after UI is complete
		 */
		if((Driver.Instance.getCurrentUrl()).equals(PageObjModel.baseURL+"meetup/"+PageObjModel.meetupLocationSlug+"/upcoming/"))
			return true;
		else
			return false;
	}

	public static boolean IsAtMembers() 
	{
		//Login and goto Meetup location
		AdminLogin();
		GotoMeetupLocationPage();
		
		Driver.Instance.get(PageObjModel.baseURL+"meetup/"+PageObjModel.meetupLocationSlug+"/members/");
		
		//Click on members
		//WebElement Members= Driver.Instance.findElement(PageObjModel.MeetupLocMembers);
		//Members.click();
		
		//Extracting Texts
		WebElement Members, Organizers;
		Members= Driver.Instance.findElement(PageObjModel.Members);
		Organizers= Driver.Instance.findElement(PageObjModel.Organizers);
		
		String chk1, chk2;
		chk1= Members.getText();
		chk2= Organizers.getText();
		
		//Validate
		if(chk1.equals("Members") && chk2.equals("Organizers"))
			return true;
		else
			return false;
	}

	public static boolean IsAtSponsors() 
	{
		//Login and goto Meetup location
		AdminLogin();
		GotoMeetupLocationPage();
			
		//Click on sponsors
		WebElement Sponsors= Driver.Instance.findElement(PageObjModel.MeetupLocSponsors);
		Sponsors.click();
				
		//Validate
		/*
		 *  Change after UI is complete
		 */
		if((Driver.Instance.getCurrentUrl()).equals(PageObjModel.baseURL+"meetup/"+PageObjModel.meetupLocationSlug+"/sponsors/"))
			return true;
		else
			return false;
		
	}
}
