package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Day01_WebDriverManager {
    public static void main(String[] args) {
        //1. Setup chrome Driver. No longer System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");// bu link bu 2 satir yeter dedi. https://www.youtube.com/watch?v=7ZdlSW4S7h4
// ayrica list of chromium command line yandaki linkte bularak bu problemi cozdum   https://peter.sh/experiments/chromium-command-line-switches/
        // asagidakileri ve yukaridaki 2 satiri bu  linkten yaptim https://www.google.com/search?q=+org.openqa.selenium.remote.http.WebSocket%24Listener+onError&ei=dZEXZKSBMM6Rxc8P65eWwAQ&ved=0ahUKEwjkj676ien9AhXOSPEDHeuLBUgQ4dUDCA8&uact=5&oq=+org.openqa.selenium.remote.http.WebSocket%24Listener+onError&gs_lcp=Cgxnd3Mtd2l6LXNlcnAQAzIGCAAQBxAeMgYIABAHEB4yBQgAEIAEMgUIABCGA0oECEEYAFAAWABg_A5oAHABeACAAWKIAWKSAQExmAEAoAEBwAEB&sclient=gws-wiz-serp#fpstate=ive&vld=cid:8f1f419d,vid:ICP5CcxF35k
        //   DesiredCapabilities cp = new DesiredCapabilities();
       // cp.setCapability(ChromeOptions.CAPABILITY,options);
      //  options.merge(cp);

        // REST IS THE SAME
        // 2.CREATE WEBDRIVER OBJECT
        WebDriver driver = new ChromeDriver(options);

        // 3. write your test cases
   //        driver.get("https://www.google.com");
            driver.get("https://www.techproeducation.com");


    }
}
