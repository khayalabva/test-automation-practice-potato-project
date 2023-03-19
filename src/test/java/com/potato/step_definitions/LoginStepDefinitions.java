package com.potato.step_definitions;

import com.potato.pages.UpgenixPage;
import com.potato.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginStepDefinitions {

    UpgenixPage upgenixPage = new UpgenixPage();

    @Given("user in on sign in page")
    public void user_is_on_sign_in_page() {
        Driver.getDriver().get("https://qa.upgenix.net/");
    }

    @When("user enters valid username {string}")
    public void user_enters_valid_username(String string) {
        upgenixPage.usernameInputBox.sendKeys(string);
    }

    @When("user enters valid password {string}")
    public void user_enters_valid_password(String string) {
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

    @When("user enters invalid username {string}")
    public void user_enters_invalid_username(String string) {
        upgenixPage.usernameInputBox.sendKeys(string);
    }

    @And("user enters invalid password {string}")
    public void user_enters_invalid_password(String string) {
        upgenixPage.passwordInputBox.sendKeys(string);
    }

    @Then("user should see WrongUsernameOrPassword message displayed")
    public void user_should_see_WrongUsernameOrPassword_message_displayed() {
        Assert.assertTrue(upgenixPage.wrongLoginOrPasswordMessage.isDisplayed());
    }



    //-----------------------------------------------------------------
    @Then("user should see PleaseFillOutThisField message displayed")
    public void userShouldSeePleaseFillOutThisFieldMessageDisplayed() {
        String validationMessage = upgenixPage.usernameInputBox.getAttribute("validationMessage");
        Assert.assertEquals(validationMessage, "Please fill out this field.");
    }

    @Then("user should see the the password in bullet signs by default")
    public void user_should_see_the_the_password_in_bullet_signs_by_default() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user pushes {string} button on the keyboard")
    public void user_pushes_button_on_the_keyboard(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
