package com.selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by solg on 09.02.2017.
 */
public class PageObjectSeleniumDownload {
    private WebDriver driver;

    By downloadLeftList = (By.id("nav"));


    public WebElement getWebElement(WebDriver driver, By byElement) {
        return driver.findElement(byElement);
    }
}
