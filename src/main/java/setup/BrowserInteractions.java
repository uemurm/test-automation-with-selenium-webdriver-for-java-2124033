package setup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

final class Cookies {
  static protected WebDriver driver = WebDriverSetup.initializeDriver();

  public static void main(String[] args) {
    String url = "https://www.selenium.dev/selenium/web/web-form.html";
    driver.get(url);

    Cookie cookie = new Cookie("theme", "light");
    driver.manage().addCookie(cookie);
    System.out.println("Cookie added: " + cookie);
    System.out.println("Cookie value: " + driver.manage().getCookieNamed("theme"));
    System.out.println("Cookie value: " + driver.manage().getCookieNamed("theme").getValue());
    Cookie themeCookie = driver.manage().getCookieNamed("theme");
    System.out.println(themeCookie.getDomain());

    System.out.println(driver.manage().getCookies().size());

    driver.manage().deleteCookieNamed("theme");
    System.out.println(driver.manage().getCookies().size());

    driver.quit();
  }
}

// Revisit this class. Need to understand more about IFrame tag.
final class IFrames {
  static protected WebDriver driver = WebDriverSetup.initializeDriver();

  public static void main(String[] args) {
    String url = "https://selenium.dev/selenium/web/click_tests/click_in_iframe.html";
    driver.get(url);

    driver.switchTo().frame("ifr");
    driver.findElement(By.id("link")).click();

    driver.navigate().back();

    driver.switchTo().frame("ifr");
    driver.switchTo().defaultContent();
    driver.switchTo().frame("ifr");
    driver.findElement(By.id("link")).click();

    driver.quit();
  }
}

// Revisit this class. sendKeys() is not working!!!
final class PromptAlert {
  static protected WebDriver driver = WebDriverSetup.initializeDriver();

  public static void main(String[] args) {
    String url = "https://selenium.dev/selenium/web/alerts.html";
    driver.get(url);

    driver.findElement(By.id("prompt")).click();

    var wait = new WebDriverWait(driver, Duration.ofSeconds(3));
    Alert promptAlert = wait.until(ExpectedConditions.alertIsPresent());

    // Alert promptAlert = driver.switchTo().alert();
    promptAlert.sendKeys("Hello Alert!");
    promptAlert.accept();

    driver.quit();
  }
}

final class SlowAlert {
  static protected WebDriver driver = WebDriverSetup.initializeDriver();

  public static void main(String[] args) {
    String url = "https://selenium.dev/selenium/web/alerts.html";
    driver.get(url);

    // Alert takes some time to appear
    driver.findElement(By.id("slow-alert")).click();

    var wait = new WebDriverWait(driver, Duration.ofSeconds(2));
    Alert promptAlert = wait.until(ExpectedConditions.alertIsPresent());

    // promptAlert.sendKeys("Hello Alert!");
    promptAlert.accept();

    driver.quit();
  }
}

final class SimpleAlert {
  static protected WebDriver driver = WebDriverSetup.initializeDriver();

  public static void main(String[] args) {
    String url = "https://selenium.dev/selenium/web/alerts.html";
    driver.get(url);

    driver.findElement(By.id("confirm")).click();
    Alert confirmationAlert = driver.switchTo().alert();
    confirmationAlert.accept();

    driver.navigate().back();

    driver.findElement(By.id("confirm")).click();
    confirmationAlert.dismiss();

    // Prompt Alert
    driver.findElement(By.id("prompt")).click();
    var wait = new WebDriverWait(driver, Duration.ofSeconds(2));
    Alert promptAlert = wait.until(ExpectedConditions.alertIsPresent());

    promptAlert.sendKeys("Hello Alert!");
    promptAlert.accept();

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
