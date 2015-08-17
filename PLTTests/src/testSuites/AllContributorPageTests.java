package testSuites;
import org.junit.*;
import contributor.Profile;
import contributor.Photos;
import contributor.NewPhoto;
import contributor.LogOut;

/*
 * @author Madi Paris
 * This test suite will run all tests in the package contributor
 */

 @RunWith(Suite.class)
 @SuiteClasses({Profile.class, Photos.class, NewPhoto.class, LogOut.class})
 public class AllContributorPageTests
 {

 }
