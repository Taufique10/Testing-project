package com.BrowserSize;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetBrowserSize {

    public static WebDriver driver;

    public static void main(String[] args) {
        launch_chrome();
        getMaxSize();

        close_Chrome();

    }

    public static void launch_chrome(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void getMaxSize(){
        Dimension maxSize=driver.manage().window().getSize();
        System.out.println(maxSize);
        int Width=maxSize.getWidth();
        int Height=maxSize.getHeight();
        System.out.println("Width:"+Width+"Height:"+Height);
    }



    public static void close_Chrome(){
        driver.close();
    }
}
