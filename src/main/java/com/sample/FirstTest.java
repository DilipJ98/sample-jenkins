package com.sample;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FirstTest {

    static WebDriver driver = new ChromeDriver();
    static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public String alertsHandleMethod() {
        WebDriverManager.chromedriver().setup();

        driver.get("https://v1.training-support.net/selenium/javascript-alerts");

        driver.findElement(By.id("simple")).click();

        Alert al = driver.switchTo().alert();
        String text = al.getText();
        al.accept();
        return text;
    }

    void closeBrowser() {
        driver.close();
    }
}
