package com.example.tests;

import org.junit.*;
import org.openqa.selenium.*;

public class Photos extends commons.commonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void testPhotos() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Photos")).click();
  }
}
