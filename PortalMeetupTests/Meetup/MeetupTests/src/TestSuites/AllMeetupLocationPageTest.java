package TestSuites;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import MeetupLocationPageTests.AboutMeetupLocationTest;
import MeetupLocationPageTests.MembersMeetupLocationTest;
/*
 * @author Anjali
 */

/*
 * This test suite will run all the tests in the package MeetupLocationPageTests
 */
@RunWith(Suite.class)
@SuiteClasses({AboutMeetupLocationTest.class,MembersMeetupLocationTest.class})
public class AllMeetupLocationPageTest 
{

}
