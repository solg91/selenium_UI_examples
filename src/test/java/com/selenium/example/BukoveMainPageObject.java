package com.selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by solg on 07.02.2017.
 */
public class BukoveMainPageObject {

    WebDriver driver;

    public static WebElement planTab(WebDriver driver) {
        WebElement element = driver.findElement(By.cssSelector("[data-content=plan]"));
        return element;
    }

    public static WebElement openBukovel(WebDriver driver) {
        WebElement element = driver.findElement(By.xpath("//a[@class=\"links-transition open-menu-link open-menu-link-style2\"]/span"));
        return element;

    }
    public static List<WebElement> list(WebDriver driver) {
        List<WebElement> allOptions = driver.findElements(By.xpath("div#planTab div.info-tab-left-menu a"));
        return allOptions;
    }

    public static WebElement action(WebDriver driver) {
        WebElement element = driver.findElement(By.xpath("//span[contains(text(), \"Акції\")]"));
        return element;
    }
    public static WebElement language(WebDriver driver) {
        WebElement element = driver.findElement(By.xpath("//span[@class=\"lang-label\"]"));
        return element;
    }

    public static WebElement languageEn(WebDriver driver) {
        WebElement element = driver.findElement(By.xpath("//*[@id='langDropdown']/ul/li[1]/a"));
        return element;

        //div[@id='langDropdown']//a[@href="/en/status/"]
    }




}
