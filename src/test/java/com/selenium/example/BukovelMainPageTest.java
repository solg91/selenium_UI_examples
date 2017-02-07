package com.selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by solg on 30.12.2016.
 */
public class BukovelMainPageTest {
    private static WebDriver driver;
    String bukovelMainPageUrl = "http://bukovel.com/";

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
    public void bukovelPlanListTest() {

        driver.get(bukovelMainPageUrl);
        BukoveMainPageObject.planTab(driver).click();

        List<WebElement> allOptions = BukoveMainPageObject.list(driver);
        for (WebElement option : allOptions) {
            System.out.println(String.format("Значение: %s", option.getAttribute("href")));
        }
        //check second link
        assertThat(allOptions.get(1).getAttribute("href"), is("http://bukovel.com/ski/skipass"));
    }

    @Test
    public void bukovelPlanListOnEnglishTest() {

        driver.get(bukovelMainPageUrl);
        BukoveMainPageObject.language(driver).click();
        BukoveMainPageObject.languageEn(driver).click();
        BukoveMainPageObject.openBukovel(driver).click();

        WebElement element = driver.findElement(By.xpath("//a[@class=\"links-transition open-menu-link open-menu-link-style2 active\"]"));
        assertThat(element.getAttribute("title"), is("Explore Bukovel"));



    }


}
