package com.selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by solg on 07.02.2017.
 */
public class PageObjectBukaMain {

    private WebDriver driver;

    By planButton = By.cssSelector("[data-content=plan]");
    By openBukovelButton = By.xpath("//a[@class=\"links-transition open-menu-link open-menu-link-style2\"]/span");
    By planDropDownList = By.cssSelector("div#planTab div.info-tab-left-menu a");
    By actionButton = By.xpath("//span[contains(text(), \"Акції\")]");
    By languageButton = By.xpath("//span[@class=\"lang-label\"]");
    By languageEnButton = By.xpath("//*[@id='langDropdown']/ul/li[1]/a");
    By openBukovelDropDownList = By.xpath("//a[@class=\"links-transition open-menu-link open-menu-link-style2 active\"]");

    public WebElement getWebElement(WebDriver driver, By byElement) {
        return driver.findElement(byElement);
    }

    public void clickToElement(WebDriver driver, By byElement) {
        WebElement element = driver.findElement(byElement);
        element.click();

    }

    public List<WebElement> getListOfElements(WebDriver driver, By element) {
        List<WebElement> allOptions = driver.findElements(element);
        return allOptions;
    }

    public String getElementAttribute(WebDriver driver, By byElement, String s) {
        WebElement element = driver.findElement(byElement);
        return element.getAttribute(s);

    }
}
