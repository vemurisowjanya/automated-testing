package CommunityAdminPageTests;
import org.junit.Assert;
import org.junit.Test;
import BaseTests.CommonTests;
import CommunityAdminPageFeatures.CommunityTransferOwnership;

/*
* @author Anjali
*/
/*
 * Checks if the community admin is able to transfer community ownership to other existing community member.
 For this test to pass there should be atleast one member in the community
 */
public class TransferCommunityOwnershipTest extends CommonTests
{

	@Test
	public void test() 
	{
		Assert.assertEquals(true, CommunityTransferOwnership.CanTransferOwnership());
	}

}
