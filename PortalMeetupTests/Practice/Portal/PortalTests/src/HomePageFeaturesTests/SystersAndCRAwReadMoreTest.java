package HomePageFeaturesTests;
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
import BaseTests.CommonTests;
import HomepageFeatures.Homepage;

/*
* @author Anjali
*/


public class SystersAndCRAwReadMoreTest extends CommonTests
{
	/*
	 * Tests navigation to Systers CRAW page by clicking on read more on homepage
	 */
	@Test
	public void test() 
	{
		//Validate
		Assert.assertEquals("Failed",true,Homepage.IsAtSystersCRAWPage());
	}

}
