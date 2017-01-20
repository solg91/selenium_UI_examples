package com.selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by stambola on 18.01.17.
 */
public class XPathSeleniumPagesTest {
    private WebDriver driver;
    String seleniumPageUrl = "http://www.seleniumhq.org/download";


    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/home/stambola/Downloads/chromedriver");
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
        WebElement javaTest = driver.findElement(By.xpath("//div[@id='mainContent']/table[1]/tbody/tr[1]/td[4]/a"));
        String s = javaTest.getAttribute("href");
        System.out.println(s);
    }

    @Test
    public void getSharpLinkDownloadTest() {
        driver.get(seleniumPageUrl);
        WebElement javaTest = driver.findElement(By.xpath("//div[@id='mainContent']//table//tr[2]//*[text()='Download']"));
        String s = javaTest.getAttribute("href");
        System.out.println(s);
    }

    @Test
    public void getRubyLinkDownloadTest() {
        driver.get(seleniumPageUrl);
        WebElement javaTest = driver.findElement(By.xpath("//tr/td[contains(text(), \"Ruby\")]/following-sibling::td[a][1]/a"));
        String s = javaTest.getAttribute("href");
        System.out.println(s);
    }

    @Test
    public void getPythonLinkDownloadTest() {
        driver.get(seleniumPageUrl);
        WebElement javaTest = driver.findElement(By.xpath(".//td/a[@href=\"http://pypi.python.org/pypi/selenium\"]"));
        String s = javaTest.getAttribute("href");
        System.out.println(s);
    }

    @Test
    public void getJavaScriptLinkDownloadTest() {
        driver.get(seleniumPageUrl);
        WebElement javaTest = driver.findElement(By.xpath(".//table[1]//tr[5]/td[text()='Javascript (Node)']/following::td[3]/a"));
        String s = javaTest.getAttribute("href");
        System.out.println(s);
    }


    @Test
    public void getMozillaIssueTrackerLinkTest() {
        driver.get(seleniumPageUrl);
        WebElement javaTest = driver.findElement(By.xpath("//*[@id='mainContent']/table[2]//tr[1]/td[4]/a"));
        String s = javaTest.getAttribute("href");
        System.out.println(s);
    }
    @Test
    public void getChromeIssueTrackerLinkTest() {
        driver.get(seleniumPageUrl);
        WebElement javaTest = driver.findElement(By.xpath(".//a[text()='Google Chrome Driver']/following::td[3]/a"));
        String s = javaTest.getAttribute("href");
        System.out.println(s);
    }
    @Test
    public void getOperaIssueTrackerLinkTest() {
        driver.get(seleniumPageUrl);
        WebElement javaTest = driver.findElement(By.xpath("//*[@id='mainContent']/table[2]/tbody/tr[3]/node()/a[text()=\"issue tracker\"]"));
        String s = javaTest.getAttribute("href");
        System.out.println(s);
    }

    @Test
    public void getGhostDriverIssueTrackerLinkTest() {
        driver.get(seleniumPageUrl);
        WebElement javaTest = driver.findElement(By.xpath("//table[2]//td[text()='(PhantomJS)']/following-sibling::*//a[contains(text(),\"issue tracker\")]"));
        String s = javaTest.getAttribute("href");
        System.out.println(s);
    }
    @Test
    public void getMicrosoftIssueTrackerLinkTest() {
        driver.get(seleniumPageUrl);
        WebElement javaTest = driver.findElement(By.xpath("//*[@id='mainContent']/table[2]//tr[5]/td[4]/a"));
        String s = javaTest.getAttribute("href");
        System.out.println(s);
    }
    @Test
    public void getSafariDriverIssueTrackerLinkTest() {
        driver.get(seleniumPageUrl);
        WebElement javaTest = driver.findElement(By.xpath(".//a[text()='SafariDriver']/following::td[3]/a"));
        String s = javaTest.getAttribute("href");
        System.out.println(s);
    }
    @Test
    public void getWindowsPhoneIssueTrackerLinkTest() {
        driver.get(seleniumPageUrl);
        WebElement javaTest = driver.findElement(By.xpath("//*[@id='mainContent']/table[2]/tbody/tr[7]/node()/a[text()=\"issue tracker\"]"));
        String s = javaTest.getAttribute("href");
        System.out.println(s);
    }
    @Test
    public void getWindowsPhoneSecondIssueTrackerLinkTest() {
        driver.get(seleniumPageUrl);
        WebElement javaTest = driver.findElement(By.xpath(".//*[@id='mainContent']/table[2]/tbody/tr[8]/td[4]/a"));
        String s = javaTest.getAttribute("href");
        System.out.println(s);
    }

    @Test
    public void getSelendroidIssueTrackerLinkTest() {
        driver.get(seleniumPageUrl);
        WebElement javaTest = driver.findElement(By.xpath("//*[@id='mainContent']/table[2]//tr[9]/td[4]/a"));
        String s = javaTest.getAttribute("href");
        System.out.println(s);
    }
    @Test
    public void getIosDriverIssueTrackerLinkTest() {
        driver.get(seleniumPageUrl);
        WebElement javaTest = driver.findElement(By.xpath("//table[2]//a[text()='ios-driver']/following::td[3]/a"));
        String s = javaTest.getAttribute("href");
        System.out.println(s);
    }
    @Test
    public void getBlackberryIssueTrackerLinkTest() {
        driver.get(seleniumPageUrl);
        WebElement javaTest = driver.findElement(By.xpath("//*[@id='mainContent']/table[2]/tbody/tr[11]/node()/a[text()=\"issue tracker\"]"));
        String s = javaTest.getAttribute("href");
        System.out.println(s);
    }
    @Test
    public void getAppiumIssueTrackerLinkTest() {
        driver.get(seleniumPageUrl);
        WebElement javaTest = driver.findElement(By.xpath("//table[2]//a[@href=\"https://github.com/appium/appium/issues\"]"));
        String s = javaTest.getAttribute("href");
        System.out.println(s);
    }
    @Test
    public void getCrossWalkIssueTrackerLinkTest() {
        driver.get(seleniumPageUrl);
        WebElement javaTest = driver.findElement(By.xpath("//table[2]//a[@href=\"https://github.com/appium/appium/issues\"]"));
        String s = javaTest.getAttribute("href");
        System.out.println(s);
    }

    @Test
    public void getQtWebDriverIssueTrackerLinkTest() {
        driver.get(seleniumPageUrl);
        WebElement javaTest = driver.findElement(By.xpath(".//a[text()='QtWebDriver']/following::td[3]/a"));
        String s = javaTest.getAttribute("href");
        System.out.println(s);
    }
    @Test
    public void getjBrowserDriverIssueTrackerLinkTest() {
        driver.get(seleniumPageUrl);
        WebElement javaTest = driver.findElement(By.xpath(".//table[2]//td/a[@title='Selenium Remote WebDriver implementation for automated testing of Windows desktop apps']/following::td[3]/a"));
        String s = javaTest.getAttribute("href");
        System.out.println(s);
    }
    @Test
    public void getWiniumDesktopIssueTrackerLinkTest() {
        driver.get(seleniumPageUrl);
        WebElement javaTest = driver.findElement(By.xpath(".//a[text()='Winium.Desktop']/following::td[3]/a"));
        String s = javaTest.getAttribute("href");
        System.out.println(s);
    }
    @Test
    public void getWiniumStoreAppsIssueTrackerLinkTest() {
        driver.get(seleniumPageUrl);
        WebElement javaTest = driver.findElement(By.xpath(".//table[2]//td/a[@title='Selenium Remote WebDriver implementation for automated testing of native Windows Store apps, tested on Windows Phone emulators']/following::td[3]/a"));
        String s = javaTest.getAttribute("href");
        System.out.println(s);
    }

    @Test
    public void getWiniumStoreAppsCodedUiIssueTrackerLinkTest() {
        driver.get(seleniumPageUrl);
        WebElement javaTest = driver.findElement(By.xpath(".//table[2]//td/a[@title='Selenium Remote WebDriver implementation for automated testing of native and hybrid apps, tested on Windows Phone emulators and devices']/following::td[3]/a"));
        String s = javaTest.getAttribute("href");
        System.out.println(s);
    }

}