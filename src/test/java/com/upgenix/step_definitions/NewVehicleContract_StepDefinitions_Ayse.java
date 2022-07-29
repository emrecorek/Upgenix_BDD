package com.upgenix.step_definitions;

import com.upgenix.pages.LoginPage_Ayse;
import com.upgenix.pages.MainPage_Ayse;
import com.upgenix.utilities.Driver;
import com.upgenix.utilities.BrowserUtils;
import com.upgenix.utilities.ConfigurationReader;
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
    public void userIsOnTheUpgenixLoginWebPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("User enters correct email {string} - password {string} and hits enter")
    public void userEntersCorrectEmailPasswordAndHitsEnter(String email, String password) {
        loginPage_ayse.email.sendKeys(email);
        loginPage_ayse.password.sendKeys(password+Keys.ENTER);
    }

    @Then("User login and verify that the title contains {string}")
    public void userLoginAndVerifyThatTheTitleContains(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }

    @When("user clicks on more module from the homepage")
    public void userClicksOnMoreModuleFromTheHomepage() {
        mainPage_ayse.moreButton.click();
    }

    @And("user clicks on fleet option")
    public void userClicksOnFleetOption() {
        mainPage_ayse.fleetButton.click();
    }

    @And("user clicks on vehicles contracts button from vehicle page")
    public void userClicksOnVehiclesContractsButtonFromVehiclePage() {
        mainPage_ayse.vehicleContractsButton.click();
    }

    @And("user clicks on create button")
    public void userClicksOnCreateButton() {
        mainPage_ayse.createButton.click();
    }

    @Then("user verifies that the title contains {string}")
    public void userVerifiesThatTheTitleContains(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }

    @When("user chooses the option Audi\\/A{int}\\/{int}-AUD{int} from vehicle dropdown")
    public void userChoosesTheOptionAudiAAUDFromVehicleDropdown(int arg0, int arg1, int arg2) {
        Driver.getDriver().get("https://qa.upgenix.net/web?#id=&view_type=form&model=fleet.vehicle.log.contract&menu_id=146&action=163");
        mainPage_ayse.dropdownVehicle.click();
        mainPage_ayse.selectAudi.click();
    }

    @And("user chooses Leasing option from the type dropdown")
    public void userChoosesLeasingOptionFromTheTypeDropdown() {
        mainPage_ayse.dropdownType.click();
        mainPage_ayse.leasing.click();
    }

    @And("user can enter {string} as a valid amount in the Activation Cost case")
    public void userCanEnterAsAValidAmountInTheActivationCostCase(String arg0) {
        mainPage_ayse.activationCostInput.clear();
        mainPage_ayse.activationCostInput.sendKeys("129,90");
    }

    @And("user chooses the option Weekly from the Recurring Cost Amount dropdown and gives {string} as a valid recurring cost amount")
    public void userChoosesTheOptionWeeklyFromTheRecurringCostAmountDropdownAndGivesAsAValidRecurringCostAmount(String arg0) {
    Select select = new Select(mainPage_ayse.dropdowmRecurring);
    select.selectByVisibleText("Weekly");

    mainPage_ayse.recurringCostAmountInput.clear();
    mainPage_ayse.recurringCostAmountInput.sendKeys("9,90");
    }

    @And("user clicks on save button")
    public void userClicksOnSaveButton() {
        mainPage_ayse.saveButton.click();
    }

    @Then("user verify that the title contains {string}")
    public void userVerifyThatTheTitleContains(String string) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.titleContains("Audi/A1/1-AUD-001"));

        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }

    @Then("user sees : {string} error message")
    public void userSeesErrorMessage(String string) {
        Assert.assertTrue(mainPage_ayse.errorMessage.getText().contains(string));
    }

    @Then("user verify that title contains {string}")
    public void userVerifyThatTitleContains(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }

    @And("user clicks on vehicles contracts")
    public void userClicksOnVehiclesContracts() {
        mainPage_ayse.vehicleContractsButton.click();
    }

    @Then("user verifies that vehicle name is listed in vehicle contracts module")
    public void userVerifiesThatVehicleNameIsListedInVehicleContractsModule() {

    }
}
