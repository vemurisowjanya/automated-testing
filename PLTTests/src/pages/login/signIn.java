package com.example.tests;

import org.junit.*;
import org.openqa.selenium.*;

public class SignIn extends commons.commonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void testSignIn() throws Exception {
    driver.get(baseUrl + "/users");
    driver.findElement(By.linkText("Sign in")).click();
    driver.findElement(By.id("user_username")).clear();
    driver.findElement(By.id("user_username")).sendKeys("");
    driver.findElement(By.id("user_password")).clear();
    driver.findElement(By.id("user_password")).sendKeys("");
  }
}
