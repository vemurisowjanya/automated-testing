package MeetupLocationPageTests;
import static org.junit.Assert.*;
import junit.framework.Assert;
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
