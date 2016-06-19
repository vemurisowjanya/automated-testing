package superadmin;

import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

/**
 *
 * Test to create new site
 * @author Madi Vachon
 **/

public class NewSite extends CommonCode {
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() throws Exception {
    driver.get(baseUrl + "/countries");
    driver.findElement(By.linkText("Sites")).click();
    driver.findElement(By.cssSelector("i.icon-plus")).click();
    new Select(driver.findElement(By.id("site_country_id"))).selectByVisibleText("Micronesia");
    driver.findElement(By.id("site_name")).clear();
    driver.findElement(By.id("site_name")).sendKeys("Test");
    driver.findElement(By.cssSelector("button.button.button--primary")).click();
  }
}
