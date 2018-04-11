package com.mysecondproject;

import org.apache.commons.lang3.builder.ToStringExclude;
import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;


/**
 * Homepage
 */
public class HomePage extends WebPage {



    public static void browser() {
       // System.setProperty("webdriver.gecko.driver","C:\\Cucumbe jars\\WebDrivers\\geckodriver.exe");
      // WebDriver driver = new FirefoxDriver();
       // System.setProperty("webdriver.chrome.driver", "C:\\Cucumbe jars\\chromedriver.exe");
      //  WebDriver driver = new ChromeDriver();
        //System.setProperty("webdriver.ie.driver", "C:\\Cucumbe jars\\IEDriverServer.exe");
        System.setProperty("webdriver.ie.driver", "C:\\Cucumbe jars\\MicrosoftWebDriver.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.get("http://demo.nopcommerce.com");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        //driver.quit();
    }
    public static void main(String[] args) throws Exception{

        browser();
    }
}
