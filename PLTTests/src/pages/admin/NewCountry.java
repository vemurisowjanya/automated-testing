package admin;

import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

/**
 *
 * Test for new country
 * @author Madi Vachon
 **/

public class NewCountry extends CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() throws Exception {
    driver.get(baseUrl + "/articles");
    driver.findElement(By.linkText("Countries")).click();
    driver.findElement(By.cssSelector("i.icon-plus")).click();
    new Select(driver.findElement(By.id("country_organization_id"))).selectByVisibleText("Red Cross");
    driver.findElement(By.id("country_name")).clear();
    driver.findElement(By.id("country_name")).sendKeys("Test");
    new Select(driver.findElement(By.id("country_user_id"))).selectByVisibleText("admin1");
    driver.findElement(By.cssSelector("button.button.button--primary")).click();
  }

}
