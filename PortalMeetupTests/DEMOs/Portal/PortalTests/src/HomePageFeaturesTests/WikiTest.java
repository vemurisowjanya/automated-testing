package HomePageFeaturesTests;
import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import BaseTests.CommonTests;
import HomepageFeatures.Homepage;

/*
* @author Anjali
*/

/*
 * Checks the navigation by clicking wiki on homepage
 */
public class WikiTest extends CommonTests
{

	@Test
	public void test()
	{
		Assert.assertEquals("Failed", true, Homepage.IsAtWiki());
	}

}
