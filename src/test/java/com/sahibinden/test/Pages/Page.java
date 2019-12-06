package com.sahibinden.test.Pages;

import com.sahibinden.test.ObjectRepos.ObjectRepo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.sahibinden.test.jLogger;

import java.util.concurrent.TimeUnit;

public class Page {

    private WebDriver driver;

    public Page runChrome()   {

        String driverPath =  System.getProperty("user.dir");
        System.out.println("Project path : " + driverPath);
        System.setProperty("webdriver.chrome.driver", "/Users/optiim/seleniumSahibinden/chromedriver");

        driver = new ChromeDriver();

        // tum elementler icin maksimum 15 bekleyeck
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        return this;
    }

    public Page runFirefox()   {

        String driverPath =  System.getProperty("user.dir");
        System.out.println("Project path : " + driverPath);
        System.setProperty("webdriver.firefox.driver", "/Users/optiim/seleniumSahibinden/firefoxdriver");

        driver = new FirefoxDriver();

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

    public Page openPage() {

        System.out.println("Driver is going to Sahibinden..");
        driver.get("https://www.sahibinden.com");

        return this;
    }


    public Page clickLoginButton() {

        // if(driver.findElement(ObjectRepo.buttonLogin).getSize() != 0){
        //
        // }

        driver.findElement(ObjectRepo.buttonLogin).click();

        return this;
    }
}
