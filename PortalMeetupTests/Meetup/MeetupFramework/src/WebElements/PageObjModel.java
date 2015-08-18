package WebElements;
import org.openqa.selenium.By;
/*
 * @author Anjali
 */

/*
 * Keeps track of different WebElements used in the program
 */
public class PageObjModel 
{

	public static String baseURL="http://127.0.0.1:8000/";
	
	
	//Homepage
	public static By Login= By.xpath("html/body/div[1]/div/div[2]/ul[2]/li[2]/a");
	public static By MeetupLocations= By.xpath("html/body/div[1]/div/div[2]/ul[1]/li[3]/a");
	
	
	//LoginPage
	public static By username= By.id("id_login");
	public static By password= By.id("id_password");
	public static By SignIn= By.xpath("//button[@type='submit']");


	//Meetup Locations
	public static By MeetupLocationsTitle= By.xpath("html/body/div[2]/h2");
	public static By Map= By.xpath(".//*[@id='map-canvas']");
	public static By SelectLocation= By.xpath("html/body/div[2]/div[2]/div[1]/a");
	
	//Meetup Location
	public static By MeetupLocTitle= By.xpath("html/body/div[2]/div[2]/div[1]/h1");
	public static String meetupLocationSlug="delhi";
	public static By MeetupLocAbout= By.xpath("html/body/div[2]/div[2]/div[3]/div[2]/a");
	public static By MeetupLocAboutTitle= By.xpath("html/body/div[2]/div[2]/div[2]/div/h3");
	
	/*
	 * To be changed after UI is complete
	 */
	public static By MeetupLocUpcoming= By.linkText("Upcoming");
	public static By MeetupLocPast= By.linkText("Past");
	public static By MeetupLocMembers= By.linkText("Members");
	public static By MeetupLocSponsors= By.linkText("Sponsors");
	
	//Meetup Location Actions
	
	//Add new Meetup
	public static By AddNewMeetup= By.xpath("html/body/div[2]/div[2]/div[3]/div[1]/ol/li[1]/a");
	public static By NewMeetupTitle= By.xpath(".//*[@id='id_title']");
	public static By NewMeetupSlug= By.id("id_slug");
	public static By NewMeetupDate= By.xpath(".//*[@id='id_date']");
	public static By NewMeetupTime= By.xpath(".//*[@id='id_time']");
	public static By NewMeetupVenue= By.xpath(".//*[@id='id_venue']");
	public static By NewMeetupDescription= By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/div[2]/div/form/div[6]/div/div/div/div/div/iframe");
	public static By NewMeetupSubmit= By.xpath(".//*[@id='submit-id-save']");
	public static By NewMeetupHeading= By.xpath("html/body/div[2]/div[2]/div[2]/h2");
	
	//Delete Meetup
	public static By DeleteMeetup= By.xpath("html/body/div[2]/div[2]/div[2]/div[2]/div[2]/form/input[2]");
	
	//Meetup Members Page
	public static By Members= By.xpath("html/body/div[2]/div[2]/div[2]/div/div[2]/h2");
	public static By Organizers= By.xpath("html/body/div[2]/div[2]/div[2]/div/div[1]/h2");
	
	//Meetup page
	public static String MeetupSlug="meetupdelhi";
	public static By MeetupTitle= By.xpath("html/body/div[2]/div[2]/div[2]/h2");
	public static By MeetupNameElement= By.xpath("html/body/div[2]/div[2]/div[2]/h2");
	public static String MeetupName= "MeetupDelhi";
	public static By MeetupDate= By.xpath("html/body/div[2]/div[2]/div[2]/div/p[1]/b[1]");
	public static By MeetupTime= By.xpath("html/body/div[2]/div[2]/div[2]/div/p[1]/b[2]");
	
}