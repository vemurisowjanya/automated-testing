package admin;
import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

/*
 * @author Madi Paris
 * Test for update UI feature on Organization's edit page
 */

public class UpdateOrganization extends CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() {
    driver.get(baseUrl + "/organizations/1/edit");
    if(driver.findElement(By.linkText("commit"))){
      JUnit.AssertTrue("Found the update link", true);
    }
    else {
      JUnit.fail("No update link found");
    }
  }
}
