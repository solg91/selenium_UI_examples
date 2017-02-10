package com.selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by solg on 09.02.2017.
 */
public class PageObjectSeleniumDocument {

    private WebDriver driver;

    By documentTab = By.cssSelector("[title=\"Technical references and guides\"]");

    public WebElement getWebElement(WebDriver driver, By byElement) {
        return driver.findElement(byElement);
    }


    public String getElementCssValue(WebDriver driver, By byElement, String value) {
        WebElement element = driver.findElement(byElement);
        return element.getCssValue(value);
    }

    public void clickToElement(WebDriver driver, By byElement) {
        WebElement element = driver.findElement(byElement);
        element.click();
    }

}
