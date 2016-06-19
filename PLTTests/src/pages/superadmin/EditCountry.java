package superadmin;

import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

/**
 *
 * Test to edit country
 * @author Madi Vachon
 **/

public class EditCountry extends CommonCode {
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() throws Exception {
    driver.get(baseUrl + "/countries/6");
    driver.findElement(By.linkText("Edit")).click();
    new Select(driver.findElement(By.id("country_organization_id"))).selectByVisibleText("Habitat for Humanity");
    driver.findElement(By.id("country_name")).clear();
    driver.findElement(By.id("country_name")).sendKeys("Test2");
    new Select(driver.findElement(By.id("country_user_id"))).selectByVisibleText("admin2");
    driver.findElement(By.cssSelector("button.button.button--primary")).click();
  }

}
