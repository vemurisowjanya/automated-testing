package MeetupLocationPageTests;
import junit.framework.Assert;
import org.junit.Test;
import BaseTests.CommonTest;
import MeetupLocationPageFeatures.MeetupLocationPage;

/*
 * @author Anjali
 */

/*
 * Checks navigation on clicking upcoming button on meetup location page.
 * This is a generic test which will be changed and implemented when the UI for meetup is complete
 */
public class UpcomingMeetupLocationTest extends CommonTest
{

	@Test
	public void test() 
	{
		Assert.assertEquals(true, MeetupLocationPage.IsAtUpcoming());
	}

}
