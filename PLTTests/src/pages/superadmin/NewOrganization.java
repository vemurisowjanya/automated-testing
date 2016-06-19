package superadmin;

import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

/**
 *
 * Test to create new organization
 * @author Madi Vachon
 **/

public class NewOrganization extends CommonCode {
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() throws Exception {
    driver.get(baseUrl + "/articles/2");
    driver.findElement(By.linkText("Organizations")).click();
    driver.findElement(By.cssSelector("i.icon-plus")).click();
    driver.findElement(By.id("organization_name")).clear();
    driver.findElement(By.id("organization_name")).sendKeys("Test");
    driver.findElement(By.cssSelector("button.button.button--primary")).click();
    driver.findElement(By.cssSelector("span.icon-chevron-left-thin")).click();
  }
}
