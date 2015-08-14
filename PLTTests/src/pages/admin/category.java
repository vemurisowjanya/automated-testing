package com.example.tests;

import org.junit.*;
import org.openqa.selenium.*;

/*
 * @author Madi Paris
 */

public class Category extends commons.CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() throws Exception {
    driver.get(baseUrl + "/");
    if(driver.findElement(By.linkText("Category"))){
      JUnit.AssertTrue("Found the category link", true);
    }
    else {
      JUnit.fail("No category link found");
    }
  }
}
