package TestSuites;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import CommunityAdminPageTests.*;

/*
 * @author Anjali
 */

/*
 * This test suite will run all the tests in the package CommunityAdminPageTests
 */
@RunWith(Suite.class)
@SuiteClasses({CommunityNewsActionsTest.class,CommunityNewsTest.class, CommunityPageActionsTest.class,
	           CommunityResourceActionsTest.class, CommunityResourcesTest.class, EditCommunityProfileTest.class,
	           JoinRequestActionTest.class, JoinRequestTest.class, ManageCommunityUsersTest.class, 
	           TransferCommunityOwnershipTest.class, ViewCommunityProfileTest.class})
public class AllCommunityAdminPageTest 
{

}
