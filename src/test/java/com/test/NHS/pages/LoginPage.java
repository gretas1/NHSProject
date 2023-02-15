package com.test.NHS.pages;

import com.test.NHS.utils.utils.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(id = "inputEmail")
    WebElement userName;
    @FindBy(id = "inputPassword")
    WebElement password;
    @FindBy(xpath = "//button[contains(text(),'Sign in')]")
    WebElement signInButton;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void TC1() {
        userName.sendKeys(ConfigReader.readProperty("NHS_username"));
        password.sendKeys(ConfigReader.readProperty("NHS_password"));
    }

    public void signIn() {
        signInButton.click();
    }

    public void TC2() {
        userName.sendKeys(ConfigReader.readProperty("NHS_username"));
        password.sendKeys("admin1234");
    }

    public void TC3() {
        userName.sendKeys(ConfigReader.readProperty("NHS_username"));
        password.sendKeys("");

    }


}
