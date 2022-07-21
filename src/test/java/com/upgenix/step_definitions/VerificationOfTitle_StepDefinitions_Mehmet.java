package com.upgenix.step_definitions;

import com.github.javafaker.Faker;
import com.upgenix.pages.MainPage_Mehmet;
import com.upgenix.utilities.BrowserUtils;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class VerificationOfTitle_StepDefinitions_Mehmet {

    MainPage_Mehmet mainPage = new MainPage_Mehmet();

    Faker faker = new Faker();
    String name = String.valueOf(faker.name().firstName());

    @And("User creates a name and clicks on Save button")
    public void userCreatesAAndClicksOnSaveButton() {
        mainPage.name.sendKeys(name);
        mainPage.save.click();
    }

    @Then("User verifies that title contains name")
    public void userVerifiesThatTitleContains() {
        BrowserUtils.waitForVisibility(mainPage.edit,10);
        Assert.assertTrue(Driver.getDriver().getTitle().contains(name));
        //System.out.println("name = " + name);
    }
}
