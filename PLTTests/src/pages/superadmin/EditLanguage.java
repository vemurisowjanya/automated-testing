package superadmin;

import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

/**
 *
 * Test to edit language
 * @author Madi Vachon
 **/

public class EditLanguage extends CommonCode {
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() throws Exception {
    driver.get(baseUrl + "/languages");
    driver.findElement(By.xpath("//li[4]/ul/li[3]/div/div/a/i")).click();
    driver.findElement(By.cssSelector("div.dropdown.open > ul.dropdown-menu.u-rightPopup > li > a")).click();
    driver.findElement(By.id("language_name")).clear();
    driver.findElement(By.id("language_name")).sendKeys("Test2");
    driver.findElement(By.cssSelector("button.button.button--primary")).click();
  }

}
