package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T4_Config_Practice {

//    public WebDriver driver;
//
//    @BeforeMethod
//    public void setupMethod() {
//        //1- Open a chrome browser
//        //2- Go to: https://google.com
//
//        String browserType = ConfigurationReader.getProperty("browser");
//        driver = WebDriverFactory.getDriver(browserType);
//
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get("https://google.com");
//        WebElement googleAgreeButton = driver.findElement(By.xpath("//button[@id='L2AGLb']"));
//        googleAgreeButton.click();
//    }

    @Test
    public void google_search_test(){
        //Driver.getDriver() --> driver

        Driver.getDriver().get("https://google.com");

//        3- Write “apple” in search box
        WebElement googleSearchBox = Driver.getDriver().findElement(By.xpath("//input[@name='q']"));

        googleSearchBox.sendKeys(ConfigurationReader.getProperty("searchValue") + Keys.ENTER);

//        4- Verify title:
//        Expected: apple - Google Search
        String expectedTitle = ConfigurationReader.getProperty("searchValue") + " - Google Search";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);

    }

}
