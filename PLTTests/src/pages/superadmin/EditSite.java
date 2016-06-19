package superadmin;

import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

/**
 *
 * Test to edit site
 * @author Madi Vachon
 **/

public class EditSite extends CommonCode {
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() throws Exception {
    driver.get(baseUrl + "/sites");
    driver.findElement(By.cssSelector("i.icon-action")).click();
    driver.findElement(By.linkText("Edit")).click();
    new Select(driver.findElement(By.id("site_country_id"))).selectByVisibleText("Haiti");
    driver.findElement(By.id("site_name")).clear();
    driver.findElement(By.id("site_name")).sendKeys("Test2");
    driver.findElement(By.cssSelector("button.button.button--primary")).click();
  }

}
