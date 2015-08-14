package com.example.tests;

import org.junit.*;
import org.openqa.selenium.*;

/*
 * @author Madi Paris
 */

public class NewPost {
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() throws Exception {
    driver.get(baseUrl + "/");
    if(driver.findElement(By.linkText("New post"))){
      JUnit.AssertTrue("Found the new post link", true);
    }
    else {
      JUnit.fail("No new post link found");
    }
  }
}
