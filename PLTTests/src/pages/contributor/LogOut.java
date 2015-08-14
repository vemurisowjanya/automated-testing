package com.example.tests;

import org.junit.*;
import org.openqa.selenium.*;

/*
 * @author Madi Paris
 */

public class LogOut {
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() throws Exception {
    driver.get(baseUrl + "/users/edit");
    if(driver.findElement(By.linkText("sign out"))){
      JUnit.AssertTrue("Found the sign out link", true);
    }
    else {
      JUnit.fail("No sign out link found");
    }
  }
}
