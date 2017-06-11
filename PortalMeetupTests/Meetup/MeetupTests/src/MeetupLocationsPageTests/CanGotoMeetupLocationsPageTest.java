package MeetupLocationsPageTests;
import org.junit.Assert;
import org.junit.Test;
import BaseTests.CommonTest;
import MeetupLocationsPage.MeetupLocations;

/*
 * @author Anjali
 */

/*
 * Checks navigation to Meetup locations page where all the Meetup locations are listed.
 */
public class CanGotoMeetupLocationsPageTest extends CommonTest
{

	@Test
	public void test() 
	{
		Assert.assertEquals(true, MeetupLocations.IsAtMeetupLocationsPage());
	}

}
