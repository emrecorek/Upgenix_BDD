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
    @FindBy(linkText = "Products")
    public WebElement productBtn;
    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createBtn;
    @FindBy(xpath = "//input[@name='name']")
    public WebElement productName;
    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveBtn;
    @FindBy(xpath = "//div[@class='o_notification_title']")
    public WebElement error;


}
