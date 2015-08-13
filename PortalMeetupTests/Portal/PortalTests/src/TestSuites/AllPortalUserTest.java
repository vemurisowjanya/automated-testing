package TestSuites;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import PortalUserTests.*;

/*
 * @author Anjali
 */

/*
 * This test suite will run all the tests in the package PortalUserTests
 */
@RunWith(Suite.class)
@SuiteClasses({JoinRequestTest.class})
public class AllPortalUserTest 
{

}
