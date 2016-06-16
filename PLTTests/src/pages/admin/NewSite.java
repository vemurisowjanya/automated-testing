package admin;

import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

/**
 *
 * Test for new site
 * @author Madi Vachon
 **/

public class NewSite extends CommonCode {
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() throws Exception {
    driver.get(baseUrl + "/sites");
    driver.findElement(By.cssSelector("i.icon-plus")).click();
    driver.findElement(By.id("site_name")).clear();
    driver.findElement(By.id("site_name")).sendKeys("Test");
    driver.findElement(By.cssSelector("button.button.button--primary")).click();
  }
}
