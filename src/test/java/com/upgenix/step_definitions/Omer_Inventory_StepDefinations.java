package com.upgenix.step_definitions;



import com.github.javafaker.Faker;
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
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Omer_Inventory_StepDefinations {
    Omer_MainPage Products = new Omer_MainPage();
    Omer_LoginPage login =new Omer_LoginPage();

    Faker faker = new Faker();
     String newProo="iphone 13 pro max";
     String servicePro="gamer16";



    String barcodeFake=String.valueOf(faker.numerify("#######"));
    String salesFake=String.valueOf(faker.numerify("###"+"."+"0"));




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
        BrowserUtils.sleep(4);
    }

    @And("user click product button")
    public void userClickProductButton() {
        Products.productBtn.click();
        BrowserUtils.sleep(3);

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
        BrowserUtils.sleep(3);
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

    @Then("User add product name, sales price , and barcode")
    public void userAddProductNameSalesPriceAndBarcode() {

        Products.productName.sendKeys(newProo);
        Products.barcode.sendKeys(barcodeFake);
        BrowserUtils.sleep(3);
        Products.salesPrice.click();
        Products.salesPrice.clear();
        Products.salesPrice.sendKeys(salesFake);

    }

    @And("user verify the page title includes the Product name.")
    public void userVerifyThePageTitleIncludesTheProductName() {
        Assert.assertTrue(newProo.contains(Products.Proverify.getText()));
    }

    @And("user click search line")
    public void userClickSearchLine() {

        Products.searchLine.sendKeys(newProo+ Keys.ENTER);
        BrowserUtils.sleep(3);
    }

    @And("verify the product")
    public void verifyTheProduct() {
        BrowserUtils.waitForClickablility(Products.verifProdct, 5);
        Assert.assertTrue(Products.verifProdct.getText().equals(newProo));

    }

    @Then("User add product name, sales price , and barcode and product Type")
    public void userAddProductNameSalesPriceAndBarcodeAndProductType() {
        Products.productName.sendKeys(servicePro);
        Products.barcode.sendKeys(barcodeFake);
        BrowserUtils.sleep(3);
        Products.salesPrice.click();
        Products.salesPrice.clear();
        Products.salesPrice.sendKeys(salesFake);
        BrowserUtils.sleep(3);
        Select select=new Select(Products.type);
        select.selectByVisibleText("Service");




    }

    @And("verify the product search line")
    public void verifyTheProductSearchLine() {

        Products.productBtn.click();
        BrowserUtils.sleep(5);
        Products.searchLine.sendKeys(servicePro+ Keys.ENTER);
        BrowserUtils.sleep(3);
        BrowserUtils.waitForClickablility(Products.verifProdct, 10);
        Assert.assertTrue(Products.verifProdct.getText().equals(servicePro));
    }
}
