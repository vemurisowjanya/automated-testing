package superadmin;

import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

/**
 *
 * Test to create new category
 * @author Madi Vachon
 **/

public class NewCategory extends CommonCode {
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() throws Exception {
    driver.get(baseUrl + "/languages");
    driver.findElement(By.linkText("Categories")).click();
    driver.findElement(By.cssSelector("i.icon-plus")).click();
    driver.findElement(By.id("category_name")).clear();
    driver.findElement(By.id("category_name")).sendKeys("Test");
    driver.findElement(By.cssSelector("button.button.button--primary")).click();
  }
}
