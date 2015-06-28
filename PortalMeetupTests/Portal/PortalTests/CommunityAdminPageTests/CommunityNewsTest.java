package CommunityAdminPageTests;
import junit.framework.Assert;
import org.junit.Test;
import BaseTests.CommonTests;
import CommunityAdminPageFeatures.CommunityAdminPage;

/*
 * @author Anjali
 */

/*
 * Checks navigation on clicking new button on a community page
 */
public class CommunityNewsTest extends CommonTests
{

	@Test
	public void test()
	{
		Assert.assertEquals(true , CommunityAdminPage.IsAtNews());
	}

}
