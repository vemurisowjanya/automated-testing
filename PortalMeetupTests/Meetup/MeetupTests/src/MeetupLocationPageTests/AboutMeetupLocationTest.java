package MeetupLocationPageTests;
import org.junit.Assert;
import org.junit.Test;
import BaseTests.CommonTest;
import MeetupLocationPageFeatures.MeetupLocationPage;

/*
 * @author Anjali
 */

/*
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
