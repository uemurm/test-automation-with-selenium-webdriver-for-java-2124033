package setup;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {

  static protected WebDriver driver;

  static {
    chromedriver().setup();

    var options = new ChromeOptions();
    options.addArguments("--no-sandbox");
    options.enableBiDi();
    
    driver = new ChromeDriver(options);
  }

  public static void main(String[] args) {
    driver.get("https://google.com");
    driver.quit();
  }
}
