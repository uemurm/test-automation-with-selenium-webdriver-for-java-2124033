package browser_interactions;

import org.openqa.selenium.Cookie;

import setup.Main;

public class Cookies extends Main {

  public static void main(String[] args) {
    driver.get("https://www.selenium.dev/selenium/web/web-form.html");



    driver.quit();
  }
}