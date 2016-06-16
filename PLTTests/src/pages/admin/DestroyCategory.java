package admin;

import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

/**
 *
 * Test to destroy category
 * @author Madi Vachon
 **/

public class DestroyCategory extends CommonCode {
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() throws Exception {
    driver.get(baseUrl + "/categories");
    driver.findElement(By.cssSelector("a.button--icon")).click();
    driver.findElement(By.linkText("Delete")).click();
    assertTrue(closeAlertAndGetItsText().matches("^Are you sure[\\s\\S]$"));
  }
}
