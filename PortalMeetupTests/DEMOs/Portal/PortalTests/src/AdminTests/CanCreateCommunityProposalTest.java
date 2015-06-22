package AdminTests;
import junit.framework.Assert;
import org.junit.Test;
import AdminFeatures.AdminLogin;
import AdminFeatures.CommunityFormCheck;
import BaseTests.CommonTests;

/*
* @author Anjali
*/

public class CanCreateCommunityProposalTest extends CommonTests
{
  
	/*
	 * Tests navigation to Community Proposal form after login in as admin and clicking on new community
	 */
	@Test
	public void test() 
	{
		//Log in
		AdminLogin.login();
		
		//Validate 
		Assert.assertEquals("Failed",true,CommunityFormCheck.IsForm());
	}
	
}
