package TestSuites;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import MeetupPageTests.GotoMeetupPageTest;

/*
 * @author Anjali
 */

/*
 * This test suite will run all the tests in the package MeetupPageTests
 */
@RunWith(Suite.class)
@SuiteClasses({GotoMeetupPageTest.class})
public class AllMeetupPageTest 
{

}
