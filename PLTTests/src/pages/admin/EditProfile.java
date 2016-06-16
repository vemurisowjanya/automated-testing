package admin;
import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

/**
 *
 * Test to edit profile
 * @author Madi Vachon
 **/

public class EditProfile extends CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() throws Exception{
    driver.get(baseUrl);
    if(driver.findElement(By.linkText("Edit profile"))){
      JUnit.AssertTrue("Found edit profile link", true);
    }
    else {
      JUnit.fail("No edit profile link found");
    }
  }
}
