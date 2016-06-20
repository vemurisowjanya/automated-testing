import junit.framework.Test;
import junit.framework.TestSuite;

public class SuperadminTestSuite {

  public static Test suite() {
    TestSuite suite = new TestSuite();
    suite.addTestSuite(DestroyCategory.class);
    suite.addTestSuite(DestroyCountry.class);
    suite.addTestSuite(DestroyLanguage.class);
    suite.addTestSuite(DestroyOrganization.class);
    suite.addTestSuite(DestroySite.class);
    suite.addTestSuite(EditArticle.class);
    suite.addTestSuite(EditCategory.class);
    suite.addTestSuite(EditCountry.class);
    suite.addTestSuite(EditLanguage.class);
    suite.addTestSuite(EditOrganization.class);
    suite.addTestSuite(EditSite.class);
    suite.addTestSuite(Login.class);
    suite.addTestSuite(Members.class);
    suite.addTestSuite(NewArticle.class);
    suite.addTestSuite(NewCategory.class);
    suite.addTestSuite(NewCountry.class);
    suite.addTestSuite(NewLanguage.class);
    suite.addTestSuite(NewOrganization.class);
    suite.addTestSuite(NewSite.class);
    return suite;
  }

  public static void main(String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}
