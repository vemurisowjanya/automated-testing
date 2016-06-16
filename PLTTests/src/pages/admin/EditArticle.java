package admin;

import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

/**
 *
 * Test to edit article
 * @author Madi Vachon
 **/

public class EditArticle extends CommonCode {
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() throws Exception {
    driver.get(baseUrl + "/articles");
    driver.findElement(By.cssSelector("a.button--icon")).click();
    driver.findElement(By.linkText("Edit")).click();
    driver.findElement(By.id("article_picture")).clear();
    driver.findElement(By.id("article_picture")).sendKeys("/home/madi/Downloads/hedgehog.jpg");
    new Select(driver.findElement(By.id("article_language_id"))).selectByVisibleText("Pohnpeian");
    new Select(driver.findElement(By.id("article_category_id"))).selectByVisibleText("Adjectives");
    driver.findElement(By.id("article_english")).clear();
    driver.findElement(By.id("article_english")).sendKeys("Hedgehog");
    driver.findElement(By.id("article_phonetic")).clear();
    driver.findElement(By.id("article_phonetic")).sendKeys("Hedgehog");
    driver.findElement(By.id("article_audios_attributes_0_content")).clear();
    driver.findElement(By.id("article_audios_attributes_0_content")).sendKeys("Hedgehog");
    driver.findElement(By.id("article_audios_attributes_0_audio")).clear();
    driver.findElement(By.id("article_audios_attributes_0_audio")).sendKeys("/home/madi/Downloads/hedgehog.jpg");
    driver.findElement(By.cssSelector("button.button.button--primary")).click();
  }

}
