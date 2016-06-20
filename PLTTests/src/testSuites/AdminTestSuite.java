import junit.framework.Test;
import junit.framework.TestSuite;

public class AdminTestSuite {

  public static Test suite() {
    TestSuite suite = new TestSuite();
    suite.addTestSuite(DestroyArticle.class);
    suite.addTestSuite(DestroyCategory.class);
    suite.addTestSuite(DestroyLanguages.class);
    suite.addTestSuite(DestroySite.class);
    suite.addTestSuite(EditArticle.class);
    suite.addTestSuite(EditCategory.class);
    suite.addTestSuite(EditCountry.class);
    suite.addTestSuite(EditLanguage.class);
    suite.addTestSuite(EditProfile.class);
    suite.addTestSuite(EditSite.class);
    suite.addTestSuite(LoginAdmin.class);
    suite.addTestSuite(Logout.class);
    suite.addTestSuite(Members.class);
    suite.addTestSuite(MyOrganization.class);
    suite.addTestSuite(NewArticle.class);
    suite.addTestSuite(NewCategory.class);
    suite.addTestSuite(NewCountry.class);
    suite.addTestSuite(NewLanguage.class);
    suite.addTestSuite(NewSite.class);
    suite.addTestSuite(YourAccount.class);
    return suite;
  }

  public static void main(String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}
