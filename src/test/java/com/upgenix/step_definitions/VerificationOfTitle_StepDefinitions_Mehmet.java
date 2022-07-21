package com.upgenix.step_definitions;

import com.upgenix.pages.MainPage_Mehmet;
import com.upgenix.utilities.BrowserUtils;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class VerificationOfTitle_StepDefinitions_Mehmet {

    MainPage_Mehmet mainPage = new MainPage_Mehmet();

    @And("User creates a {string} and clicks on Save button")
    public void userCreatesAAndClicksOnSaveButton(String string) {
        mainPage.name.sendKeys(string);
        mainPage.save.click();
    }

    @Then("User verifies that title contains {string}")
    public void userVerifiesThatTitleContains(String string) {
        BrowserUtils.waitForVisibility(mainPage.edit,10);
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }
}
