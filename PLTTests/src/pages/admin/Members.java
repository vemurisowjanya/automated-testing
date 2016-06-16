package admin;

import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

/**
 *
 * Test for members
 * @author Madi Vachon
 **/

public class Members extends CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() throws Exception {
    driver.get(baseUrl + "/articles");
    driver.findElement(By.linkText("Members")).click();
  }

}
