package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.DriverManager;

public class Day01_URLVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.techproeducation.com");

        // GETTING THE PAGE URL
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.techproeducationn.com"; // BILEREK YANLIS YAPTIM

        // VERIFY
        if (actualURL.equals(expectedURL)) {
            System.out.println("PASS");
        } else
            System.out.println("FAIL");
        System.out.println("ACTUAL URL: "+actualURL);
        System.out.println("EXPECTED URL: "+expectedURL);

        driver.quit();
    }
}
