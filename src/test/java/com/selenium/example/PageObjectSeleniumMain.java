package com.selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by solg on 09.02.2017.
 */
public class PageObjectSeleniumMain {
    private WebDriver driver;

    By projectsTab = By.cssSelector("#menu_projects>a");
    By downloadTab = By.id("menu_download");
    By documentTab = By.cssSelector("[title=\"Technical references and guides\"]");
    By supportTab = By.linkText("Support");
    By aboutTab = By.linkText("About");

    public WebElement getWebElement(WebDriver driver, By byElement) {
        return driver.findElement(byElement);
    }

    public void clickToElement(WebDriver driver, By byElement) {
        WebElement element = driver.findElement(byElement);
        element.click();
    }

    public String getElementCssValue(WebDriver driver, By byElement, String value) {
        WebElement element = driver.findElement(byElement);
        return element.getCssValue(value);
    }
}