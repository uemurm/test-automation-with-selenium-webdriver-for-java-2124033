package interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import setup.Main;

public class Challenge_CompleteForm extends Main {

  public static void main(String[] args) {
    driver.get("https://www.selenium.dev/selenium/web/web-form.html");

    /*
     * TODO: add your solution here
     * Enter “username” in the Text input field
     * Enter passw0rd in the Password field
     * Write “I am learning Selenium WebDriver” in the Textarea field
     * Select the Three option from the dropdown
     * Deselect Checked checkbox
     * Select Default checkbox
     * Select Default radio
     * And click the Submit button
     */ 

    driver.quit();
  }
}