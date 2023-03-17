package com.potato.pages;

import com.potato.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpgenixPage {

    public UpgenixPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="login")
    public WebElement usernameInputBox;

    @FindBy(name="password")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;


}
