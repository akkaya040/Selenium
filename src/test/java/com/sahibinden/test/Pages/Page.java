package com.sahibinden.test.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Page {

    private WebDriver driver;

    public Page startDriver()   {

        String driverPath =  System.getProperty("user.dir");
        System.out.println("Project path : " + driverPath);
        System.setProperty("webdriver.chrome.driver", "/Users/optiim/seleniumSahibinden/chromedriver");

        driver = new ChromeDriver();

        // tum elementler icin maksimum 15 bekleyeck
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        return this;
    }

    public Page stopDriver() {
        driver.close();
        driver.quit();


        return this;
    }



}
