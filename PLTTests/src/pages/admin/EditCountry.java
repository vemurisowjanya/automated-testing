package admin;

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
    driver.get(baseUrl + "/countries");
    driver.findElement(By.xpath("//li[2]/ul/li[5]/div/div/a/i")).click();
    driver.findElement(By.cssSelector("div.dropdown.open > ul.dropdown-menu.u-rightPopup > li > a")).click();
    new Select(driver.findElement(By.id("country_organization_id"))).selectByVisibleText("Habitat for Humanity");
    driver.findElement(By.id("country_name")).clear();
    driver.findElement(By.id("country_name")).sendKeys("Test");
    new Select(driver.findElement(By.id("country_user_id"))).selectByVisibleText("admin2");
    driver.findElement(By.cssSelector("button.button.button--primary")).click();
  }

}
