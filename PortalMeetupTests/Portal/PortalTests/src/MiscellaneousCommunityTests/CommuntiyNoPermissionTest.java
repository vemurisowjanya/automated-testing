package MiscellaneousCommunityTests;
import org.junit.Assert;
import org.junit.Test;
import BaseTests.CommonTests;
import MiscellaneousCommunityFeatures.MiscellaneousCommunity;

/*
* @author Anjali
*/

/*
 * Checks if a Community's user with no permission has no permission.
 */
public class CommuntiyNoPermissionTest extends CommonTests
{

	@Test
	public void test() 
	{
		Assert.assertEquals(true, MiscellaneousCommunity.UserHasNoPermission());
	}

}
