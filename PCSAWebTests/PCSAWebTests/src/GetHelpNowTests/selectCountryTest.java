/*
 * @author Anjali
 * @since 2016-06-23
 * This script tests if the user is able to select the county from the dropdown on the Get Help Now.
 */
package GetHelpNowTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import BaseTests.commonTest;
import GetHelpNowFeatures.getHelpNow;
import Logs.log4j;

public class selectCountryTest extends commonTest
{
  @Test
  public void test()
  {
	  log4j.Log.info("selectCountry test started");
	  getHelpNow.gotoGetHelp();
	  Assert.assertEquals(getHelpNow.canSelectCountry(), true, "selectCountry failed");
	  log4j.Log.info("selectCountry test over");
  }
}
