package PortalUserTests;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import BaseTests.CommonTests;
import PortalUsersFeatures.PortalUser;

/*
* @author Anjali
*/

/*
 * Checks if a registered user is able to send first join request to a dummy community already created 
 * and then can cancel the request.
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JoinRequestTest extends CommonTests
{

	@Test
	public void A_SendRequest() 
	{
		Assert.assertEquals(true,PortalUser.CanSendJoinRequest());
	}
	
	@Test
	public void B_CancelRequest()
	{
		Assert.assertEquals(true,PortalUser.CanCancelJoinRequest());
	}

}
