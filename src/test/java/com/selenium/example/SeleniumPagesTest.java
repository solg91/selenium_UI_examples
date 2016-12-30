package com.selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
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
    public void selectionProjectsTabTest() {
        driver.get(seleniumPageUrl);
        WebElement projectsTab = driver.findElement(By.cssSelector("#menu_projects>a"));
        projectsTab.click();

        //check correct url
        assertThat(driver.getCurrentUrl(), is("http://www.seleniumhq.org/projects/"));

    }
    @Test
    public void selectionDownloadTabTest() {
        driver.get(seleniumPageUrl);
        WebElement downloadTab = driver.findElement(By.id("menu_download"));
        downloadTab.click();

        //check correct Title
        assertThat(driver.getTitle(), is("Downloads"));
    }

    @Test
    public void selectionDocumentationTabTest() {
        driver.get(seleniumPageUrl);
        WebElement docTab = driver.findElement(By.cssSelector("[title=\"Technical references and guides\"]"));
        String cssBackgroundBeforeTest = docTab.getCssValue("background");

        docTab.click();

        WebElement docTabAfterSelection = driver.findElement(By.cssSelector("[title=\"Technical references and guides\"]"));
        String cssBackgroundAfterTest= docTabAfterSelection.getCssValue("background");

        //check was Documentation tab selected or not
        assertThat(cssBackgroundBeforeTest, is(not(cssBackgroundAfterTest)));
    }

    @Test
    public void selectionSupportTabTest() {
        driver.get(seleniumPageUrl);
        WebElement supportTab = driver.findElement(By.linkText("Support"));
        supportTab.click();

        //check correct url length
        assertThat(driver.getTitle().length(), is(12));
    }

    @Test
    public void selectionAboutTabTest() {
        driver.get(seleniumPageUrl);
        WebElement aboutTab = driver.findElement(By.cssSelector("#header li:nth-of-type(1)"));
        aboutTab.click();

        //check correct url endwith
        assertThat(driver.getCurrentUrl().endsWith("about/"), is(true));
    }

    //-------------------Navigations command()-------------

    @Test
    public void backButtonForTabTest() {
        driver.get(seleniumPageUrl);
        WebElement projectsTab = driver.findElement(By.cssSelector("#menu_projects>a"));
        projectsTab.click();
        WebElement aboutTab = driver.findElement(By.cssSelector("#header li:nth-of-type(1)"));
        aboutTab.click();
        driver.navigate().back();

        //check correct url endwith
        assertThat(driver.getCurrentUrl().endsWith("projects/"), is(true));
    }

    @Test
    public void forwardButtonForTabTest() {
        driver.get(seleniumPageUrl);
        WebElement projectsTab = driver.findElement(By.cssSelector("#menu_projects>a"));
        projectsTab.click();
        WebElement aboutTab = driver.findElement(By.cssSelector("#header li:nth-of-type(1)"));
        aboutTab.click();
        driver.navigate().back();
        driver.navigate().forward();
        //check correct url endwith
        assertThat(driver.getCurrentUrl().endsWith("about/"), is(true));
    }


}
