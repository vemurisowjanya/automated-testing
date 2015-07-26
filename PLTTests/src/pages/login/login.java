package com.example.tests;

import org.junit.*;
import org.openqa.selenium.*;

public class Login extends commons.commonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void testLogin() throws Exception {
    driver.get(baseUrl + "/users/sign_in");
    driver.findElement(By.linkText("LOGIN")).click();
    driver.findElement(By.id("user_username")).clear();
    driver.findElement(By.id("user_username")).sendKeys("");
    driver.findElement(By.id("user_password")).clear();
    driver.findElement(By.id("user_password")).sendKeys("");
  }
}
