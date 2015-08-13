package TestSuites;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import LoginTests.*;

/*
 * @author Anjali
 */

/*
 * This test suite will run all the tests in the package LoginTests
 */
@RunWith(Suite.class)
@SuiteClasses({FacebookLoginTest.class, GithubLoginTest.class, GoogleLoginTest.class,
	           LoginTest.class, LogoutTest.class, SignUpTest.class, TwitterLoginTest.class})
public class AllLoginTest 
{

}
