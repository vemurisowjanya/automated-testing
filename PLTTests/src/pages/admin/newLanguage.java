package com.example.tests;

import org.junit.*;
import org.openqa.selenium.*;

public class NewLanguage {
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void testNewLanguage() throws Exception {
    driver.get(baseUrl + "/languages");
    driver.findElement(By.linkText("New language")).click();
  }
}
