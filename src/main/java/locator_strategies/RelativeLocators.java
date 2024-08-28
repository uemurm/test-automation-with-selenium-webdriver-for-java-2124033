package locator_strategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;

import setup.Main;

public class RelativeLocators extends Main {

  public static void main(String[] args) {
    driver.get("https://www.selenium.dev/selenium/web/formPage.html");



    driver.quit();
  }

}
