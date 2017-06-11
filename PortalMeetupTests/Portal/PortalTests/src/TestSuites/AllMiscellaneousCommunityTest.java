package TestSuites;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import MiscellaneousCommunityTests.*;

/*
 * @author Anjali
 */

/*
 * This test suite will run all the tests in the package MiscellaneousCommunityTests
 */
@RunWith(Suite.class)
@SuiteClasses({CommunityContentContributorTest.class, CommunityUserandContentManagerTest.class,
	           CommuntiyContentManagerTest.class, CommuntiyNoPermissionTest.class})
public class AllMiscellaneousCommunityTest
{

}
