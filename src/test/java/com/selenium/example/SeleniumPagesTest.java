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
import static org.hamcrest.core.IsNot.not;
import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by solg on 26.12.2016.
 */
public class SeleniumPagesTest {
    private WebDriver driver;
    String seleniumPageUrl = "http://www.seleniumhq.org";
    PageObjectSeleniumMain selMain = new PageObjectSeleniumMain();
    PageObjectSeleniumDownload selDownload = new PageObjectSeleniumDownload();
    PageObjectSeleniumDocument selDocument = new PageObjectSeleniumDocument();
    PageObjectSeleniumSupport selSupport = new PageObjectSeleniumSupport();
    PageObjectSeleniumAbout selAbout = new PageObjectSeleniumAbout();

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
    public void selectProjectsTabTest() {
        driver.get(seleniumPageUrl);

        selMain.clickToElement(driver, selMain.projectsTab);
        //check correct url
        assertThat(driver.getCurrentUrl(), is("http://www.seleniumhq.org/projects/"));
        assertThat(driver.getTitle(), is("Selenium Projects"));


    }
    @Test
    public void selectDownloadTabTest() {
        driver.get(seleniumPageUrl);
        selMain.clickToElement(driver, selMain.downloadTab);

        //check correct Title
        assertThat(driver.getTitle(), is("Downloads"));
        //check left list presence
        assertThat(selDownload.getWebElement(driver, selDownload.downloadLeftList).isDisplayed(), is(true));
    }

    @Test
    public void selectDocumentationTabTest() {
        driver.get(seleniumPageUrl);

        String cssBackgroundBeforeClick = selMain.getElementCssValue(driver, selMain.documentTab,"background");
        selMain.clickToElement(driver, selMain.documentTab);
        String cssBackgroundAfterClick= selDocument.getElementCssValue(driver, selDocument.documentTab,"background");

        //check was Documentation tab selected or not

        assertThat(driver.getCurrentUrl(), is("http://www.seleniumhq.org/docs/"));
        assertThat(cssBackgroundBeforeClick, is(not(cssBackgroundAfterClick)));
    }

    @Test
    public void selectSupportTabTest() {
        driver.get(seleniumPageUrl);
        selMain.clickToElement(driver, selMain.supportTab);

        //check correct url length
        assertThat(driver.getTitle().length(), is(12));
        assertThat(driver.getTitle(), is("Getting Help"));
    }

    @Test
    public void selectAboutTabTest() {
        driver.get(seleniumPageUrl);
        selMain.clickToElement(driver, selMain.aboutTab);

        //check correct url endwith
        assertThat(driver.getCurrentUrl().endsWith("about/"), is(true));
        assertThat(selAbout.getWebElement(driver, selAbout.aboutSeleList).isDisplayed(), is(true));
    }

    //-------------------Navigations command()-------------

    @Test
    public void browserBackButtonTest() {
        driver.get(seleniumPageUrl);
        selMain.clickToElement(driver, selMain.projectsTab);
        selMain.clickToElement(driver, selMain.aboutTab);
        driver.navigate().back();

        //check correct url endwith
        assertThat(driver.getCurrentUrl().endsWith("projects/"), is(true));
    }

    @Test
    public void BrowserForwardButtonTest() {
        driver.get(seleniumPageUrl);
        selMain.clickToElement(driver, selMain.projectsTab);
        selMain.clickToElement(driver, selMain.aboutTab);
        driver.navigate().back();
        driver.navigate().forward();
        //check correct url endwith
        assertThat(driver.getCurrentUrl().endsWith("about/"), is(true));
    }


}
