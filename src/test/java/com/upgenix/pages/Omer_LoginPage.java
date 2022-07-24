package com.upgenix.pages;

import com.upgenix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Omer_LoginPage {
    public Omer_LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "login")
    public WebElement username;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginBtn;
    @FindBy(linkText = "SalesManager15")
    public WebElement usertext;

}
