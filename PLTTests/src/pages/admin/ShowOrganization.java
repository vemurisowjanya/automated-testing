package admin;
import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

/*
 * @author Madi Paris
 * Test for show UI feature on Organization's edit page
 */

public class ShowOrganization extends CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() {
    driver.get(baseUrl + "/organizations/1/edit");
    if(driver.findElement(By.linkText("Show"))){
      JUnit.AssertTrue("Found the show link", true);
    }
    else {
      JUnit.fail("No show link found");
    }
  }
}
