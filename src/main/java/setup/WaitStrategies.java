// A few strategies to wait for elements to become accessible.
package setup;

import java.lang.Thread;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

class ImplicitWaits {
  static protected WebDriver driver = WebDriverSetup.initializeDriver();

  public static void main(String[] args) {
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

    driver.get("https://selenium.dev/selenium/web/dynamic.html");
    driver.findElement(By.id("reveal")).click();
    driver.findElement(By.id("revealed")).sendKeys("I see you");

    driver.quit();
  }
}

class ExplicitWaits {
  static protected WebDriver driver = WebDriverSetup.initializeDriver();

  public static void main(String[] args) {
    driver.get("https://selenium.dev/selenium/web/dynamic.html");

    driver.findElement(By.id("reveal")).click();

    WebElement textBox = driver.findElement(By.id("revealed"));
    var wait = new WebDriverWait(driver, Duration.ofSeconds(2));
    wait.until(ExpectedConditions.visibilityOf(textBox));

    textBox.sendKeys("I see you");

    try {
      Thread.sleep(3000);
    } catch (Exception e) {
    }

    driver.quit();
  }
}

class FluentWaits {
  static protected WebDriver driver = WebDriverSetup.initializeDriver();

  public static void main(String[] args) {
    driver.get("https://selenium.dev/selenium/web/dynamic.html");
    driver.findElement(By.id("adder")).click();

    var wait = new FluentWait<>(driver)
      .withTimeout(Duration.ofSeconds(5))
      .pollingEvery(Duration.ofMillis(200))
      .ignoring(NoSuchElementException.class);

    WebElement box = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("box0")));
    System.out.println(box.isEnabled());

    driver.quit();
  }
}

class Challenge {
  static protected WebDriver driver = WebDriverSetup.initializeDriver();

  public static void main(String[] args) {
    driver.get("https://selenium.dev/selenium/web/dynamicallyModifiedPage.html");
    driver.findElement(By.id("buttonDelete")).click();

    WebElement text = driver.findElement(By.id("element-to-remove"));
    var wait = new WebDriverWait(driver, Duration.ofMillis(501));
    boolean removed = wait.until(ExpectedConditions.invisibilityOf(text));

    System.out.println(removed);

    driver.quit();
  }
}
