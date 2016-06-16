package admin;

import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

public class DestroySite extends CommonCode {
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() throws Exception {
    driver.get(baseUrl + "/sites");
    driver.findElement(By.cssSelector("i.icon-action")).click();
    driver.findElement(By.linkText("Delete")).click();
    assertTrue(closeAlertAndGetItsText().matches("^Are you sure[\\s\\S]$"));
  }

}
