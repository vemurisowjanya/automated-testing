package com.example.tests;

import org.junit.*;
import org.openqa.selenium.*;

/*
 * @author Madi Paris
 */

public class Profile {
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() throws Exception {
    driver.get(baseUrl + "/articles");
    if(driver.findElement(By.linkText("Con"))){
      JUnit.AssertTrue("Found the profile link", true);
    }
    else {
      JUnit.fail("No profile link found");
    }
  }
}
