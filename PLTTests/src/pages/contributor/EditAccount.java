package contributor;

import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

/**
 *
 * Test to edit account
 * @author Madi Vachon
 **/

public class EditAccount extends CommonCode {
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() throws Exception {
    driver.get(baseUrl + "/articles");
    driver.findElement(By.cssSelector("button.menu")).click();
    driver.findElement(By.cssSelector("i.icon-chevron-down-thin.UserDetails-more")).click();
    driver.findElement(By.linkText("Your Account")).click();
  }
}
