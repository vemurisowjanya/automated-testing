package com.example.tests;

import org.junit.*;
import org.openqa.selenium.*;

public class NewPhoto {
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void testNewPhoto() throws Exception {
    driver.get(baseUrl + "/articles");
    driver.findElement(By.linkText("New photo")).click();
  }
}
