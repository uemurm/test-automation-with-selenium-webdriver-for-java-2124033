package setup;

import org.openqa.selenium.WebDriver;

final class BrowserNavigation {
  static protected WebDriver driver = WebDriverSetup.initializeDriver();

  public static void main(String[] args) {
    driver.get("https://selenium.dev/selenium/web/web-form.html");
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
