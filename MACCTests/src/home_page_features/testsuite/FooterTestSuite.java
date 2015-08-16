package home_page_features.testsuite;

import home_page_features.AboutPeaceCorps;
import home_page_features.Help;
import home_page_features.ImportantDetails;
import home_page_features.Policies;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({AboutPeaceCorps.class,
	Policies.class,
	ImportantDetails.class,
	Help.class})
public class FooterTestSuite {
	public static void main (String[] args) {
		Result result = JUnitCore.runClasses(FooterTestSuite.class);
		for (Failure fail : result.getFailures()){
			System.out.println(fail.toString());
		}
		System.out.println(result.wasSuccessful());
	}

}
