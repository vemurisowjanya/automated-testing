package admin;
import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

/*
 * @author Madi Paris
 * Test for New site UI feature on Sites page
 */

public class NewSite extends CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() {
    driver.get(baseUrl + "/sites");
    if(driver.findElement(By.linkText("New site"))){
      JUnit.AssertTrue("Found the new site link", true);
    }
    else {
      JUnit.fail("No new site link found");
    }
  }
}
