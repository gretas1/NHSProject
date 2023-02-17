package com.test.NHS.pages;

import com.test.NHS.utils.utils.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    @FindBy(id = "patientsInRooms")
    WebElement patientsWithRoomsBox;
    @FindBy(xpath = "//div/div[contains(text(),'Patients with rooms')]")
    WebElement headerOfBlueBox;
    @FindBy(id = "patients-waiting-live")
    WebElement patientsWaitingBox;
    @FindBy(xpath = "//div/div[contains(text(),'Patients waiting')]")
    WebElement headerOfRedBox;
    @FindBy(id = "free-rooms-live")
    WebElement freeRoomsBox;
    @FindBy(xpath = "//div/div[contains(text(),'Free rooms')]")
    WebElement headerOfOrangeBox;

    public DashboardPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void validationOfBlueBox() {
        Assert.assertTrue(patientsWithRoomsBox.isDisplayed());

    }

    public String validateHeaderOfBlueBox() throws InterruptedException {
        Thread.sleep(2000);
        return BrowserUtils.getText(headerOfBlueBox);
    }

    public void validationOfRedBox() {
        Assert.assertTrue(patientsWaitingBox.isDisplayed());


    }

    public String validateHeaderOfRedBox() throws InterruptedException {
        Thread.sleep(2000);
        return BrowserUtils.getText(headerOfRedBox);
    }

    public void validationOfOrangeBox() {
        Assert.assertTrue(freeRoomsBox.isDisplayed());

    }

    public String validateHeaderOfOrangeBox() throws InterruptedException {
        Thread.sleep(2000);
        return BrowserUtils.getText(headerOfOrangeBox);

    }
}



