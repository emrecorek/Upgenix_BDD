package com.upgenix.step_definitions;

import com.upgenix.pages.LoginPage_Mehmet;
import com.upgenix.pages.MainPage_Mehmet;
import com.upgenix.utilities.BrowserUtils;
import com.upgenix.utilities.ConfigurationReader;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class NewCustomerFormCreation_Positive_StepDefinitions_Mehmet {

    LoginPage_Mehmet loginPage = new LoginPage_Mehmet();
    MainPage_Mehmet mainPage = new MainPage_Mehmet();

    @Given("User is on the upgenix login page")
    public void user_is_on_the_upgenix_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("User enters valid email {string} - password {string} and hits enter")
    public void user_enters_valid_email_password_and_hits_enter(String email, String password) {
        loginPage.email.sendKeys(email);
        loginPage.password.sendKeys(password+ Keys.ENTER);
    }
    @Then("User login successfully verify that title contains {string}")
    public void user_login_successfully_verify_that_title_contains(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }
    @When("User clicks on Sales button")
    public void user_clicks_on_sales_button() {

        mainPage.salesButton.click();

    }
    @When("User clicks on Customers button")
    public void user_clicks_on_customers_button() {
        BrowserUtils.waitForClickablility(mainPage.customerButton,10);
        mainPage.customerButton.click();

    }
    @When("User clicks on Create button")
    public void user_clicks_on_create_button() {
        BrowserUtils.waitForClickablility(mainPage.createButton,10);
        mainPage.createButton.click();

    }
    @Then("User successfully verifies that title contains {string}")
    public void user_successfully_verifies_that_title_contains(String string) {
        BrowserUtils.waitForClickablility(mainPage.formSheetCreateButton,10);
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));

    }

}
