package com.selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by solg on 10.02.2017.
 */
public class PageObjectSeleniumSupport {

    private WebDriver driver;

    By supportTab = By.linkText("Support");

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
