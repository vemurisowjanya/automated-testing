package com.example.tests;

import org.junit.*;
import org.openqa.selenium.*;

public class PeaceCorpsLogo extends commons.commonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void testPeaceCorpsLogo() throws Exception {
    driver.get(baseUrl + "/users/password/new");
    driver.findElement(By.cssSelector("img.logo_img")).click();
    driver.findElement(By.id("user_username")).clear();
    driver.findElement(By.id("user_username")).sendKeys("");
    driver.findElement(By.id("user_password")).clear();
    driver.findElement(By.id("user_password")).sendKeys("");
  }
}
