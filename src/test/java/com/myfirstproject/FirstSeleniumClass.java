package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {
    public static void main(String[] args) {
        //  1. this class should know which driver will be used. and where is that driver.
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
        /* windows kullanicisi icin yukaridaki satirdaki chromedriver in sonuna .exe koymak zorundayiz
        DAHA DOGRUSU KLASOR ISMI chromedriver.exe degilse koymaya gerek yok */


        // 2. CREATE CHROMEDRIVER
        WebDriver driver = new ChromeDriver();

        /* 3. now that we set and created chromedriver, we can use that driver for
        automation of the test cases */

        driver.get("https://www.google.com");

    }


}
