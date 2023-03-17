package com.potato.step_definitions;

import com.potato.pages.UpgenixPage;
import com.potato.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {

    UpgenixPage upgenixPage = new UpgenixPage();

    @Given("user in on sign in page")
    public void user_is_on_sign_in_page() {
        Driver.getDriver().get("https://qa.upgenix.net/");
    }

    @When("user enters valid username")
    public void user_enters_valid_username() {
        upgenixPage.usernameInputBox.sendKeys("lolo");
    }
    @When("user enters valid password")
    public void user_enters_valid_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user clicks login button")
    public void user_clicks_login_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user should see a homepage")
    public void user_should_see_a_homepage() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user enters invalid username")
    public void user_enters_invalid_username() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user enters invalid password")
    public void user_enters_invalid_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("clicks login button")
    public void clicks_login_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user should see {string} message displayed")
    public void user_should_see_message_displayed(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
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
