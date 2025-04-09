package com.rock.yacht.page_objects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

  // Use `By` instead of `WebElement`.
  // Defining elements as By objects allows dynamic element location, preventing
  // premature exceptions.
  private By usernameField = By.id("username-field");
  private By passwordField = By.id("password-field");
  private By loginButton = By.id("login-form-submit");

  private WebDriver driver;

  public LoginPage(WebDriver driver) {
    this.driver = driver;
  }

  public void setUsername(String username) {
    driver.findElement(usernameField).sendKeys(username);
  }

  public void setPassword(String password) {
    driver.findElement(passwordField).sendKeys(password);
  }

  public String clickLoginButton() {
    driver.findElement(loginButton).click();
    Alert alert = driver.switchTo().alert();
    String message = alert.getText();
    alert.accept();
    return message;
  }

  public String login(String username, String password) {
    setUsername(username);
    setPassword(password);
    return clickLoginButton();
  }
}
