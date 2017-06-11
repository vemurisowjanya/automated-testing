package TestSuites;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import MeetupLocationAdminPageTests.AddNewMeetupTest;
import MeetupLocationAdminPageTests.DeleteMeetupTest;

/*
 * @author Anjali
 */

/*
 * This test suite will run all the tests in the package MeetupLocationAdminTests
 */
@RunWith(Suite.class)
@SuiteClasses({AddNewMeetupTest.class, DeleteMeetupTest.class})
public class AllMeetupLocationAdminPageTest
{

}
