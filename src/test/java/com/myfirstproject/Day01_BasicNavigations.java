package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_BasicNavigations {
    /*
    steps:
    create a new class unde: Basic navigations
    create main method
    set path
    create chrome driver
    Maximize the window
    open google home page https://www.walmart.com/.NBSP
    on the same class'navigate to amazon home page https://www.amazon.com
    navigate back to google
    navigate forward to amazon
    refresh the page
    close /quit the browser
     */
    public static void main(String[] args) throws InterruptedException {
        // set driver and path
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
        // chromedriver.exe windows icin ancak dosya isminin exe olarak uzantisi yoksa .exe yazmaya gerek yok

       // create webdriver object
        WebDriver driver = new ChromeDriver();

        // Maximize the window. BURAYA DA YAZILABILIR

        //START YOUR TEST CASE
        driver.get("https://www.youtube.com");// get ("URL")-> GO to a URL

        Thread.sleep(3000); // WAIT FOR 3 SECONDS AT THIS POINT. BU 5000 MILI SANIYE DEMEK
        // BU JAVADA BEKLEME. BUNU NORMALDE KULLANMIYORUZ. SELENIUM A OZEL DE VAR. ONU KULLANCAGIZ.

// Maximize the window
        driver.manage().window().maximize();// BU SATIRI WEB ADRESI YAZDIGIMIZ SATIRIN ALTINA
        // YA DA USTUNE YAZSAK DA AYNI. HER IKI DURUMDA DA MAXIMIZE YAPIYOR.

        Thread.sleep(3000); // WAIT FOR 3 SECONDS AT THIS POINT

        // ON THE SAME CLASS NAVIGATE TO AMAZON HOME PAGE https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");


        // ON THE SAME CLASS NAVIGATE TO google HOME PAGE https://www.amazon.com/
        driver.get("https://www.google.com/");


        driver.navigate().back();// bu bizi bir onceki sayfaya goturur. yani amazon.com a

        driver.navigate().back();// bu bizi amzondan da bir onceki sayfaya goturur. yani youtube.com a


        driver.navigate().forward(); //bu bizi tekrar amazona goturur.


        driver.navigate().forward(); //bu bizi tekrar google a goturur.

        driver.navigate().refresh();

        //to close or quit the browser
        // there are 2 options
        // driver.quit(); ikisinden birini kullanabiliriz
        driver.close(); //ikisinden birini kullanabiliriz
    }






}
