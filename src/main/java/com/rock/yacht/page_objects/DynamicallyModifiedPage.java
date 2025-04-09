package com.rock.yacht.page_objects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicallyModifiedPage {

  private By deleteBtn = By.id("buttonDelete");
  private By elementToRemove = By.id("element-to-remove");

  private WebDriver driver;

  public DynamicallyModifiedPage(WebDriver driver) {
    this.driver = driver;
  }

  public void clickDeleteBtn() {
    driver.findElement(deleteBtn).click();
    var wait = new WebDriverWait(driver, Duration.ofMillis(501));
    wait.until(ExpectedConditions.invisibilityOfElementLocated(elementToRemove));
  }

  public Boolean hasElementPresent() {
    try {
      driver.findElement(elementToRemove);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }
}
