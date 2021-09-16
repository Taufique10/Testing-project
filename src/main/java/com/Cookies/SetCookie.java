package com.Cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class SetCookie {
    public static WebDriver driver;

    public static void main(String[] args) {


        launch_Chrome();
        openURL();
        addCookie();
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

    public static void addCookie(){
        Cookie cok=new Cookie("Taufique","Test Cookie set by Automated Script");
        driver.manage().addCookie(cok);
    }

    public static void getAllCookie(){
        Set allCookies=driver.manage().getCookies();
        System.out.println(allCookies);
        System.out.println("Number Of Cookies Present: "+ allCookies.size());
    }
}

