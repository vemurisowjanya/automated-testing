package CommunityAdminPageTests;
import org.junit.Assert;
import org.junit.Test;
import BaseTests.CommonTests;
import CommunityAdminPageFeatures.CommunityAdminPage;

/*
 * @author Anjali
 */


/*
 * Checks navigation on clicking view community profile as an admin
 */
public class ViewCommunityProfileTest extends CommonTests
{

	@Test
	public void test() 
	{
		Assert.assertEquals(true, CommunityAdminPage.IsAtCommunityProfile());
	}

}
