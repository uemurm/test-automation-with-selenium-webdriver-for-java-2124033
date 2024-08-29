package browser_interactions;

import org.openqa.selenium.By;

import setup.Main;

public class Navigation extends Main {

  public static void main(String[] args) {
    driver.get("https://www.selenium.dev/selenium/web/clicks.html");



    driver.quit();
  }
}