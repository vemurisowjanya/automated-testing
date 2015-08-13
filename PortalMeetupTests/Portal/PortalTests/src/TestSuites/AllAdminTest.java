package TestSuites;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import AdminTests.*;


/*
 * @author Anjali
 */

/*
 * This test suite will run all the tests in the package AdminTests
 */
@RunWith(Suite.class)
@SuiteClasses({CanChangePasswordTest.class, CanCreateCommunityProposalTest.class, CanEditTest.class,
	           CanGotoAdminPanelTest.class, CanViewProfileTest.class})
public class AllAdminTest 
{

}
