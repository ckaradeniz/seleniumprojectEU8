package com.cydeo.tests.day2_locators_getText_getAttribute.homeWorks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_EtsyTitleVerification {

    public static void main(String[] args) {

//        TC #1: Etsy Title Verification
//        1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


//        2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");

        driver.findElement(By.cssSelector("#gdpr-single-choice-overlay > div > div.wt-overlay__footer.wt-pt-xs-3 > div:nth-child(2) > button")).click();


//        3. Search for “wooden spoon”
        WebElement searchInput = driver.findElement(By.name("search_query"));
        searchInput.sendKeys("wooden spoon" + Keys.ENTER);

//        4. Verify title:
//        Expected: “Wooden spoon | Etsy”
        String expectedTitle = "Wooden spoon | Etsy";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("Title verification PASSED!");
        }else {
            System.out.println("Title verification FAILED!!!");
        }

        driver.close();


    }
}
