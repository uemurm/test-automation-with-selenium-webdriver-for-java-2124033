package com.rock.yacht.actions_api;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import setup.Main;

public class DoubleClick extends Main {

  public static void main(String[] args) {
    String url = "https://selenium.dev/selenium/web/mouse_interaction.html";
    driver.get(url);

    var clickable = driver.findElement(By.id("clickable"));

    new Actions(driver).doubleClick(clickable).perform();
    System.out.println(driver.findElement(By.id("click-status")).getText());

    driver.quit();
  }
}
