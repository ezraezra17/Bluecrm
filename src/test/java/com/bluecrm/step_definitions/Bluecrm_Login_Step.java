package com.bluecrm.step_definitions;

import com.bluecrm.pages.BasePage;
import com.bluecrm.utilities.ConfigurationReader;
import com.bluecrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Bluecrm_Login_Step {
    BasePage basePage = new BasePage();

    @Given("user is on the login page of Bluecrm app")
    public void user_is_on_the_login_page_of_bluecrm_app() {

        Driver.getDriver().get(ConfigurationReader.getProperty("bluercrm.url"));

    }

    @When("user enters username {string}")
    public void user_enters_username(String string) {
        basePage.username.sendKeys(string);

    }

    @When("user enters password {string}")
    public void user_enters_password(String string) {
        basePage.password.sendKeys(string);
    }

    @When("user hits to login button")
    public void user_hits_to_login_button() {
        basePage.loginButton.click();
    }

    @Then("user should see url contains {string}")
    public void user_should_see_url_contains(String string) {
      String actualUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(string));

    }

}
