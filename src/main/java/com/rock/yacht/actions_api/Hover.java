package com.rock.yacht.actions_api;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import setup.Main;

public class Hover extends Main {

  public static void main(String[] args) {
    String url = "https://selenium.dev/selenium/web/mouseOver.html";
    driver.get(url);

    var redBox = driver.findElement(By.id("redbox"));
    System.out.println(redBox.getCssValue("background-color"));

    new Actions(driver).moveToElement(redBox).perform();
    System.out.println(redBox.getCssValue("background-color"));

    driver.quit();
  }
}
