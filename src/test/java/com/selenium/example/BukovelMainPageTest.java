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
    private WebDriver driver;
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
        WebElement planTab = driver.findElement(By.cssSelector("[data-content=plan]"));
        planTab.click();

        List<WebElement> allOptions = driver.findElements(By.cssSelector("div#planTab div.info-tab-left-menu a"));
        for (WebElement option : allOptions) {
            System.out.println(String.format("Значение: %s", option.getAttribute("href")));
        }
        //check second link
        assertThat(allOptions.get(1).getAttribute("href"), is("http://bukovel.com/ski/skipass"));
    }
}
