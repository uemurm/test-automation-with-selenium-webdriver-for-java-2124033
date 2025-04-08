package com.rock.yacht;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTests {

  protected static WebDriver driver;

  @BeforeAll  // For test runners such as JUnit.
  public static void setUp() {
    chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--no-sandbox"); // For GitHub Codespaces.
    driver = new ChromeDriver(options);
  }

  @AfterAll
  public static void tearDown() {
    driver.quit();
  }
}
