package browser_interactions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import setup.Main;

public class Challenge_AlertInNewTab extends Main {

  public static void main(String[] args) {
    driver.get("https://www.selenium.dev/selenium/web/alerts.html");

    // TODO: add your solution here

    driver.quit();
  }
}