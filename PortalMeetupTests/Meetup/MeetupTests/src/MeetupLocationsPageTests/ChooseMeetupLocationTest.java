package MeetupLocationsPageTests;
import org.junit.Assert;
import org.junit.Test;
import BaseTests.CommonTest;
import MeetupLocationsPage.MeetupLocations;

/*
 * @author Anjali
 */

/*
 * Validates choosing a selecting a location from Meetup locations page
 */
public class ChooseMeetupLocationTest extends CommonTest
{

	@Test
	public void test() 
	{
		Assert.assertEquals(true, MeetupLocations.CanChooseLocation());
	}
}
