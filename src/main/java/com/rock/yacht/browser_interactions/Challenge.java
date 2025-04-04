package com.rock.yacht.browser_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
// import org.openqa.selenium.bidi.browsingcontext.BrowsingContext;
import org.openqa.selenium.remote.RemoteWebElement;

import setup.Main;

// The challenge is to open a new tab and click the alert button in the new tab.
public class Challenge extends Main {
  public static void main(String[] args) {
    String url = "https://selenium.dev/selenium/web/alerts.html";
    driver.get(url);

    // Revisit this.
    // A tab appears but the alert is not there on remote machine
    // while the alert is still there on local machine.
    driver.findElement(By.id("open-window-with-onload-alert")).click();

    driver.quit();
  }
}
