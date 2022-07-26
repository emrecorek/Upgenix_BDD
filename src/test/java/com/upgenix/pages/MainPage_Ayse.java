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








}
