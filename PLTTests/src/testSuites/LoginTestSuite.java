import junit.framework.Test;
import junit.framework.TestSuite;

public class LoginTestSuite {

  public static Test suite() {
    TestSuite suite = new TestSuite();
    suite.addTestSuite(CreateAccount.class);
    suite.addTestSuite(ForgotPassword.class);
    return suite;
  }

  public static void main(String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}
