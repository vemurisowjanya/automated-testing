package HomePageFeaturesTests;
import org.junit.Assert;
import org.junit.Test;
import BaseTests.CommonTests;
import HomepageFeatures.Homepage;

/*
* @author Anjali
*/

public class SysterInitiativesReadMoreTest extends CommonTests
{

	/*
	 * Tests navigation to Systers Initiative page by clicking on read more on homepage
	 */
	@Test
	public void test() 
	{
		//Validate
		Assert.assertEquals("Failed",true,Homepage.IsAtSystersInitiativesPage());
	}

}
