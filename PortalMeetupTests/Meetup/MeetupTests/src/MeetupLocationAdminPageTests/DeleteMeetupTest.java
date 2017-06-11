package MeetupLocationAdminPageTests;
import org.junit.Assert;
import org.junit.Test;
import BaseTests.CommonTest;
import MeetupLocationAdminPageFeatures.MeetupLocationAdminPage;


/*
 * @author Anjali
 */

/*
 * Checks if the Meetup Location admin is able to delete an already created meetup for a chosen location. 
 *A meetup should be already there to be deleted
 */
public class DeleteMeetupTest extends CommonTest
{

	@Test
	public void test() 
	{
		//Slug for meetup to be deleted
		String MeetupSlug="dummySlug";
		Assert.assertEquals(true, MeetupLocationAdminPage.CanDeleteMeetup(MeetupSlug));
	}

}
