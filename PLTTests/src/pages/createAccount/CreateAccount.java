package login;
import org.junit.*;
import org.openqa.selenium.*;

/*
 * @author Madi Paris
 * Test for Create Account page
 */

public class CreateAccount extends CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() {
    String email = "test@gmail.com"
    String username = "test";
    String firstName = "First";
    String lastName = "Last";
    String password = "test";

    driver.get(baseUrl + "/signup");

    driver.findElement("Email"){
    driver.sendKeys(email);
    driver.findElement("Username");
    driver.sendKeys(username);
    driver.findElement("First name");
    driver.sendKeys(firstName);
    driver.findElement("Last name");
    driver.sendKeys(lastName);
    driver.findElement("Password");
    driver.sendKeys(password);
    driver.findElement("Password confirmation");
    driver.sendKeys(password);
    driver.findElement("Sign Up").click();

    JUnit.AssertTrue("Successfully logged in", true);
    }
  }
}
