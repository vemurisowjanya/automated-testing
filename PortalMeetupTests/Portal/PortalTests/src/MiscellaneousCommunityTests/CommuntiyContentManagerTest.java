package MiscellaneousCommunityTests;
import org.junit.Assert;
import org.junit.Test;
import BaseTests.CommonTests;
import MiscellaneousCommunityFeatures.MiscellaneousCommunity;

/*
* @author Anjali
*/

/*
 * Checks if a Community's Content Manager has the specified permission.
 */
public class CommuntiyContentManagerTest extends CommonTests
{

	@Test
	public void test() 
	{
		Assert.assertEquals(true, MiscellaneousCommunity.IsCommuntiyContentManagerTest());
	}

}
