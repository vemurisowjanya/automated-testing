package com.example.tests;

import org.junit.*;
import org.openqa.selenium.*;

public class Logout commons.commonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void testLogout() throws Exception {
    driver.get(baseUrl + "/users/edit");
    driver.findElement(By.id("sign_out_link")).click();
    driver.findElement(By.id("user_username")).clear();
    driver.findElement(By.id("user_username")).sendKeys("");
    driver.findElement(By.id("user_password")).clear();
    driver.findElement(By.id("user_password")).sendKeys("");
  }
}
