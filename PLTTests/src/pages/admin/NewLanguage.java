package admin;

import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

/**
 *
 * Test for new language
 * @author Madi Vachon
 **/

public class NewLanguage extends CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Languages")).click();
    driver.findElement(By.cssSelector("i.icon-plus")).click();
    driver.findElement(By.id("language_name")).clear();
    driver.findElement(By.id("language_name")).sendKeys("Test");
    driver.findElement(By.cssSelector("button.button.button--primary")).click();
  }

}
