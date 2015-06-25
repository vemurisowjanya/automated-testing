package HomePageFeaturesTests;
import junit.framework.Assert;
import org.junit.Test;
import BaseTests.CommonTests;
import HomepageFeatures.Homepage;

/*
* @author Anjali
*/

/*
 * Checks the navigation by clicking about us  homepage by validating against Url and title on that page
 */
public class AboutUsTest extends CommonTests
{

	@Test
	public void test() 
	{
		Assert.assertEquals(true,Homepage.IsAtAboutUs());
	}

}
