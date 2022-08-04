package com.upgenix.step_definitions;

import com.github.javafaker.Faker;
import com.upgenix.pages.HomePage_Esra;
import com.upgenix.pages.LoginPage_Esra;
import com.upgenix.utilities.BrowserUtils;
import com.upgenix.utilities.ConfigurationReader;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import javax.sql.rowset.BaseRowSet;

public class Surveys_StepDefinitions_Esra {

    LoginPage_Esra loginPage_esra = new LoginPage_Esra();
    HomePage_Esra homePage_esra = new HomePage_Esra();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("User enters the valid credentials")
    public void user_enters_the_valid_credentials() {
        loginPage_esra.emailInput.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage_esra.passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage_esra.loginButton.click();
    }

    @Then("User is on homepage and verifies that title contains {string}")
    public void user_is_on_homepage_and_verifies_that_title_contains(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }

    @When("User clicks on the Surveys module and verifies the title is {string}")
    public void user_clicks_on_the_surveys_module_and_verifies_the_title_is(String string) {
        BrowserUtils.waitForClickablility(homePage_esra.surveysModule,10);
        homePage_esra.surveysModule.click();
        BrowserUtils.verifyElementDisplayed(homePage_esra.surveyCreateButton);
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }

    @When("User clicks on the Create button on the Surveys page")
    public void user_clicks_on_the_create_button_on_the_surveys_page() {
        homePage_esra.surveyCreateButton.click();
    }

    @Then("User verifies that the Title Form sheet is visible")
    public void user_verifies_that_the_title_form_sheet_is_visible() {
        Assert.assertTrue(homePage_esra.surveySheet.isDisplayed());
    }

    @When("User clicks on the Save button by leaving blank the Survey Title input")
    public void user_clicks_on_the_save_button_by_leaving_blank_the_survey_title_input() {
        homePage_esra.saveButton.click();
    }
    @Then("User should see the error message {string}")
    public void user_should_see_the_error_message(String string) {
        Assert.assertTrue(homePage_esra.errorMessage.getText().contains(string));
    }

    Faker faker = new Faker();

    String title = "BingBang" + faker.numerify("#");

    @When("User fills in the Survey Title input and clicks on the Save button")
    public void user_fills_in_the_survey_title_input_and_clicks_on_the_save_button() {

        homePage_esra.titleInput.sendKeys(title);
        homePage_esra.saveButton.click();
    }

    @Then("User verifies the {string} message under the survey form sheet")
    public void user_verifies_the_message_under_the_survey_form_sheet(String string) {
        BrowserUtils.waitForVisibility(homePage_esra.editButton,10);
        BrowserUtils.waitFor(2);
        Assert.assertTrue(homePage_esra.createdMessage.getText().contains(string));
    }

    @When("User clicks on the Surveys module")
    public void userClicksOnTheSurveysModule() {
        homePage_esra.surveysModule.click();
        BrowserUtils.waitForVisibility(homePage_esra.surveyCreateButton,10);
    }

    @Then("User verifies that the created survey is listed on the Surveys page")
    public void user_verifies_that_the_created_survey_is_listed_on_the_surveys_page() {
        homePage_esra.surveysModule.click();
        BrowserUtils.waitForVisibility(homePage_esra.searchBox,10);
        BrowserUtils.waitFor(2);

        homePage_esra.searchBox.sendKeys(title+Keys.ENTER);
        BrowserUtils.waitForVisibility(homePage_esra.createdSurvey,10);
        BrowserUtils.waitFor(2);

        Assert.assertTrue(homePage_esra.createdSurvey.isDisplayed());

        //Assert.assertTrue(homePage_esra.createdSurvey.getText().contains(title));
        homePage_esra.createdSurvey.click();
        BrowserUtils.waitFor(3);
        Assert.assertTrue(Driver.getDriver().getTitle().contains(title));

    }



}
