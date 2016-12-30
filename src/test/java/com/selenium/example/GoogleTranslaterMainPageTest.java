package com.selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by solg on 28.12.2016.
 */
public class GoogleTranslaterMainPageTest {

    private WebDriver driver;
    String googleTranslaterPageUrl = "https://translate.google.com.ua/#en/ru/";


    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void translateTextTest() {
        driver.get(googleTranslaterPageUrl);

        WebElement textEditor = driver.findElement(By.cssSelector("textarea#source"));
        textEditor.sendKeys("Selector");

        WebElement myDynamicElement = driver.findElement(By.cssSelector("#result_box>span"));

        //check translation text
        assertThat(myDynamicElement.getText(), is("селектор"));
    }

    @Test
    public void selectionNewLanguageToBoard() {
        driver.get(googleTranslaterPageUrl);
        WebElement listbox = driver.findElement(By.cssSelector("#gt-sl-gms"));
        listbox.click();

        WebElement georgian = driver.findElement(By.cssSelector("#goog-menuitem-group-2 div:nth-of-type(5)"));
        georgian.click();

        WebElement therdBox = driver.findElement(By.cssSelector("div#gt-sl-sugg div:nth-of-type(3)"));
        //check new language in the list of available
        assertThat(therdBox.getText(), is("грузинська"));

    }

}
