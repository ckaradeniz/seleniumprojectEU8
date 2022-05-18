package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        //Do browser driver setup
        //Open browser
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDown(){

        driver.close();
    }

    @Test
    public void selenium_test(){

        //Maximize the page
        driver.manage().window().maximize();

        //Implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Get "https://google.com"
        driver.get("https://google.com");

        WebElement clickToAccept = driver.findElement(By.xpath("//div[.='Ik ga akkoord']"));
        clickToAccept.click();

        //Assert: title is "Google"

        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";


        Assert.assertEquals(actualTitle,expectedTitle, "Title is not matching here.");

    }


}
