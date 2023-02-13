package com.test.NHS;

import com.test.NHS.utils.utils.ConfigReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FirstTask {
    @Test
    public void nhsTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(ConfigReader.readProperty("NHS_url"));
        WebElement login = driver.findElement(By.id("inputEmail"));
        login.sendKeys(ConfigReader.readProperty("NHS_username"));
        WebElement password = driver.findElement(By.id("inputPassword"));
        password.sendKeys(ConfigReader.readProperty("NHS_password"));
        WebElement signInButton = driver.findElement(By.xpath("//button[contains(text(),'Sign in')]"));
        signInButton.click();
        Assert.assertEquals("NHS patients", driver.getTitle());


    }
}
