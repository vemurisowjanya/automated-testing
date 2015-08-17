package testSuites;
import org.junit.*;
import admin.*;

/*
 * @author Madi Paris
 * This test suite will run all tests in the package admin
 */

 @RunWith(Suite.class)
 @SuiteClasses({BackOrganization.class, Categories.class, Countries.class, EditOrganization.class,
                Languages.class, Logout.class, Members.class, NewCategory.class, NewCountry.class,
                NewLanguage.class, NewPhoto.class, NewPost.class, NewSite.class, Photos.class,
                ShowOrganization.class, Sites.class, UpdateOrganization.class})
 public class AllAdminPageTests
 {
   
 }
