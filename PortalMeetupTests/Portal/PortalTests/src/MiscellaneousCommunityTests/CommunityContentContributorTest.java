package MiscellaneousCommunityTests;
import org.junit.Assert;
import org.junit.Test;
import BaseTests.CommonTests;
import MiscellaneousCommunityFeatures.MiscellaneousCommunity;

/*
* @author Anjali
*/

/*
 * Checks if a Community's Content Contributor has the specified permission.
 */
public class CommunityContentContributorTest extends CommonTests
{

	@Test
	public void test()
	{
		Assert.assertEquals(true, MiscellaneousCommunity.IsCommunityContentContributor());
	}

}
