package MeetupLocationPageTests;
import org.junit.Assert;
import org.junit.Test;
import BaseTests.CommonTest;
import MeetupLocationPageFeatures.MeetupLocationPage;

/*
 * @author Anjali
 */

/*
 * A meetup location should be added prior to this test.
 * Checks navigation on clicking about button on meetup location page
 */
public class AboutMeetupLocationTest extends CommonTest
{

	@Test
	public void test()
	{
		Assert.assertEquals(true, MeetupLocationPage.IsAtAbout());
	}

}
