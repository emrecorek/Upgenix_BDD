package com.upgenix.pages;

import com.upgenix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_Esra {

        public HomePage_Esra(){
            PageFactory.initElements(Driver.getDriver(),this);
        }

        @FindBy(xpath="//a[@data-menu='475']")
        public WebElement surveysModule;

        @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o-kanban-button-new']")
        public WebElement surveyCreateButton;

        @FindBy(xpath = "//div[@class='o_form_sheet']")
        public WebElement surveySheet;

        @FindBy(xpath = "//input[@placeholder='Survey Title']")
        public WebElement titleInput;

        @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
        public WebElement saveButton;

        @FindBy(xpath = "//div[@class='o_notification_title']")
        public WebElement errorMessage;

        @FindBy(xpath = "//div[@class='o_thread_message_content']")
        public WebElement createdMessage;

        @FindBy(xpath = "//input[@class='o_searchview_input']")
        public WebElement searchBox;

        @FindBy(xpath ="//button[@class='btn btn-primary btn-sm o_form_button_edit']")
        public WebElement editButton;

        @FindBy(xpath = "//div[@class='oe_kanban_color_0 oe_kanban_card oe_kanban_global_click o_kanban_record ui-sortable-handle']")
        public WebElement createdSurvey;
}
