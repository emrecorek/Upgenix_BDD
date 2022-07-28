package com.upgenix.step_definitions;

import com.upgenix.pages.LoginPage_Ayse;
import com.upgenix.pages.MainPage_Ayse;
import com.upgenix.utilities.BrowserUtils;
import com.upgenix.utilities.ConfigurationReader;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewVehicleContract_StepDefinitions_Ayse {

    LoginPage_Ayse loginPage_ayse = new LoginPage_Ayse();
    MainPage_Ayse mainPage_ayse = new MainPage_Ayse();

    @Given("user is on the upgenix login web page")
    public void userIsOnTheUpgenixLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("User enters correct email {string} - password {string} and hits enter")
    public void user_enters_valid_email_password_and_hits_enter(String email, String password) {
        loginPage_ayse.email.sendKeys(email);
        loginPage_ayse.password.sendKeys(password+ Keys.ENTER);
    }
    @Then("User login and verify that title contains {string}")
    public void user_login_successfully_verify_that_title_contains(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }


    @When("user clicks on {string} module from the homepage")
    public void userClicksOnModuleFromTheHomepage(String arg0) {
        mainPage_ayse.moreButton.click();
    }

    @And("user clicks on {string} option")
    public void userClicksOnOption(String arg0) {
        mainPage_ayse.fleetButton.click();
    }

    @And("user clicks on {string} button from vehicle page")
    public void userClicksOnButtonFromVehiclePage(String arg0) {
        mainPage_ayse.vehicleContractsButton.click();
    }

    @And("user clicks on {string} button")
    public void userClicksOnButton(String arg0) {
        mainPage_ayse.createButton.click();
    }

    @Then("user successfully verifies that title contains {string}")
    public void userSuccessfullyVerifiesThatTitleContains(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }


    @When("user chooses the option {string} from vehicle dropdown")
    public void userChoosesTheOptionFromVehicleDropdown(String arg0) {
        Driver.getDriver().get("https://qa.upgenix.net/web?#id=&view_type=form&model=fleet.vehicle.log.contract&menu_id=146&action=163");
     mainPage_ayse.dropdownVehicle.click();
     mainPage_ayse.selectAudi.click();
    }

    @And("user chooses {string} option from the {string} dropdown")
    public void userChoosesOptionFromTheDropdown(String arg0, String arg1) {
        mainPage_ayse.dropdownType.click();
        mainPage_ayse.leasing.click();
    }

    @And("user can enter {string} as a valid amount in the {string} case")
    public void userCanEnterAsAValidAmountInTheCase(String arg0, String arg1) {
        mainPage_ayse.activationCostInput.clear();
        mainPage_ayse.activationCostInput.sendKeys("129,90");
    }

    @And("user chooses the option {string} from the {string} dropdown and gives a valid recurring cost amount")
    public void userChoosesTheOptionFromTheDropdownAndGivesAValidRecurringCostAmount(String arg0, String arg1) {
        //need one more code
        Select select = new Select(mainPage_ayse.dropdowmRecurring);

        select.selectByVisibleText("Weekly");

        mainPage_ayse.recurringCostAmountInput.clear();
        mainPage_ayse.recurringCostAmountInput.sendKeys("9,90");
    }

    @And("user clicks on save button")
    public void userClicksOnSaveButton() {
        mainPage_ayse.saveButton.click();
    }

    @Then("user successfully verify that title contains {string}")
    public void userSuccessfullyVerifyThatTitleContains(String string) {
        //BrowserUtils.waitFor(2);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.titleContains("Audi/A1/1-AUD-001 / Leasing / 2022-07-28 - Odoo"));

        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }

    @Then("user sees : {string} error message")
    public void userSeesErrorMessage(String string) {
        Assert.assertTrue(mainPage_ayse.errorMessage.getText().contains(string));
    }

    @Then("user verifies that vehicle name is listed in vehicle contracts module")
    public void userVerifiesThatVehicleNameIsListedInVehicleContractsModule() {
    }

    @And("user clicks on {string}")
    public void userClicksOn(String arg0) {
        mainPage_ayse.vehicleContractsButton.click();
    }


}
