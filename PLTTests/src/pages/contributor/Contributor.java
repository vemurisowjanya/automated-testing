import junit.framework.Test;
import junit.framework.TestSuite;

public class Contributor {

  public static Test suite() {
    TestSuite suite = new TestSuite();
    suite.addTestSuite(Untitled.class);
    suite.addTestSuite(Untitled 2.class);
    suite.addTestSuite(Untitled 3.class);
    suite.addTestSuite(Untitled 4.class);
    return suite;
  }

  public static void main(String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}
