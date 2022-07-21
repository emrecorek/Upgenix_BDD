package com.upgenix.pages;

import com.upgenix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Products {
    public Products() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(linkText = "Inventory")
    public WebElement inventoryBtn;
    @FindBy(linkText = "Products")
    public WebElement productBtn;
    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createBtn;

}
