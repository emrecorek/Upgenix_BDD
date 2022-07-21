package com.upgenix.pages;

import com.upgenix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage_Mehmet {

    public MainPage_Mehmet(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@data-menu='445']")
    public WebElement salesButton;

    @FindBy(xpath = "//a[@data-menu='447']")
    public WebElement customerButton;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o-kanban-button-new btn-default']")
    public WebElement createButton;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o-kanban-button-new']")
    public WebElement formSheetCreateButton;

    @FindBy(xpath = "//button[.='Save  & Close']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='o_notification_title']")
    public WebElement warningMessage;

    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement name;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement save;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_edit']")
    public WebElement edit;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement search;

    @FindBy(xpath = "(//strong[@class='o_kanban_record_title oe_partner_heading'])[1]")
    public WebElement searchedName;






}
