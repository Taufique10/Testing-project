package com.Cookies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GetCookie {

    public static WebDriver driver;

    public static void main(String[] args) {


        launch_Chrome();
        openURL();
        getAllCookie();
    }

    public static void launch_Chrome(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void openURL(){
        driver.get("https://www.youtube.com/");
    }

    public static void getAllCookie(){
        Set allCookies=driver.manage().getCookies();
        System.out.println(allCookies);
        System.out.println("Number Of Cookies Present: "+ allCookies.size());
    }
}
