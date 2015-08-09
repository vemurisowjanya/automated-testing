package com.example.tests;

import org.junit.*;
import org.openqa.selenium.*;

public class NewPost {
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void testNewPost() throws Exception {
    driver.get(baseUrl + "/installations");
    driver.findElement(By.linkText("New post")).click();
  }
}
