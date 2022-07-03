package com.bluecrm.step_definitions;

import com.bluecrm.pages.CompanyStructurePage;
import com.bluecrm.utilities.BrowserUtils;
import com.bluecrm.utilities.ConfigurationReader;
import com.bluecrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class CompanyStructureStepDef {

    CompanyStructurePage page = new CompanyStructurePage();

    @Given("user is on the login page of Bluecrm app")
    public void user_is_on_the_login_page_of_bluecrm_app() {

        Driver.getDriver().get(ConfigurationReader.getProperty("bluercrm.url"));

    }

    @When("user enters username {string}")
    public void user_enters_username(String string) {
        page.username.sendKeys(string);

    }

    @When("user enters password {string}")
    public void user_enters_password(String string) {
        page.password.sendKeys(string);
    }

    @When("user hits to login button")
    public void user_hits_to_login_button() {
        page.loginButton.click();
    }

    @Given("user clicks on the employee tab below Activity stream")
    public void userClicksOnTheEmployeeTabBelowActivityStream() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 3);

        page.employeeTab.click();

    }


    @And("user clicks on the {string}")
    public void userClicksOnThe(String arg0) {
        page.addDepartmentTab.click();

    }


    @And("user should observe the {string} title from the popped up table.")
    public void userShouldObserveTheTitleFromThePoppedUpTable(String arg0) {
        Assert.assertTrue(page.addDepartmentTitle.isDisplayed());
    }


    @And("user selects a parent  department from the department dropdown.")
    public void userSelectsAParentDepartmentFromTheDepartmentDropdown() {
        Select select = new Select(page.parentDepartmentDropdown);
        select.selectByValue("361");
        System.out.println("select.getFirstSelectedOption().getText() = " + select.getFirstSelectedOption().getText());
        String actualSelectedParentOption = select.getFirstSelectedOption().getText();
        String expectedParentDropdownOption = " .  . ff";

        Assert.assertEquals(expectedParentDropdownOption, actualSelectedParentOption);

    }


    @Given("user should be displaying the employee link below the Activity Stream")
    public void userShouldBeDisplayingTheEmployeeLinkBelowTheActivityStream() {
        Assert.assertTrue(page.employeeTab.isDisplayed());
    }

    @Then("user should be displaying the company structure")
    public void userShouldBeDisplayingTheCompanyStructure() {
        Assert.assertEquals(page.companyStructure.getText(), "Company Structure");

    }


    @And("user clicks add button")
    public void userClicksAddButton() {
        page.addButton.click();
    }


    @Then("user observe popped up error message")
    public void userObservePoppedUpErrorMessage() {
        Assert.assertTrue(page.sectionNameErrorMessage.isDisplayed());
    }


    @When("user clicks select from structure")
    public void userClicksSelectFromStructure() {
        Driver.getDriver().findElement(By.linkText("Select from structure")).click();

    }


    @And("Type any random letter or word in to above input box to search for the supervisor")
    public void typeAnyRandomLetterOrWordInToAboveInputBoxToSearchForTheSupervisor() {

        //  Actions action = new Actions(Driver.getDriver());
        //  action.doubleClick(page.searchInputBox);
        //   BrowserUtils.sleep(3);

        //  page.searchInputBox.click();
        page.searchButton.click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(page.searchInputBox));
        page.searchInputBox.click();
        BrowserUtils.sleep(3);
        page.searchInputBox.sendKeys("g");

    }


    @And("user should display the Search button and hits the search button")
    public void userShouldDisplayTheSearchButtonAndHitsTheSearchButton() {
        Assert.assertTrue(page.searchButton.isDisplayed());
        page.searchButton.click();
    }


    @Then("user selects an option from the list")
    public void userSelectsAnOptionFromTheList() {
        List<WebElement> dropdown = Driver.getDriver().findElements(By.xpath("//div[@class='finder-box-item-text']"));
        for (WebElement element : dropdown) {
            System.out.println("element.getText() = " + element.getText());
            if (element.getText().equalsIgnoreCase("Selcuk Ayhan")) {
                element.click();
            }
        }

    }

    @And("user should display the {string} button")
    public void userShouldDisplayTheButton(String arg0) {
        Assert.assertTrue(page.recentButton.isDisplayed());
        page.recentButton.click();
    }

    @Then("user selects an option from the select list")
    public void userSelectsAnOptionFromTheSelectList() {
        BrowserUtils.sleep(4);
        page.searchDropdown.click();

    }


    @And("user should display the company button and clicks the button")
    public void userShouldDisplayTheCompanyButtonAndClicksTheButton() {
        Assert.assertTrue(page.companyButton.isDisplayed());
        page.companyButton.click();

    }


    @Then("user selects an option from the company list and display the option")
    public void userSelectsAnOptionFromTheCompanyListAndDisplayTheOption() {
        page.companyDropdown.click();
        BrowserUtils.sleep(4);
        page.ffOption.click();
        BrowserUtils.sleep(4);
        page.addOption.click();
        BrowserUtils.sleep(4);
        page.nickOption.click();
        BrowserUtils.sleep(4);
        Assert.assertTrue(page.nickOptionDisplayed.isDisplayed());


    }

    @Then("user hits the close button any time before sending")
    public void userHitsTheCloseButtonAnyTimeBeforeSending() {
        page.closeButton.click();
        Assert.assertFalse(page.closeButton.isDisplayed());
    }


    @And("user should be  filling each input box before sending it")
    public void userShouldBeFillingEachInputBoxBeforeSendingIt() {
        page.departmentNameInputBox.sendKeys("hr");
        Select select = new Select(page.parentDepartmentDropdown);
        select.selectByValue("361");
        BrowserUtils.sleep(4);
         page.closeButton.click();
       // BrowserUtils.sleep(4);
       //  Assert.assertFalse(page.closeButton.isDisplayed());
    }

    @When("The {string} icon should be clickable and once clicked, it should bring out the {string} input box on display.")
    public void theIconShouldBeClickableAndOnceClickedItShouldBringOutTheInputBoxOnDisplay(String arg0, String arg1) {
        
    }

    @And("Once Hr User clicks on the {string} button, the user should display the pop-up message.")
    public void onceHrUserClicksOnTheButtonTheUserShouldDisplayThePopUpMessage(String arg0) {
        
    }

    @Then("Hr user should accepts the warning message and click {string} and delete the added child department.")
    public void hrUserShouldAcceptsTheWarningMessageAndClickAndDeleteTheAddedChildDepartment(String arg0) {
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(page.editDepartment).perform();

    }
}

