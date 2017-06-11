package TestSuites;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import HomePageFeaturesTests.*;

/*
 * @author Anjali
 */

/*
 * This test suite will run all the tests in the package HomepageFeatureTests
 */
@RunWith(Suite.class)
@SuiteClasses({AboutUsTest.class, ContactTest.class, JoinSystersTest.class,SystersAndCRAwReadMoreTest.class, 
	           SystersInitiativesReadMoreTest.class, SystersCummunityReadMoreTest.class, SystersTechnicalInterestsReadMoreTest.class,
	           WikiTest.class})
public class AllHomepageFeaturesTest 
{

}
