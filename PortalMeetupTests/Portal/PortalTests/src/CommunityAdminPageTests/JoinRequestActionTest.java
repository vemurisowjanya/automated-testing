package CommunityAdminPageTests;
import org.junit.Assert;
import org.junit.Test;
import BaseTests.CommonTests;
import CommunityAdminPageFeatures.CommunityAdminJoinRequestActions;

/*
 * @author Anjali
 */

/*
 * Verifies whether the admin is able to take action(approve/reject) on the join requests.
 * One will fail, one will pass as a request cannot be rejected as well as accepted. 
 * Depends on the sequence of execution of tests.
 */
public class JoinRequestActionTest extends CommonTests
{

	//Tests approval
	@Test
	public void ApproveRequest() 
	{
		Assert.assertEquals(true, CommunityAdminJoinRequestActions.CanApproveRequest());
	}

	//Tests reject
	@Test
	public void RejectRequest() 
	{
		Assert.assertEquals(true, CommunityAdminJoinRequestActions.CanRejectRequest());
	}
}
