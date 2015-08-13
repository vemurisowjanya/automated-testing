package CommunityAdminPageTests;
import org.junit.Assert;
import org.junit.Test;
import BaseTests.CommonTests;
import CommunityAdminPageFeatures.CommunityManageUsers;

/*
 * @author Anjali
 */

/*
 * Verifies whether the community admin is able to manage community users by changing current permission.
 */
public class ManageCommunityUsersTest extends CommonTests
{

	@Test
	public void test() 
	{
		Assert.assertEquals(true, CommunityManageUsers.CanManage());
	}

}
