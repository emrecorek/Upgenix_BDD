package com.upgenix.pages;

import com.upgenix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Esra {

    public LoginPage_Esra(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "login")
    public WebElement emailInput;


    @FindBy(id = "password")
    public WebElement passwordInput;


    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;
}

