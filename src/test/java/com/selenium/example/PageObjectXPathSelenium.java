package com.selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by solg on 10.02.2017.
 */
public class PageObjectXPathSelenium {
    private WebDriver driver;

    By javaLink = By.xpath("//div[@id='mainContent']/table[1]/tbody/tr[1]/td[4]/a");
    By sharpLink = By.xpath("//div[@id='mainContent']//table//tr[2]//*[text()='Download']");
    By rubyLink = By.xpath("//tr/td[contains(text(), \"Ruby\")]/following-sibling::td[a][1]/a");
    By pythonLink = By.xpath(".//td/a[@href=\"http://pypi.python.org/pypi/selenium\"]");
    By javaScriptLink = By.xpath(".//table[1]//tr[5]/td[text()='Javascript (Node)']/following::td[3]/a");
    By mozillaIssueTrackerLink = By.xpath("//*[@id='mainContent']/table[2]//tr[1]/td[4]/a");
    By chromeIssueTrackerLink = By.xpath(".//a[text()='Google Chrome Driver']/following::td[3]/a");
    By operaIssueTrackerLink = By.xpath("//*[@id='mainContent']/table[2]/tbody/tr[3]/node()/a[text()=\"issue tracker\"]");
    By ghostDriverIssueTrackerLink = By.xpath("//table[2]//td[text()='(PhantomJS)']/following-sibling::*//a[contains(text(),\"issue tracker\")]");
    By microsoftIssueTrackerLink = By.xpath("//*[@id='mainContent']/table[2]//tr[5]/td[4]/a");
    By safariIssueTrackerLink = By.xpath(".//a[text()='SafariDriver']/following::td[3]/a");
    By windowsPhoneIssueTrackerLink = By.xpath("//*[@id='mainContent']/table[2]/tbody/tr[7]/node()/a[text()=\"issue tracker\"]");
    By windowsPhoneSecondIssueTrackerLink = By.xpath(".//*[@id='mainContent']/table[2]/tbody/tr[8]/td[4]/a");
    By selendroidIssueTrackerLink = By.xpath("//*[@id='mainContent']/table[2]//tr[9]/td[4]/a");
    By iosDriverIssueTrackerLink = By.xpath("//table[2]//a[text()='ios-driver']/following::td[3]/a");
    By blackberryIssueTrackerLink = By.xpath("//*[@id='mainContent']/table[2]/tbody/tr[11]/node()/a[text()=\"issue tracker\"]");
    By appiumIssueTrackerLink = By.xpath("//table[2]//a[@href=\"https://github.com/appium/appium/issues\"]");
    By crossWalkIssueTrackerLink = By.xpath("//table[2]//a[@href=\"https://github.com/appium/appium/issues\"]");
    By qtWebDriverIssueTrackerLink = By.xpath(".//a[text()='QtWebDriver']/following::td[3]/a");
    By jBrowserDriverIssueTrackerLink = By.xpath(".//table[2]//td/a[@title='Selenium Remote WebDriver implementation for automated testing of Windows desktop apps']/following::td[3]/a");
    By winiumDesktopIssueTrackerLink = By.xpath(".//a[text()='Winium.Desktop']/following::td[3]/a");
    By winiumStoreAppsIssueTrackerLink = By.xpath(".//table[2]//td/a[@title='Selenium Remote WebDriver implementation for automated testing of native Windows Store apps, tested on Windows Phone emulators']/following::td[3]/a");
    By winiumStoreAppsCodedUiIssueTrackerLink = By.xpath(".//table[2]//td/a[@title='Selenium Remote WebDriver implementation for automated testing of native and hybrid apps, tested on Windows Phone emulators and devices']/following::td[3]/a");

    public WebElement getWebElement(WebDriver driver, By byElement) {
        return driver.findElement(byElement);
    }


    public void clickToElement(WebDriver driver, By byElement) {
        WebElement element = driver.findElement(byElement);
        element.click();
    }

    public String getElementAttribute(WebDriver driver, By byElement, String s) {
        WebElement element = driver.findElement(byElement);
        return element.getAttribute(s);

    }
}
