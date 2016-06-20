import junit.framework.Test;
import junit.framework.TestSuite;

public class VolunteerTestSuite {

  public static Test suite() {
    TestSuite suite = new TestSuite();
    suite.addTestSuite(Categories.class);
    suite.addTestSuite(DestroyArticle.class);
    suite.addTestSuite(EditArticle.class);
    suite.addTestSuite(Languages.class);
    suite.addTestSuite(Login.class);
    suite.addTestSuite(Members.class);
    suite.addTestSuite(MySites.class);
    suite.addTestSuite(NewArticle.class);
    return suite;
  }

  public static void main(String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}
