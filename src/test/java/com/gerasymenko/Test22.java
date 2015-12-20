package com.gerasymenko;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;

/**
 * Created by yadrit on 20.12.2015.
 */
public class Test22 {

    @Test
    public void newTest(){
        WebDriver driver1 = new ChromeDriver();
        WebDriver driver2 = new FirefoxDriver();
        driver1.get("http://comments.azurewebsites.net/");
        driver2.get("http://comments.azurewebsites.net/");

        String result1 = driver1.getTitle();
        String result2 = driver2.getTitle();
        assertEquals(result1, result2);

        driver1.get("http://comments.azurewebsites.net/");
        driver2.get("http://comments.azurewebsites.net/");

        String result11 = driver1.getCurrentUrl();
        String result22 = driver2.getCurrentUrl();
        assertEquals(result11, result22);

        driver1.get("http://comments.azurewebsites.net/");
        driver2.get("http://comments.azurewebsites.net/");

        WebElement result111 = driver1.findElement(By.id("applybutton"));
        WebElement result222 = driver1.findElement(By.id("applybutton"));
        assertEquals(result111, result222);
        driver1.quit();
        driver2.quit();
    }
}
