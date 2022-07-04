package com.bluecrm.pages;

import com.bluecrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CompanyStructurePage {

    public CompanyStructurePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//input[@type='text']")
    public WebElement username;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement loginButton;


    @FindBy(xpath = "(//span[@data-role='item-text'])[10]")
    public WebElement employeeTab;

    @FindBy(xpath = "//span[.='Add department']")
    public WebElement addDepartmentTab;

    @FindBy(xpath = "(//span[.='Add department'])[2]")
    public WebElement addDepartmentTitle;


    @FindBy(xpath = "//input[@id='NAME']")
    public WebElement departmentNameInputBox;

    @FindBy(xpath = "//select[@id='IBLOCK_SECTION_ID']")
    public WebElement parentDepartmentDropdown;

    @FindBy(xpath = "(//span[.='Company Structure'])[2]")
    public WebElement companyStructure;

    @FindBy(xpath = "//span[.='Add']")
    public WebElement addButton;

    @FindBy(xpath = "//ul[@class='webform-error-list']")
    public WebElement sectionNameErrorMessage;

    @FindBy(xpath = "//span[.='Search']")
    public WebElement searchButton;

    @FindBy(xpath = "//input[contains(@id,'_user_input')]")
    public WebElement searchInputBox;


    @FindBy(xpath = "//span[.='Recent']")
    public WebElement recentButton;

    @FindBy(xpath = "//div[.='gyjasgd sdfasdfuk']")
    public WebElement recentDropdown;

    public void dropdownOption(String name) {
        Driver.getDriver().findElement(By.xpath("//div[.='" + name + "']"));
    }

    @FindBy(xpath = "(//div[@bx-tooltip-user-id='486'])[2]")
    public WebElement searchDropdown;

    @FindBy(xpath = "//span[.='Company']")
    public WebElement companyButton;


    @FindBy(className = "company-department-text")
    public WebElement companyDropdown;

    @FindBy(xpath = "(//div[.='add'])[2]")
    public WebElement addOption;

    @FindBy(xpath = "(//div[.='ff'])[2]")
    public WebElement ffOption;

    @FindBy(xpath = "(//div[.='Nick Owhadi'])[2]")
    public WebElement nickOption;

    @FindBy(xpath = "//span[@id='uf_head_name']")
    public WebElement nickOptionDisplayed;

    @FindBy(xpath = "//span[.='Close']")
    public WebElement closeButton;

    @FindBy(xpath = "//div[@id='popup-window-content-BXStructure']")
    public WebElement popupDepartmentContent;

    @FindBy(xpath = "//a[@class='department-profile-events-item department-profile-subsection']")
    //@FindBy(xpath = "//*[@id=\"bx_str_361\"]/div[1]/div[2]/div[3]")
    public WebElement addChildDepartment;


    @FindBy(xpath = "(//div[@class='structure-edit-icon'])[2]")

    public WebElement editDepartment;


    @FindBy(xpath = "(//div[@title='Delete department'])[2]")

    public WebElement deleteDepartment;

    @FindBy(xpath = "(//form[@method='POST'])[2]")
    public WebElement addedMessage;


    @FindBy(xpath = "//span[.='Save']")
    public WebElement saveButton;


    @FindBy(xpath = "(//div[.='Gurhan'])[1]")
    public WebElement recentOption;


}
