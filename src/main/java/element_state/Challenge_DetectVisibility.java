package element_state;

import setup.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Challenge_DetectVisibility extends Main {

  public static void main(String[] args) {
    driver.get("https://www.selenium.dev/selenium/web/coordinates_tests/page_with_hidden_element.html");

    /*
     * TODO: add your solution here
     * find the box element
     * check if the element is visible
     * if the element is visible, click it
     * if the element is not visible, print “box is not visible”
     */

    driver.quit();
  }
}
