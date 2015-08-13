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
	
	/*
	 * Change
	 */
	public static By MeetupLocations= By.xpath("");
	
	//LoginPage
	public static By username= By.id("id_login");
	public static By password= By.id("id_password");
	public static By SignIn= By.xpath("//button[@type='submit']");


	//Meetup Locations
	public static By MeetupLocationsTitle= By.xpath("html/body/div[2]/h2");
	public static By Map= By.xpath(".//*[@id='map-canvas']");
	//public static By Map= By.xpath("/html/body/div[2]/div[1]/div/div/div[2]");
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
	
	/*
	 * To be changed after UI is complete
	 */

	public static By AddNewMeetup= By.linkText("Add New Meetup");
	public static By AddNewMember= By.linkText("Add New Member");
	public static By RemoveMembers= By.linkText("Remove Members");
	public static By ShowJoinRequests= By.linkText("Show Join Requests");
	
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