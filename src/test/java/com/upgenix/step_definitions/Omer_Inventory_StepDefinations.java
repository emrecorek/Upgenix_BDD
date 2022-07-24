package com.upgenix.step_definitions;


import com.upgenix.pages.Omer_LoginPage;
import com.upgenix.pages.Omer_MainPage;
import com.upgenix.utilities.BrowserUtils;
import com.upgenix.utilities.ConfigurationReader;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Omer_Inventory_StepDefinations {
    Omer_MainPage Products = new Omer_MainPage();
    Omer_LoginPage login =new Omer_LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        String url= ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
    }
    @When("user enters SalesManager username")
    public void user_enters_sales_manager_username() {
        login.username.sendKeys("salesmanager15@info.com");

    }
    @When("user enters SalesManager password")
    public void user_enters_sales_manager_password() {
        login.password.sendKeys("salesmanager");

    }


    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        Assert.assertEquals("SalesManager15", login.usertext.getText());


    }
    @And("user click login button")
    public void userClickLoginButton() {
        login.loginBtn.click();
    }



    @When("user click inventory button")
    public void userClickInventoryButton() {
        Products.inventoryBtn.click();
        BrowserUtils.sleep(2);
    }

    @And("user click product button")
    public void userClickProductButton() {
        Products.productBtn.click();
        BrowserUtils.sleep(2);

    }

    @Then("User click create button")
    public void userClickCreateButton() {
        Products.createBtn.click();
        BrowserUtils.sleep(2);


    }




    @When("user leaves blank product name")
    public void userLeavesBlankProductName() {
    }

    @And("user click save button")
    public void userClickSaveButton() {
        Products.saveBtn.click();
    }

    @Then("user see error message {string}")
    public void userSeeErrorMessage(String arg0) {
    Assert.assertTrue(Products.error.getText().contains(arg0));
    }

    @Then("User success verify that title contains {string}")
    public void userSuccessVerifyThatTitleContains(String arg0) {
        String title=Driver.getDriver().getTitle();
        Assert.assertTrue(title.contains(arg0));
    }
}
