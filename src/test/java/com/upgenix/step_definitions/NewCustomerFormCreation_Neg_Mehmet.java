package com.upgenix.step_definitions;

import com.upgenix.pages.MainPage_Mehmet;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NewCustomerFormCreation_Neg_Mehmet {

    MainPage_Mehmet mainPage = new MainPage_Mehmet();

    @When("User clicks form sheet Create button")
    public void user_clicks_form_sheet_create_button() {
        mainPage.formSheetCreateButton.click();
    }
    @When("User clicks save button")
    public void user_clicks_save_button() {
       mainPage.saveButton.click();
    }
    @Then("User sees {string} warning message")
    public void user_sees_warning_message(String string) {
        Assert.assertTrue(mainPage.warningMessage.getText().contains(string));
    }

}
