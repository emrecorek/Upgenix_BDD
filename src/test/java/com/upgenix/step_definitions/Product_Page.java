package com.upgenix.step_definitions;


import com.upgenix.pages.Products;
import com.upgenix.utilities.BrowserUtils;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Product_Page {
    Products Products = new Products();

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


    @Then("User success verifies that title contains {string}")
    public void userSuccessVerifiesThatTitleContains(String arg0) {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = arg0;
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }
}
