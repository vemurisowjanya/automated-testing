package WebElements;
import org.openqa.selenium.By;

/*
 * @author Anjali
 */

/*
 * Keeps track of different WebElement used in the program
 */
public class PageObjModel 
{

	public static String baseURL="http://127.0.0.1:8000/";
	
	
	//Homepage
	public static By Login=By.xpath("html/body/div[1]/div/div[2]/ul[2]/li[2]/a");
	
	//LoginPage
	public static By username=By.id("id_login");
	public static By password=By.id("id_password");
	public static By SignIn=By.xpath("//button[@type='submit']");


	//Meetup Location
	public static String meetupLocationSlug="dummySlug";
	public static By MeetupLocAbout= By.linkText("About");
	
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
}
