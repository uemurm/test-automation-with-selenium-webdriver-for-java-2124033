package setup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

final class New {
  static protected WebDriver driver = WebDriverSetup.initializeDriver();

  public static void main(String[] args) {
    String url = "https://selenium.dev/selenium/web/window_switching_tests/page_with_frame.html";
    driver.get(url);

    driver.quit();
  }
}

final class Modals {
  static protected WebDriver driver = WebDriverSetup.initializeDriver();

  public static void main(String[] args) {
    String url = "https://www.selenium.dev/selenium/web/modal_dialogs/modern_modal.html";
    driver.get(url);
    driver.findElement(By.id("trigger-modal-btn")).click();

    WebElement modal = driver.findElement(By.id("modalContent"));
    if (modal.isDisplayed()) {
      System.out.println("Modal is displayed");
      driver.findElement(By.id("modal-input")).sendKeys("Hello Modal!");
      driver.findElement(By.id("modal-close")).click();
    }
    else System.out.println("Modal is not displayed");

    driver.quit();
  }
}

// Need to revisit!!!
final class Tabs {
  static protected WebDriver driver = WebDriverSetup.initializeDriver();

  public static void main(String[] args) {
    String url = "https://selenium.dev/selenium/web/window_switching_tests/page_with_frame.html";
    driver.get(url);
    System.out.println("Page Title: " + driver.getTitle());
    String original = driver.getWindowHandle();

    driver.findElement(By.id("a-link-that-opens-a-new-window")).click();
    String title = driver.getTitle();
    var wait = new WebDriverWait(driver, Duration.ofSeconds(2));
    wait.until(ExpectedConditions.titleIs(title));
    System.out.println("Page Title: " + driver.getTitle());

    var windows = driver.getWindowHandles();

    for (String window : windows) {
      if (window.equals(original)) {
        driver.switchTo().window(window);
        break;
      }
    }
    System.out.println("Page Title: " + driver.getTitle());

    driver.quit();
  }
}

final class BrowserNavigation {
  static protected WebDriver driver = WebDriverSetup.initializeDriver();

  public static void main(String[] args) {
    driver.get("https://selenium.dev/selenium/web/clicks.html");

    System.out.println("Page Title: " + driver.getTitle());
    driver.findElement(By.linkText("Click me")).click();
    System.out.println("Page Title: " + driver.getTitle());
    driver.navigate().back();
    System.out.println("Page Title: " + driver.getTitle());
    driver.navigate().forward();
    System.out.println("Page Title: " + driver.getTitle());
    driver.navigate().refresh();

    driver.close();
  }
}

final class BrowserInfo {
  static protected WebDriver driver = WebDriverSetup.initializeDriver();

  public static void main(String[] args) {
    driver.get("https://selenium.dev/selenium/web/web-form.html");
    String pageTitle = driver.getTitle();
    String pageUrl = driver.getCurrentUrl();
    String pageSource = driver.getPageSource();
    System.out.println("Page Title: " + pageTitle);
    System.out.println("Page URL: " + pageUrl);
    System.out.println("Page Source length: " + pageSource.length());
  
    driver.quit();
  }
}
