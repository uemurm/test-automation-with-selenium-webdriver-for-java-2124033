package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import setup.Main;

public class DragAndDrop extends Main {

  public static void main(String[] args) {
    driver.get("https://www.selenium.dev/selenium/web/draggableLists.html");
    


    driver.quit();
  }
}