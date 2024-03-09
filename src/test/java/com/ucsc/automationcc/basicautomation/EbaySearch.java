package com.ucsc.automationcc.basicautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EbaySearch {

    WebDriver driver;
    @BeforeMethod
    public void initBrowser(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void basicSearch(){

        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("mobile phone");
        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();

    }

    @AfterMethod
    public void quitBrowser(){
        driver.quit();
    }

}
