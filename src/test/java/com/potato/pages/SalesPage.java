package com.potato.pages;

import com.potato.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesPage {
    public SalesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[@data-menu-xmlid='sale.sale_menu_root']")
    public WebElement salesButton;

    @FindBy(xpath = "//li/a[@data-menu='447']")
    public WebElement customersButton;

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createButton;


    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveButton;


}
