package contributor;
import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

/*
 * @author Madi Paris
 * Test for Profile UI feature
 */

public class Profile extends CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() {
    driver.get(baseUrl + "/articles");
    if(driver.findElement(By.linkText("Con"))){
      JUnit.AssertTrue("Found the profile link", true);
    }
    else {
      JUnit.fail("No profile link found");
    }
  }
}
