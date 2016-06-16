package admin;

import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

public class EditCategory {
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() throws Exception {
    driver.get(baseUrl + "/categories");
    driver.findElement(By.cssSelector("i.icon-action")).click();
    driver.findElement(By.linkText("Edit")).click();
    driver.findElement(By.id("category_name")).clear();
    driver.findElement(By.id("category_name")).sendKeys("Test2");
    driver.findElement(By.cssSelector("button.button.button--primary")).click();
  }

}
