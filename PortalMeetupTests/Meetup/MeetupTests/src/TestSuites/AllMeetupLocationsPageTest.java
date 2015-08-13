package TestSuites;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import MeetupLocationsPageTests.CanGotoMeetupLocationsPageTest;
import MeetupLocationsPageTests.ChooseMeetupLocationTest;

/*
 * @author Anjali
 */

/*
 * This test suite will run all the tests in the package MeetupLocationsPageTests
 */
@RunWith(Suite.class)
@SuiteClasses({CanGotoMeetupLocationsPageTest.class, ChooseMeetupLocationTest.class})
public class AllMeetupLocationsPageTest 
{

}
