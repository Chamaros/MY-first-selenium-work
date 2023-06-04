package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Day01_TitleVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.techproeducation.com");

          // title is written at the top of the page. sekmenin ustunde en yukarida yazan sayfanin ismini belirten kisim
            // TO GET THE TITLE OF THE PAGE
        //driver.getTitle(); -> returns the page title
      String actualTitle =   driver.getTitle();
      String expectedTitle = "Techpro Education | Online It Coursess & Bootcamps"; //yanlis yapmak icin Course yerine Coursess yazdim
      System.out.println(actualTitle);

      // verify if actualTitle = expectedTitle
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("PASS");
        } else
            System.out.println("FAIL");
        System.out.println("ACTUAL: "+actualTitle);
        System.out.println("EXPECTED: "+expectedTitle);
        driver.quit();


    }
}
