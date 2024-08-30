package browser_interactions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import setup.Main;

public class Alerts extends Main {
  
  public static void main(String[] args) {
    alerts();
    confirmations();
    prompts();
    waits();

    driver.quit();
  }

  public static void alerts(){
    driver.get("https://www.selenium.dev/selenium/web/alerts.html");
    driver.findElement(By.id("alert")).click();


  } 

  public static void confirmations() {
      driver.get("https://www.selenium.dev/selenium/web/alerts.html");
      driver.findElement(By.id("confirm")).click();


  }

  public static void prompts(){
      driver.get("https://www.selenium.dev/selenium/web/alerts.html");
      driver.findElement(By.id("prompt")).click();


  }

  public static void waits(){
      driver.get("https://www.selenium.dev/selenium/web/alerts.html");
      driver.findElement(By.id("slow-alert")).click();


  }
}
