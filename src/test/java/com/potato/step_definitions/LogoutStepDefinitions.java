package com.potato.step_definitions;

import com.potato.pages.UpgenixPage;
import com.potato.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import com.potato.utilities.BrowserUtils;

import java.util.Set;

public class LogoutStepDefinitions {
    UpgenixPage upgenixPage = new UpgenixPage();
    @Given("user in on home page")
    public void user_in_on_home_page() {
        Driver.getDriver().get("https://qa.upgenix.net/");
        upgenixPage.usernameInputBox.sendKeys("salesmanager15@info.com");
        upgenixPage.passwordInputBox.sendKeys("salesmanager");
        upgenixPage.passwordInputBox.sendKeys(Keys.ENTER);

    }
    @When("user clicks to his username on the top right")
    public void user_clicks_to_his_username_on_the_top_right() {
        upgenixPage.usernameButtonOnHomePage.click();
    }

    @When("user clicks logout button")
    public void user_clicks_logout_button() {
        upgenixPage.logoutButton.click();
    }
    @Then("user ends up on the login page")
    public void user_ends_up_on_the_login_page() {

       String expectedTitle = "Login | Best solution for startups";
       Assert.assertEquals(Driver.getDriver().getTitle(),expectedTitle);
    }

    @When("user clicks back button")
    public void user_clicks_back_button() {
        Driver.getDriver().navigate().back();
    }

    @Then("user sees SessionExpired message displayed")
    public void user_sees_session_expired_message_displayed() {
       Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//h4[@class='modal-title']")).isDisplayed());
    }

    @When("user closes the only open tab")
    public void user_closes_the_only_open_tab() {
        Driver.closeDriver();
    }

    @When("user opens a new tab and goes to the homepage")
    public void user_opens_a_new_tab_and_goes_to_the_homepage() {

        // Driver.getDriver().switchTo().window(Driver.getDriver().getWindowHandle());
        // BrowserUtils.switchToWindow("https://qa.upgenix.net/");

        Driver.getDriver().get("https://qa.upgenix.net/");


    }
}
