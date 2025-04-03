package com.rock.yacht.browser_interactions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.browsingcontext.BrowsingContext;
import org.openqa.selenium.remote.RemoteWebElement;

import setup.Main;

public class Screenshots extends Main {

  public static void main(String[] args) {
    String url = "https://selenium.dev/selenium/web/web-form.html";
    driver.get(url);

    var windowHandle = driver.getWindowHandle();
    var browsingContext = new BrowsingContext(driver, windowHandle);

    // Full Page Screenshot
    String fullPageScreenshot = browsingContext.captureScreenshot();
    saveScreenshot(fullPageScreenshot, "full_page_screenshot.png");

    // Element Screenshot
    WebElement colorPicker = driver.findElement(By.name("my-colors"));
    String internalElementId = ((RemoteWebElement) colorPicker).getId();
    String elementScreenshot = browsingContext.captureElementScreenshot(internalElementId);
    saveScreenshot(elementScreenshot, "element_screenshot.png");

    // Viewport Screenshot
    driver.findElement(By.name("my-date")).click();
    Rectangle datePickerRectangle = driver.findElement(By.className("datepicker")).getRect();
    String viewportScreenshot = browsingContext.captureBoxScreenshot(
      datePickerRectangle.x,
      datePickerRectangle.y,
      datePickerRectangle.width,
      datePickerRectangle.height
      );
    saveScreenshot(viewportScreenshot, "viewport_screenshot.png");

    driver.quit();
  }

  private static void saveScreenshot(String screenshot, String filename) {
    var decodedScreenshot = Base64.getDecoder().decode(screenshot);
    try {
      String path = "/workspaces/test-automation-with-selenium-webdriver-for-java-2124033/screenshots/";
      Files.write(Paths.get(path + filename), decodedScreenshot);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
