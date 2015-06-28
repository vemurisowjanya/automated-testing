package HomePageFeaturesTests;
import org.junit.Assert;
import org.junit.Test;
import BaseTests.CommonTests;
import HomepageFeatures.Homepage;

/*
* @author Anjali
*/

public class SystersTechnicalInterestsReadMoreTest extends CommonTests
{
	/*
	 * Tests navigation to Systers Interest page by clicking on read more on homepage
	 */
	@Test
	public void test() 
	{
		//Validate
		Assert.assertEquals(true,Homepage.IsAtSystersTechnicalInitiativePage());
	}

}
