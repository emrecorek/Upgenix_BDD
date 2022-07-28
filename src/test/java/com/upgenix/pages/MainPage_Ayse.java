package com.upgenix.pages;

import com.upgenix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class MainPage_Ayse {

public MainPage_Ayse(){
    PageFactory.initElements(Driver.getDriver(), this);
}

@FindBy(xpath = "//li[@id='menu_more_container']")
    public WebElement moreButton;

@FindBy(xpath = "//a[@data-menu='134']")
    public WebElement fleetButton;

@FindBy(xpath = "//a[@data-action-id='163']")
    public WebElement vehicleContractsButton;

@FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_list_button_add']")
    public WebElement createButton;

@FindBy(xpath = "//input[@id='o_field_input_71']")
    public WebElement vehicleInputBox;

// need one more locator


@FindBy(xpath = "//input[@id='o_field_input_72']")
    public WebElement typeInputBox;

// need one more locator

@FindBy(xpath = "//input[@id='o_field_input_16']")
    public WebElement activationCostInput;

@FindBy(xpath = "//input[@id='o_field_input_17']")
    public WebElement recurringCostAmountInput;

//need one more locator

@FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveButton;

@FindBy(xpath = "//div[@class='o_notification_manager']")
    public WebElement errorMessage;

    @FindBy(className = "o_loading")
    public WebElement loadingAlert;

    //@FindBy(xpath = "(//span[@class='o_dropdown_button'])[1]") ----> it works as well
    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[1]")
    public WebElement dropdownVehicle;

    @FindBy(xpath = "//a[.='Audi/A1/1-AUD-001']")
    public WebElement selectAudi;

    // @FindBy(xpath = "//input[@id='o_field_input_15']")
    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[2]")
    public WebElement dropdownType;

    @FindBy(xpath = "//a[.='Leasing']")
    public WebElement leasing;

    @FindBy(id = "o_field_input_18")
    public WebElement dropdowmRecurring;

















}
