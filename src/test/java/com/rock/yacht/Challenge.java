package com.rock.yacht;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.rock.yacht.page_objects.DynamicallyModifiedPage;

public class Challenge extends BaseTests {

  private DynamicallyModifiedPage thePage;

  @BeforeEach
  public void launchPage() {
    String url = "https://www.selenium.dev/selenium/web/dynamicallyModifiedPage.html";
    driver.get(url);
    thePage = new DynamicallyModifiedPage(driver);
  }

  @Test
  public void elementExists() {
    assertTrue(thePage.hasElementPresent());
  }

  @Test
  public void removeElement() {
    thePage.clickDeleteBtn();
    assertFalse(thePage.hasElementPresent());
  }
}
