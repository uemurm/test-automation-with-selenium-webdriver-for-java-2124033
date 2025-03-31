package setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

final class InteractWithWebElements {
  static protected WebDriver driver = WebDriverSetup.initializeDriver();

  public static void main(String[] args) {
    driver.get("https://selenium.dev/selenium/web/web-form.html");

    WebElement textInput = driver.findElement(By.id("my-text-id"));
    textInput.sendKeys("username");

    WebElement password = driver.findElement(By.name("my-password"));
    password.sendKeys("password");

    WebElement textArea = driver.findElement(By.name("my-textarea"));
    textArea.sendKeys("I am learning Selenium WebDriver");

    Select dropdown = new Select(driver.findElement(By.name("my-select")));
    dropdown.selectByValue("3");

    WebElement checkbox1 = driver.findElement(By.id("my-check-1"));
    if (checkbox1.isSelected()) {
      checkbox1.click();
    }

    WebElement checkbox2 = driver.findElement(By.id("my-check-2"));
    if (!checkbox2.isSelected()) {
      checkbox2.click();
    }

    WebElement defaultRadio = driver.findElement(By.id("my-radio-2"));
    defaultRadio.click();

    String filePath = "/workspaces/test-automation-with-selenium-webdriver-for-java-2124033/README.md";
    WebElement uploadElement = driver.findElement(By.name("my-file"));
    uploadElement.sendKeys(filePath);

    WebElement submitBtn = driver.findElement(By.xpath("//button[text()='Submit']"));
    submitBtn.click();

    driver.quit();

    // for (int i = 0; i < 4; i++) {
    // // dropdown.deselectAll(); => java.lang.UnsupportedOperationException
    // dropdown.selectByIndex(i % 4);
    // System.out.println(dropdown.getFirstSelectedOption().getText());
    // }

    // WebElement returnLink =
    // driver.findElement(By.xpath("//a[normalize-space(text())='Return to
    // index']"));

    // driver.get("https://selenium.dev/selenium/web/formPage.html");
    // // WebElement emailBox = driver.findElement(By.id("email"));
    // List<WebElement> radioButtons =
    // driver.findElements(By.cssSelector("input[type='radio']"));

    // System.out.println(radioButtons.size());

    // WebElement bottomButton = driver.findElement(
    // RelativeLocator.with(By.name("submit")).below(By.id("submit"))
    // );
    // WebElement imageButton = driver.findElement(By.id("imageButton"));

    // WebElement clickButton =
    // driver.findElement(By.cssSelector("input[value='Click!']"));
    // WebElement textbox = driver.findElement(By.name("id-name1"));
    // System.out.println(textbox.getText());
    // textbox.clear();
    // textbox.sendKeys("FOO");

  }

}
