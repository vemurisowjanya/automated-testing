package MeetupLocationAdminPageTests;
import org.junit.Assert;
import org.junit.Test;
import BaseTests.CommonTest;
import MeetupLocationAdminPageFeatures.MeetupLocationAdminPage;

/*
 * @author Anjali
 */

/*
 * Checks if the Meetup Location admin is able to create a new meetup for that location. 
 */
public class AddNewMeetupTest extends CommonTest
{

	@Test
	public void test()
	{
		//Date should be current date or any later date
		String Title="dummyTitle", Slug="dummySlug" , Date="2015-08-30", Time="06:30", Venue="dummyVenue", Description="abc";
		Assert.assertEquals(true, MeetupLocationAdminPage.CanAddNewMeetup(Title, Slug, Date, Time, Venue, Description));
	}

}
