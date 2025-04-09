package com.rock.yacht;

import static org.junit.Assert.assertEquals;

// import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.rock.yacht.page_objects.LoginPage;

public class LoginTests extends BaseTests {
  
  private LoginPage loginPage;

  @BeforeEach
  public void loadPage() {
    driver.get("https://selenium.dev/selenium/web/login.html");
    loginPage = new LoginPage(driver);
  }

  @Test
  public void successfulLogin() {
    String message = loginPage.login("username", "password");
    assertEquals("You have successfully logged in.", message);
  }

  @Test
  public void loginWithNoUsername() {
    loginPage.setPassword("password");
    String message = loginPage.clickLoginButton();
    assertEquals("Please enter valid credentials", message);
  }
}
