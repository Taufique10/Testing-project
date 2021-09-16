package com.browseConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxConfig {

    public static WebDriver driver;

    public static void main(String[] args) {

        launch_Firefox();
        close_Firefox();


    }

    public static void launch_Firefox(){
    System.setProperty("webdriver.gecko.driver","./src/main/resources/geckodriver.exe");
    driver=new FirefoxDriver();
     }

     public static void close_Firefox(){

        driver.close();
     }
}
