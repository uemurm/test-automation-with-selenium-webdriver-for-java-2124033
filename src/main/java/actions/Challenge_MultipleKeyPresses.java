package actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import setup.Main;

public class Challenge_MultipleKeyPresses extends Main {

  public static void main(String[] args) {
    driver.get("https://www.selenium.dev/selenium/web/keyboard_shortcut.html");



    driver.quit();
  }
}