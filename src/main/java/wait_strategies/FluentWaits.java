package wait_strategies;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import setup.Main;

public class FluentWaits extends Main
{

  @SuppressWarnings("unused")
  public static void main(String[] args) {
    driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
    driver.findElement(By.id("adder")).click();



    driver.quit();
  }
}