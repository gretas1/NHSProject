package com.test.NHS.stepdefinitions;

import com.test.NHS.pages.LoginPage;
import com.test.NHS.utils.utils.ConfigReader;
import com.test.NHS.utils.utils.DriverHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class TC2StepDef {
    WebDriver driver = DriverHelper.getDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Given("the user navigate to the NHS website and try login")
    public void the_user_navigate_to_the_nhs_website_and_try_login() {
        driver.get(ConfigReader.readProperty("NHS_url"));
    }

    @Given("User validates the url of the main page")
    public void user_validates_the_url_of_the_main_page() {
        Assert.assertEquals(ConfigReader.readProperty("NHS_url"), driver.getCurrentUrl());
    }

    @When("the user enter the valid username and invalid password")
    public void the_user_enter_the_valid_username_and_invalid_password() {
        loginPage.TC2();
    }

    @Then("the user press the Sign in button")
    public void the_user_press_the_sign_in_button() {
        loginPage.signIn();
    }


}
