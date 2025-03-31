package setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

final class Challenge {
  static protected WebDriver driver = WebDriverSetup.initializeDriver();

  public static void main(String[] args) {
    driver.get("https://selenium.dev/selenium/web/coordinates_tests/page_with_hidden_element.html");
    WebElement hiddenElement = driver.findElement(By.id("box"));

    if (hiddenElement.isDisplayed()) {
      hiddenElement.click();
    } else {
      System.out.println("Box is not visible.");
    }

    driver.quit();
  }
}
