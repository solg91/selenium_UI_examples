package com.selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by stambola on 18.01.17.
 */
public class XPathSeleniumPagesTest {
    private WebDriver driver;
    String seleniumPageUrl = "http://www.seleniumhq.org/download";
    PageObjectXPathSelenium xPathSelenium = new PageObjectXPathSelenium();

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void getJavaLinkDownloadTest() {
        driver.get(seleniumPageUrl);
        System.out.println(xPathSelenium.getElementAttribute(driver, xPathSelenium.javaLink, "href"));
    }

    @Test
    public void getSharpLinkDownloadTest() {
        driver.get(seleniumPageUrl);
        System.out.println(xPathSelenium.getElementAttribute(driver, xPathSelenium.sharpLink, "href"));
    }

    @Test
    public void getRubyLinkDownloadTest() {
        driver.get(seleniumPageUrl);
        System.out.println(xPathSelenium.getElementAttribute(driver, xPathSelenium.rubyLink, "href"));
    }

    @Test
    public void getPythonLinkDownloadTest() {
        driver.get(seleniumPageUrl);
        System.out.println(xPathSelenium.getElementAttribute(driver, xPathSelenium.pythonLink, "href"));
    }

    @Test
    public void getJavaScriptLinkDownloadTest() {
        driver.get(seleniumPageUrl);
        System.out.println(xPathSelenium.getElementAttribute(driver, xPathSelenium.javaScriptLink, "href"));
    }

    @Test
    public void getMozillaIssueTrackerLinkTest() {
        driver.get(seleniumPageUrl);
        System.out.println(xPathSelenium.getElementAttribute(driver, xPathSelenium.mozillaIssueTrackerLink, "href"));
    }

    @Test
    public void getChromeIssueTrackerLinkTest() {
        driver.get(seleniumPageUrl);
        System.out.println(xPathSelenium.getElementAttribute(driver, xPathSelenium.chromeIssueTrackerLink, "href"));
    }

    @Test
    public void getOperaIssueTrackerLinkTest() {
        driver.get(seleniumPageUrl);
        System.out.println(xPathSelenium.getElementAttribute(driver, xPathSelenium.operaIssueTrackerLink, "href"));

    }

    @Test
    public void getGhostDriverIssueTrackerLinkTest() {
        driver.get(seleniumPageUrl);
        System.out.println(xPathSelenium.getElementAttribute(driver, xPathSelenium.ghostDriverIssueTrackerLink, "href"));
    }

    @Test
    public void getMicrosoftIssueTrackerLinkTest() {
        driver.get(seleniumPageUrl);
        System.out.println(xPathSelenium.getElementAttribute(driver, xPathSelenium.microsoftIssueTrackerLink, "href"));
    }

    @Test
    public void getSafariDriverIssueTrackerLinkTest() {
        driver.get(seleniumPageUrl);
        System.out.println(xPathSelenium.getElementAttribute(driver, xPathSelenium.safariIssueTrackerLink, "href"));
    }

    @Test
    public void getWindowsPhoneIssueTrackerLinkTest() {
        driver.get(seleniumPageUrl);
        System.out.println(xPathSelenium.getElementAttribute(driver, xPathSelenium.windowsPhoneIssueTrackerLink, "href"));
    }

    @Test
    public void getWindowsPhoneSecondIssueTrackerLinkTest() {
        driver.get(seleniumPageUrl);
        System.out.println(xPathSelenium.getElementAttribute(driver, xPathSelenium.windowsPhoneSecondIssueTrackerLink, "href"));
    }

    @Test
    public void getSelendroidIssueTrackerLinkTest() {
        driver.get(seleniumPageUrl);
        System.out.println(xPathSelenium.getElementAttribute(driver, xPathSelenium.selendroidIssueTrackerLink, "href"));
    }

    @Test
    public void getIosDriverIssueTrackerLinkTest() {
        driver.get(seleniumPageUrl);
        System.out.println(xPathSelenium.getElementAttribute(driver, xPathSelenium.iosDriverIssueTrackerLink, "href"));
    }

    @Test
    public void getBlackberryIssueTrackerLinkTest() {
        driver.get(seleniumPageUrl);
        System.out.println(xPathSelenium.getElementAttribute(driver, xPathSelenium.blackberryIssueTrackerLink, "href"));
    }

    @Test
    public void getAppiumIssueTrackerLinkTest() {
        driver.get(seleniumPageUrl);
        System.out.println(xPathSelenium.getElementAttribute(driver, xPathSelenium.appiumIssueTrackerLink, "href"));
    }

    @Test
    public void getCrossWalkIssueTrackerLinkTest() {
        driver.get(seleniumPageUrl);
        System.out.println(xPathSelenium.getElementAttribute(driver, xPathSelenium.crossWalkIssueTrackerLink, "href"));
    }

        @Test
    public void getQtWebDriverIssueTrackerLinkTest() {
        driver.get(seleniumPageUrl);
            System.out.println(xPathSelenium.getElementAttribute(driver, xPathSelenium.qtWebDriverIssueTrackerLink, "href"));
        }

    @Test
    public void getjBrowserDriverIssueTrackerLinkTest() {
        driver.get(seleniumPageUrl);
        System.out.println(xPathSelenium.getElementAttribute(driver, xPathSelenium.jBrowserDriverIssueTrackerLink, "href"));
    }

    @Test
    public void getWiniumDesktopIssueTrackerLinkTest() {
        driver.get(seleniumPageUrl);
        System.out.println(xPathSelenium.getElementAttribute(driver, xPathSelenium.winiumDesktopIssueTrackerLink, "href"));
    }

    @Test
    public void getWiniumStoreAppsIssueTrackerLinkTest() {
        driver.get(seleniumPageUrl);
        System.out.println(xPathSelenium.getElementAttribute(driver, xPathSelenium.winiumStoreAppsIssueTrackerLink, "href"));

    }

    @Test
    public void getWiniumStoreAppsCodedUiIssueTrackerLinkTest() {
        driver.get(seleniumPageUrl);
        System.out.println(xPathSelenium.getElementAttribute(driver, xPathSelenium.winiumStoreAppsCodedUiIssueTrackerLink, "href"));

    }

}