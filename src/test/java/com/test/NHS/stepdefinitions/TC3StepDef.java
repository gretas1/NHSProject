package com.test.NHS.stepdefinitions;

import com.test.NHS.pages.LoginPage;
import com.test.NHS.utils.utils.ConfigReader;
import com.test.NHS.utils.utils.DriverHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class TC3StepDef {
    WebDriver driver = DriverHelper.getDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Given("the user navigated to the NHS website")
    public void the_user_navigated_to_the_nhs_website() {
        driver.get(ConfigReader.readProperty("NHS_url"));
    }

    @Given("User validated the url of the main page")
    public void user_validated_the_url_of_the_main_page() {
        Assert.assertEquals(ConfigReader.readProperty("NHS_url"), driver.getCurrentUrl());
    }

    @When("the user enter the valid username and empty password")
    public void the_user_enter_the_valid_username_and_empty_password() {
        loginPage.TC3();
    }

    @When("the user clicked the Sign in button")
    public void the_user_clicked_the_sign_in_button() {
        loginPage.signIn();
    }
//    @Then("the user validates the error message")
//    public void the_user_validates_the_error_message() {
//
//    }


}
