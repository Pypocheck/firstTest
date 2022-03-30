package ru.webLandia;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tests {
    public ChromeDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/kdanilova/Documents/firstTest/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void firstTest(){
        driver.get("https://web-landia.ru/");
        WebElement news = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[3]/div/a"));
        news.click();
        WebElement ret = driver.findElement(By.cssSelector("body > div > div.header > div > div.center > div > a > img"));
        ret.click();
    }

   @After
    public void close(){
       driver.quit();
    }
}
