package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@SuppressWarnings("unused")
public class LoginPage {
  
  private final By usernameField = By.id("username-field");
  private final By passwordField = By.id("password-field");
  private final By loginButton = By.id("login-form-submit");

}