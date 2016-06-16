package admin;

import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

/**
 *
 * Test to destroy language
 * @author Madi Vachon
 **/

public class DestroyLanguages extends CommonCode {
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() throws Exception {
    driver.get(baseUrl + "/languages");
    driver.findElement(By.xpath("//li[4]/ul/li[3]/div/div/a/i")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Delete')])[4]")).click();
    assertTrue(closeAlertAndGetItsText().matches("^Are you sure[\\s\\S]$"));
  }
}
