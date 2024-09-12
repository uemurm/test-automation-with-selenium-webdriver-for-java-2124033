package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import setup.Main;

public class Scroll extends Main {

  public static void main(String[] args) {

    // Scroll to element
    driver.get("https://www.selenium.dev/selenium/web/scroll.html");

    

    //Scroll by amount
    driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/page_with_tall_frame.html");



    driver.quit();
  }
}