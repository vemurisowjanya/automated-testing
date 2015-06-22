package HomePageFeaturesTests;
import junit.framework.Assert;
import org.junit.Test;
import BaseTests.CommonTests;
import HomepageFeatures.Homepage;

/*
* @author Anjali
*/

/*
 * Checks proper navigation on clicking Join Systers button to sign up page. Sign up feature tested in SignUpTest.
 */
public class JoinSysters_Test extends CommonTests
{

	@Test
	public void test() 
	{
		Assert.assertEquals(true, Homepage.IsAtJoinSysters());
		
	}

}
