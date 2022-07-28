package com.upgenix.pages;

import com.upgenix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Omer_MainPage {
    public Omer_MainPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(linkText = "Inventory")
    public WebElement inventoryBtn;
    @FindBy(partialLinkText = "Products")
    public WebElement productBtn;
    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createBtn;
    @FindBy(xpath = "//input[@name='name']")
    public WebElement productName;
    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveBtn;
    @FindBy(xpath = "//div[@class='o_notification_title']")
    public WebElement error;

    @FindBy(xpath = "//input[@class='o_input' and @id='o_field_input_485']")
    public WebElement salesPrice;
    @FindBy(id = "o_field_input_484")
    public WebElement barcode;
    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchLine;
    @FindBy(xpath = "//strong[@class='o_kanban_record_title'][1]")
    public WebElement verifProdct;
    @FindBy(xpath = "//span[@name='name']")
    public WebElement Proverify;

    @FindBy(xpath = "//select[starts-with(@id, 'o_field_input')]")
    public WebElement type;






}
