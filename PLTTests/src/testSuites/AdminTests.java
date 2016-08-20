package testSuites;

import admin.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({Members.class, MyOrganization.class, NewArticle.class, EditArticle.class, NewCategory.class})
public class AdminTests {

}
