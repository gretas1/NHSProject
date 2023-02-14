package com.test.NHS.stepdefinitions;

import com.test.NHS.utils.utils.BrowserUtils;
import com.test.NHS.utils.utils.DriverHelper;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class NHSHook {
    public WebDriver driver;

    @Before
    public void setup() {
        driver = DriverHelper.getDriver();//utils
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @After
    public void tearDown() {
        BrowserUtils.getScreenShot(driver, "NHS");
        //driver.quit();
    }
}
