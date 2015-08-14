package com.example.tests;

import org.junit.*;
import org.openqa.selenium.*;

/*
 * @author Madi Paris
 */

public class Posts commons.commonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() throws Exception {
    driver.get(baseUrl + "/");
    if(driver.findElement(By.linkText("Posts"))){
      JUnit.AssertTrue("Found the posts link", true);
    }
    else {
      JUnit.fail("No posts link found");
    }
  }
}
