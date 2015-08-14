package com.example.tests;

import org.junit.*;
import org.openqa.selenium.*;

/*
 * @author Madi Paris
 */

public class Users extends commons.CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() throws Exception {
    driver.get(baseUrl + "/");
    if(driver.findElement(By.linkText("Members"))){
      JUnit.AssertTrue("Found the members link", true);
    }
    else {
      JUnit.fail("No members link found");
    }
  }
}
