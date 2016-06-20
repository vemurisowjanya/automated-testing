import junit.framework.Test;
import junit.framework.TestSuite;

public class Contributor {

  public static Test suite() {
    TestSuite suite = new TestSuite();
    suite.addTestSuite(EditAccount.class);
    suite.addTestSuite(EditPost.class);
    suite.addTestSuite(Login.class);
    suite.addTestSuite(NewArticle.class);
    return suite;
  }

  public static void main(String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}
