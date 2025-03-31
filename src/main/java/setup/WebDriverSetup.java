package setup;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverSetup {
  public static WebDriver initialiseDriver() {
    chromedriver().setup();
    var options = new ChromeOptions();
    options.addArguments("--no-sandbox");

    return new ChromeDriver(options);
  }
}
