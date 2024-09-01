package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import setup.Main;

public class DoubleClick extends Main {

  public static void main(String[] args) {
    driver.get("https://selenium.dev/selenium/web/mouse_interaction.html");
    


    driver.quit();
  }
}