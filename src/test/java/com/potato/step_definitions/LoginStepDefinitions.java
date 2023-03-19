package com.potato.step_definitions;

import com.potato.pages.UpgenixPage;
import com.potato.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;

public class LoginStepDefinitions {

    UpgenixPage upgenixPage = new UpgenixPage();

    @Given("user in on sign in page")
    public void user_is_on_sign_in_page() {
        Driver.getDriver().get("https://qa.upgenix.net/");
    }

    @When("user enters username {string}")
    public void user_enters_username(String string) {
        upgenixPage.usernameInputBox.sendKeys(string);
    }

    @When("user enters password {string}")
    public void user_enters_password(String string) {
        upgenixPage.passwordInputBox.sendKeys(string);
    }

    @When("user clicks login button")
    public void user_clicks_login_button() {
        upgenixPage.loginButton.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    }

    @Then("user should see a homepage")
    public void user_should_see_a_homepage() {
        Assert.assertTrue(upgenixPage.homePageText.isDisplayed());
    }

    @Then("user should see WrongUsernameOrPassword message displayed")
    public void user_should_see_WrongUsernameOrPassword_message_displayed() {
        Assert.assertTrue(upgenixPage.wrongLoginOrPasswordMessage.isDisplayed());
    }

    @Then("user should see PleaseFillOutThisField message displayed")
    public void userShouldSeePleaseFillOutThisFieldMessageDisplayed() {
        String validationMessage = upgenixPage.usernameInputBox.getAttribute("validationMessage");
        Assert.assertEquals(validationMessage, "Please fill out this field.");
    }

    @Then("user should see the the password in bullet signs by default")
    public void user_should_see_the_the_password_in_bullet_signs_by_default() {
        Assert.assertTrue(upgenixPage.passwordInputBox.getAttribute("type").equals("password") );

    }

    @And("user pushes ENTER button on the keyboard")
    public void user_pushes_ENTER_button_on_the_keyboard(){
        upgenixPage.passwordInputBox.sendKeys(Keys.ENTER);
    }
}
