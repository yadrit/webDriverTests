package com.gerasymenko;

import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;
/**
 * Created by yadrit on 20.12.2015.
 */
public class Test1 {

    @Test
    public void testOne(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadrit\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver1 = new ChromeDriver();
        WebDriver driver2 = new FirefoxDriver();

        driver1.get("http://comments.azurewebsites.net/");
        driver2.get("http://comments.azurewebsites.net/");
        String result1 = driver1.getPageSource();
        String result2 = driver2.getPageSource();

        assertEquals(result1, result2);
        driver1.quit();
        driver2.quit();
    }
}
