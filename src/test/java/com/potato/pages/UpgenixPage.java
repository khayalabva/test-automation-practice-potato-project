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

    @FindBy(xpath = "//div[@class='o_thread_title']")
    public WebElement homePageText;

    @FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement wrongLoginOrPasswordMessage;





}
