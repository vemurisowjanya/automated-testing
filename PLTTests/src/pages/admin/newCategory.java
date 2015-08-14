package com.example.tests;

import org.junit.*;
import org.openqa.selenium.*;

/*
 * @author Madi Paris
 */

public class NewCategory extends commons.CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() throws Exception {
    driver.get(baseUrl + "/categories");
    if(driver.findElement(By.linkText("New Category"))){
      JUnit.AssertTrue("Found the new category link", true);
    }
    else {
      JUnit.fail("No new category link found");
    }
  }
}
